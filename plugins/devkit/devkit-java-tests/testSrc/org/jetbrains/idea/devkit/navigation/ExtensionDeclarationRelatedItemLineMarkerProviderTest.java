/*
 * Copyright 2000-2017 JetBrains s.r.o.
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
package org.jetbrains.idea.devkit.navigation;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.idea.devkit.DevkitJavaTestsUtil;

@TestDataPath("$CONTENT_ROOT/testData/navigation/extensionDeclaration")
public class ExtensionDeclarationRelatedItemLineMarkerProviderTest extends ExtensionDeclarationRelatedItemLineMarkerProviderTestBase {
  @Override
  protected String getBasePath() {
    return DevkitJavaTestsUtil.TESTDATA_PATH + "navigation/extensionDeclaration";
  }

  public void testInvalidExtension() {
    doTestInvalidExtension("MyInvalidExtension.java");
  }

  public void testExtension() {
    doTestExtension("MyExtension.java", "<myEp implementation=\"MyExtension\"/>");
  }

  public void testNestedClassExtension() {
    doTestExtension("MyNestedClassExtension.java", "<myEp implementation=\"MyNestedClassExtension$Nested\"/>");
  }
}
