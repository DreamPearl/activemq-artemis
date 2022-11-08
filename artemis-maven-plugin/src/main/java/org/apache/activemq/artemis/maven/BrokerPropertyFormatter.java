/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.artemis.maven;

import org.apache.activemq.artemis.api.config.BrokerProperty;

import java.util.Collection;

public abstract class BrokerPropertyFormatter {

   public static final String PROPERTIES_PROPERTY = ".properties.{PROPERTY}";
   public static final String PROPERTIES = "Properties";
   public static final String PROPERTY = "property";
   public static final String A_SET_OF_KEY_VALUE_PAIRS_SPECIFIC_TO_EACH_NAMED_PROPERTY_SEE_ABOVE_DESCRIPTION = "A set of Key value pairs specific to each named property, see above description";

   enum FormatType {
      MARKDOWN;
   }

   public static BrokerPropertyFormatter getFormatter(String format) {
      FormatType type = FormatType.valueOf(format);
      if (type.equals(FormatType.MARKDOWN)) {
         return new MarkdownFormatter();
      }
      throw new RuntimeException(type + " not found");
   }

   public String getOutput(BrokerProperties properties) {
      StringBuffer buffer = new StringBuffer();
      addTitle(buffer);
      printProperties(buffer, properties.properties.values());

      for (BrokerProperties nestedConfigProperty : properties.nestedConfigProperties.values()) {
         addSubTitle(buffer, nestedConfigProperty.getName());
         printNestedProperties(buffer, nestedConfigProperty);
      }
      return buffer.toString();
   }

   private void printProperties(StringBuffer buffer, Collection<BrokerPropertyDescription> properties) {
      for (BrokerPropertyDescription property : properties) {
         printProperty(buffer, property.getPropertyName(), property.getPropertyType(), property.getDefaultConfig(), property.getXmlName(), property.getDocs());

         if (property.getBrokerProperty().type() == BrokerProperty.PROPERTIES) {
            printProperty(buffer, property.getPrefix() + PROPERTIES_PROPERTY, PROPERTIES, "", PROPERTY, A_SET_OF_KEY_VALUE_PAIRS_SPECIFIC_TO_EACH_NAMED_PROPERTY_SEE_ABOVE_DESCRIPTION);
         }
      }

   }

   private void printNestedProperties(StringBuffer buffer, BrokerProperties properties) {
      for (BrokerPropertyDescription property : properties.properties.values()) {
         printProperty(buffer, property.getPrefix() + property.getPropertyName(), property.getPropertyType(), property.getDefaultConfig(), property.getXmlName(), property.getDocs());

         if (property.getBrokerProperty().type() == BrokerProperty.PROPERTIES) {
            printProperty(buffer, property.getPrefix() + PROPERTIES_PROPERTY, PROPERTIES, "", PROPERTY, A_SET_OF_KEY_VALUE_PAIRS_SPECIFIC_TO_EACH_NAMED_PROPERTY_SEE_ABOVE_DESCRIPTION);
         }

         if (property.getBrokerProperty().type() == BrokerProperty.OBJECT || property.getBrokerProperty().type() == BrokerProperty.MAP) {
            BrokerProperties brokerProperties = properties.nestedConfigProperties.get(property.getPropertyType());
            printNestedProperties(buffer, brokerProperties);
         }
      }
   }


   abstract void printProperty(StringBuffer buffer, String propertyName, String propertyType, String defaultConfig, String xmlName, String docs);

   abstract void addTitle(StringBuffer buffer);

   abstract void addSubTitle(StringBuffer buffer, String title);

   static class MarkdownFormatter extends BrokerPropertyFormatter {

      private static final String NAME = "**name**: ";
      public static final String TYPE = "type: ";
      public static final String DEFAULT = "default: ";
      public static final String XML_NAME = "xml name: ";
      public static final String DESCRIPTION = "description: ";
      public static final String ENDLINE = "\n\n---\n\n";
      public static final String BROKER_PROPERTIES = "# Broker Properties";
      public static final String HEADER2 = "## ";

      @Override
      void addTitle(StringBuffer buffer) {
         buffer.append(BROKER_PROPERTIES).append("\n\n");
      }

      @Override
      void addSubTitle(StringBuffer buffer, String title) {
         buffer.append(HEADER2).append(title).append("\n");
      }

      @Override
      void printProperty(StringBuffer buffer, String propertyName, String propertyType, String defaultConfig, String xmlName, String docs) {
         buffer.append(NAME).append(propertyName).append("\n\n");
         buffer.append(TYPE).append(propertyType).append("\n\n");
         buffer.append(DEFAULT).append(defaultConfig).append("\n\n");
         buffer.append(XML_NAME).append(xmlName).append("\n\n");
         buffer.append(DESCRIPTION);
         addDocs(docs, buffer);
         buffer.append(ENDLINE);
      }

      private void addDocs(String docs, StringBuffer buffer) {
         String[] split = docs.split("\\\\n");
         for (String s : split) {
            buffer.append(s.trim()).append("\n");
         }
      }
   }
}
