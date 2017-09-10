/*
 * Sonar Windup Plugin
 * Copyright (C) 2017 Keyhole Software
 * asktheteam@keyholesoftware.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.keyholesoftware.plugins.windup;

import static java.util.Arrays.asList;

import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;


/**
 * This class is the entry point for all extensions. It is referenced in pom.xml.
 */
public class WindupPlugin implements Plugin {

  @Override
  public void define(Context context) {
    // tutorial on hooks
    // http://docs.sonarqube.org/display/DEV/Adding+Hooks
    ////////context.addExtensions(DisplayIssuesInScanner.class, DisplayQualityGateStatus.class);

    // tutorial on languages
    //context.addExtensions(FooLanguage.class, FooQualityProfile.class);
    //context.addExtension(FooLanguageProperties.getProperties());

    // tutorial on measures
//    context
//      .addExtensions(ExampleMetrics.class, SetSizeOnFilesSensor.class, ComputeSizeAverage.class, ComputeSizeRating.class);

    // tutorial on rules
//    context.addExtensions(JavaRulesDefinition.class, CreateIssuesOnJavaFilesSensor.class);
//    context.addExtensions(FooLintRulesDefinition.class, FooLintIssuesLoaderSensor.class);

    // tutorial on settings
//    context
//      .addExtensions(HelloWorldProperties.getProperties())
//      .addExtension(SayHelloFromScanner.class);

    // tutorial on web extensions
//    context.addExtension(MyPluginPageDefinition.class);

//    context.addExtensions(asList(
//      PropertyDefinition.builder("sonar.foo.file.suffixes")
//        .name("Suffixes FooLint")
//        .description("Suffixes supported by FooLint")
//        .category("FooLint")
//        .defaultValue("")
//        .build()));
  }
}
