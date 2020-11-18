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
package com.helger.commons.codec;

import java.io.Serializable;

import javax.annotation.Nullable;

/**
 * The most basic decoding interface
 *
 * @author Philip Helger
 * @param <SRCTYPE>
 *        Source data type
 * @param <DSTTYPE>
 *        Destination data type
 */
@FunctionalInterface
public interface IDecoder <SRCTYPE, DSTTYPE> extends Serializable
{
  /**
   * Decode the passed source object
   *
   * @param aInput
   *        The source object to be decoded
   * @return The decoded value.
   * @throws DecodeException
   *         in case something goes wrong
   */
  @Nullable
  DSTTYPE getDecoded (@Nullable SRCTYPE aInput);
}