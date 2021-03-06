/*
 * Sonar Dependency Check Plugin
 * Copyright (C) 2013 Porsche Informatik
 * dev@sonar.codehaus.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sonar.plugins.dependencycheck;

import org.sonar.api.web.Page;
import org.sonar.api.web.NavigationSection;
import org.sonar.api.web.UserRole;

/**
 * Configuration for licenses and dependencies.
 */
@NavigationSection(NavigationSection.CONFIGURATION)
@UserRole(UserRole.ADMIN)
public class DependencyCheckConfigurationPage implements Page {

  @Override
  public String getId() {
    return "/dependencycheck_configuration";
  }

  @Override
  public String getTitle() {
    return "Dependency Check";
  }

}
