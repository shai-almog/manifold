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

package manifold.ext.delegation;

import manifold.api.util.IssueMsg;

public class DelegationIssueMsg
{
  public static final IssueMsg MSG_NO_INTERFACES = new IssueMsg( "{0} does not have interfaces in common with {1}" );
  public static final IssueMsg MSG_ONLY_INTERFACES_HERE = new IssueMsg( "Only interfaces allowed here" );
  public static final IssueMsg MSG_INTERFACE_OVERLAP = new IssueMsg( "Interface '{0}' found in multiple links: {1}. Use {0} with just one link or implement it directly." );
  public static final IssueMsg MSG_METHOD_OVERLAP = new IssueMsg( "Method '{0}' found in multiple links '{1}', this method must be implemented directly" );
  public static final IssueMsg MSG_DELEGATE_STATIC_FIELD = new IssueMsg( "@link is not supported on static members" );
  public static final IssueMsg MSG_MODIFIER_REDUNDANT_FOR_LINK = new IssueMsg( "Modifier '{0}' is redundant for part links" );
  public static final IssueMsg MSG_MODIFIER_NOT_ALLOWED_HERE = new IssueMsg( "Modifier '{0}' not allowed here" );
  public static final IssueMsg MSG_PASSING_CONCRETE_PART = new IssueMsg( "Passing a part as a non-interface argument" );
}