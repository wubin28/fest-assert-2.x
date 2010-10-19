/*
 * Created on Sep 10, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this String except in compliance with
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
package org.fest.assertions.formatting;

import static org.fest.util.Strings.quote;

/**
 * Returns the {@code String} representation of a <code>{@link String}</code>.
 *
 * @author Alex Ruiz
 */
class StringToStringRule extends GenericToStringRule<String> {

  @Override String doGetToString(String s) {
    return quote(s);
  }

  @Override Class<String> supportedType() {
    return String.class;
  }
}