/*
 * Created on Feb 7, 2011
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * Copyright @2011 the original author or authors.
 */
package org.fest.assertions.condition;

import java.util.Collection;

import org.fest.assertions.core.Matcher;

/**
 * Concrete test class for {@link Join}.
 *
 * @author Yvonne Wang
 */
public class ConcreteJoin extends Join<Object> {

  public ConcreteJoin(Matcher<Object>... conditions) {
    super(conditions);
  }

  public ConcreteJoin(Collection<Matcher<Object>> conditions) {
    super(conditions);
  }

  @Override
  public boolean matches(Object value) {
    return false;
  }
}
