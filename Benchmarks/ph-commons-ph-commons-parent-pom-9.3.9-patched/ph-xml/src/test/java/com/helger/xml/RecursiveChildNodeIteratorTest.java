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
package com.helger.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Test class for class {@link RecursiveChildNodeIterator}.
 *
 * @author Philip Helger
 */
public final class RecursiveChildNodeIteratorTest
{
  @Test
  public void testBasic ()
  {
    final Document doc = XMLFactory.newDocument ();

    // No children present
    assertFalse (new RecursiveChildNodeIterator (doc).hasNext ());

    // 1 child
    final Element eRoot = (Element) doc.appendChild (doc.createElement ("root"));
    int nCount = 0;
    for (final Node aNode : new RecursiveChildNodeIterator (doc))
    {
      assertNotNull (aNode);
      ++nCount;
    }
    assertEquals (1, nCount);

    // 2 children
    eRoot.appendChild (doc.createTextNode ("Hallo Welt"));
    nCount = 0;
    final RecursiveChildNodeIterator it = new RecursiveChildNodeIterator (doc);
    for (final Node aNode : it)
    {
      assertNotNull (aNode);
      ++nCount;
    }
    assertEquals (2, nCount);

    try
    {
      it.remove ();
      fail ();
    }
    catch (final UnsupportedOperationException ex)
    {}
  }

  @SuppressWarnings ("unused")
  @Test
  public void testError ()
  {
    try
    {
      new RecursiveChildNodeIterator (null);
      fail ();
    }
    catch (final NullPointerException ex)
    {}
  }
}
