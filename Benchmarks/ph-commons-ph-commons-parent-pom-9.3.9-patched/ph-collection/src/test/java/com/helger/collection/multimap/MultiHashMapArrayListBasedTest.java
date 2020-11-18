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
 * Test class for class {@link MultiHashMapArrayListBased}.
 *
 * @author Philip Helger
 */
public final class MultiHashMapArrayListBasedTest extends AbstractMultiMapTestCase
{
  @Test
  public void testAll ()
  {
    MultiHashMapArrayListBased <String, String> aMultiMap = new MultiHashMapArrayListBased <> ();
    testEmpty (aMultiMap);
    aMultiMap = new MultiHashMapArrayListBased <> (getKey1 (), getValue1 ());
    testOne (aMultiMap);
    aMultiMap = new MultiHashMapArrayListBased <> (getKey1 (), getValueList1 ());
    testOne (aMultiMap);
    aMultiMap = new MultiHashMapArrayListBased <> (getMapList1 ());
    testOne (aMultiMap);
    aMultiMap = new MultiHashMapArrayListBased <> ();
    testList (aMultiMap);
  }
}
