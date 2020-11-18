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

import com.helger.commons.collection.impl.ICommonsSet;

/**
 * Interface for a multi map that uses a {@link ICommonsSet} for the storage.
 *
 * @author Philip Helger
 * @param <KEYTYPE>
 *        Key type
 * @param <VALUETYPE>
 *        Element type
 * @param <COLLTYPE>
 *        Set type containing value types
 */
public interface IMultiMapSetBased <KEYTYPE, VALUETYPE, COLLTYPE extends ICommonsSet <VALUETYPE>> extends
                                   IMultiMap <KEYTYPE, VALUETYPE, COLLTYPE>
{
  /* empty */
}
