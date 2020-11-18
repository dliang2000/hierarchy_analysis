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
package com.helger.commons.script;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Helper class for javax.script package.
 * 
 * @author Philip Helger
 */
@Immutable
public final class ScriptHelper
{
  public static final Charset DEFAULT_SCRIPT_CHARSET = StandardCharsets.ISO_8859_1;

  private static final ScriptEngineManager s_aScriptFactory = new ScriptEngineManager ();

  private ScriptHelper ()
  {}

  @Nonnull
  public static ScriptEngine createNashornEngine ()
  {
    // create a Nashorn script engine
    return s_aScriptFactory.getEngineByName ("nashorn");
  }
}
