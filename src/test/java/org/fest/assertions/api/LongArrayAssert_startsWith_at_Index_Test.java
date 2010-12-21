/*
 * Created on Dec 20, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.api;

import static junit.framework.Assert.assertSame;
import static org.fest.assertions.test.LongArrayFactory.*;
import static org.mockito.Mockito.*;

import org.fest.assertions.internal.LongArrays;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for <code>{@link LongArrayAssert#startsWith(long...)}</code>.
 *
 * @author Alex Ruiz
 */
public class LongArrayAssert_startsWith_at_Index_Test {

  private LongArrays arrays;
  private LongArrayAssert assertions;

  @Before public void setUp() {
    arrays = mock(LongArrays.class);
    assertions = new LongArrayAssert(emptyArray());
    assertions.arrays = arrays;
  }

  @Test public void should_verify_that_actual_starts_with_sequence() {
    assertions.startsWith(6L, 8L);
    verify(arrays).assertStartsWith(assertions.info, assertions.actual, array(6L, 8L));
  }

  @Test public void should_return_this() {
    LongArrayAssert returned = assertions.startsWith(8L);
    assertSame(assertions, returned);
  }
}