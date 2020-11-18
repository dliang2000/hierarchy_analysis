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
package com.helger.commons.io.resourceprovider;

import javax.annotation.concurrent.Immutable;

/**
 * The default resource provider. Checks in the following provider:
 * <ol>
 * <li>URL</li>
 * <li>File</li>
 * <li>Classpath</li>
 * </ol>
 * This resource provider is very slow, as it tries many different resource
 * providers at once.
 *
 * @author Philip Helger
 */
@Immutable
public class DefaultResourceProvider extends WritableResourceProviderChain
{
  public DefaultResourceProvider ()
  {
    super (new URLResourceProvider (), new FileSystemResourceProvider (), new ClassPathResourceProvider ());
  }
}
