/*
 * Copyright (c) 2023 - Manifold Systems LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package manifold.ext.delegation.parts.superinterfacecall;

import manifold.ext.delegation.rt.api.part;

public @part class APart implements A
{
  @Override
  public String getName( String name )
  {
    return "A" + name;
  }

  @Override
  public String stuff( String name1, String name2 )
  {
    return A.super.stuff( name1, name2 );
  }
}
