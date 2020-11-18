/**
 * Copyright (C) 2014-2019 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.collection.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.collection.impl.CommonsConcurrentHashMap;
import com.helger.commons.collection.impl.ICommonsCollection;
import com.helger.commons.collection.impl.ICommonsList;
import com.helger.commons.collection.impl.ICommonsMap;
import com.helger.commons.collection.impl.ICommonsNavigableSet;
import com.helger.commons.collection.impl.ICommonsOrderedSet;
import com.helger.commons.collection.impl.ICommonsSet;

/**
 * Abstract class for class {@link IMultiMap} implementations.
 *
 * @author Philip Helger
 */
public abstract class AbstractMultiMapTestCase
{
  @Nonnull
  protected final String getKey1 ()
  {
    return "Philip";
  }

  @Nonnull
  protected final String getValue1 ()
  {
    return "Wien";
  }

  @Nonnull
  protected final ICommonsList <String> getValueList1 ()
  {
    return CollectionHelper.newList (getValue1 ());
  }

  @Nonnull
  protected final ICommonsSet <String> getValueSet1 ()
  {
    return CollectionHelper.newSet (getValue1 ());
  }

  @Nonnull
  protected final ICommonsOrderedSet <String> getValueSetOrdered1 ()
  {
    return CollectionHelper.newOrderedSet (getValue1 ());
  }

  @Nonnull
  protected final ICommonsNavigableSet <String> getValueSetNavigable1 ()
  {
    return CollectionHelper.newSortedSet (getValue1 ());
  }

  @Nonnull
  protected final ICommonsMap <String, ICommonsList <String>> getMapList1 ()
  {
    return CollectionHelper.newMap (getKey1 (), getValueList1 ());
  }

  @Nonnull
  protected final ICommonsMap <String, ICommonsSet <String>> getMapSet1 ()
  {
    return CollectionHelper.newMap (getKey1 (), getValueSet1 ());
  }

  @Nonnull
  protected final ICommonsMap <String, ICommonsOrderedSet <String>> getMapSetOrdered1 ()
  {
    return CollectionHelper.newMap (getKey1 (), getValueSetOrdered1 ());
  }

  @Nonnull
  protected final ICommonsMap <String, ICommonsNavigableSet <String>> getMapSetNavigable1 ()
  {
    return CollectionHelper.newMap (getKey1 (), getValueSetNavigable1 ());
  }

  protected final <COLLTYPE extends ICommonsCollection <String>> void testEmpty (final IMultiMap <String, String, COLLTYPE> aMultiMap)
  {
    assertTrue (aMultiMap.isEmpty ());
    aMultiMap.putSingle (getKey1 (), getValue1 ());
    testOne (aMultiMap);
  }

  protected final <COLLTYPE extends ICommonsCollection <String>> void testOne (final IMultiMap <String, String, COLLTYPE> aMultiMap)
  {
    assertEquals (1, aMultiMap.size ());
    aMultiMap.putSingle ("Boris", "Wien");
    assertEquals (2, aMultiMap.size ());
    aMultiMap.putSingle ("Philip", "Copenhagen");
    assertEquals (2, aMultiMap.size ());
    aMultiMap.putSingle ("Philip", "Copenhagen");
    assertEquals (2, aMultiMap.size ());

    Collection <String> aCont = aMultiMap.get ("Philip");
    assertNotNull (aCont);
    assertEquals (aCont instanceof List ? 3 : 2, aCont.size ());

    aCont = aMultiMap.get ("Boris");
    assertNotNull (aCont);
    assertEquals (1, aCont.size ());

    aCont = aMultiMap.get ("Anyone");
    assertNull (aCont);

    final Map <String, String> aMap = new CommonsConcurrentHashMap <> ();
    aMap.put ("Philip", "Vienna");
    aMap.put ("Rene", "Essling");
    assertEquals (2, aMap.size ());

    aMultiMap.putAllIn (aMap);
    assertEquals (3, aMultiMap.size ());

    aCont = aMultiMap.get ("Philip");
    assertNotNull (aCont);
    assertEquals (aCont instanceof List ? 4 : 3, aCont.size ());

    assertTrue (aMultiMap.containsSingle ("Philip", "Wien"));
    assertTrue (aMultiMap.removeSingle ("Philip", "Wien").isChanged ());
    assertFalse (aMultiMap.containsSingle ("Philip", "Wien"));
    assertFalse (aMultiMap.removeSingle ("Philip", "Wien").isChanged ());
    assertFalse (aMultiMap.containsSingle ("Alice", "Wien"));
    assertFalse (aMultiMap.removeSingle ("Alice", "Wien").isChanged ());
    assertEquals (3, aMultiMap.size ());
  }

  protected final void testList (final IMultiMapListBased <String, String> aMultiMap)
  {
    assertEquals (0, aMultiMap.size ());
    aMultiMap.putSingle ("Philip", "Copenhagen");
    assertEquals (1, aMultiMap.size ());
    aMultiMap.putSingle ("Philip", "Eisenstadt", 0);
    assertEquals (1, aMultiMap.size ());
    aMultiMap.putSingle ("Philip", "Brüssel", 1);
    assertEquals (1, aMultiMap.size ());

    List <String> aCont = aMultiMap.get ("Philip");
    assertNotNull (aCont);
    assertEquals (3, aCont.size ());

    assertEquals ("Eisenstadt", aCont.get (0));
    assertEquals ("Brüssel", aCont.get (1));
    assertEquals ("Copenhagen", aCont.get (2));

    aCont = aMultiMap.get ("Anyone");
    assertNull (aCont);
  }
}
