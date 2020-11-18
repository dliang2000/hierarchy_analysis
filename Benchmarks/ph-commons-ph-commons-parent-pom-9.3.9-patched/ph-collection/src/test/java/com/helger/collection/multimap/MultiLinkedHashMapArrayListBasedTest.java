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

import org.junit.Test;

/**
 * Test class for class {@link MultiLinkedHashMapArrayListBased}.
 *
 * @author Philip Helger
 */
public final class MultiLinkedHashMapArrayListBasedTest extends AbstractMultiMapTestCase
{
  @Test
  public void testAll ()
  {
    MultiLinkedHashMapArrayListBased <String, String> aMultiMap = new MultiLinkedHashMapArrayListBased <> ();
    testEmpty (aMultiMap);
    aMultiMap = new MultiLinkedHashMapArrayListBased <> (getKey1 (), getValue1 ());
    testOne (aMultiMap);
    aMultiMap = new MultiLinkedHashMapArrayListBased <> (getKey1 (), getValueList1 ());
    testOne (aMultiMap);
    aMultiMap = new MultiLinkedHashMapArrayListBased <> (getMapList1 ());
    testOne (aMultiMap);
    aMultiMap = new MultiLinkedHashMapArrayListBased <> ();
    testList (aMultiMap);
  }
}
