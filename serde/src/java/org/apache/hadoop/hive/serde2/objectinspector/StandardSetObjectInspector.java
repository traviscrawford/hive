/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.serde2.objectinspector;

import java.util.HashSet;
import java.util.Set;

/**
 * DefaultSetObjectInspector works on Set data that is stored as a Java Set object.
 * 
 * Always use the ObjectInspectorFactory to create new ObjectInspector objects,
 * instead of directly creating an instance of this class.
 */
public class StandardSetObjectInspector implements SettableSetObjectInspector {

  ObjectInspector setElementObjectInspector;

  /**
   * Call ObjectInspectorFactory.getStandardSetObjectInspector instead.
   */
  protected StandardSetObjectInspector(
      ObjectInspector setElementObjectInspector) {
    this.setElementObjectInspector = setElementObjectInspector;
  }

  // ///////////////////////////// 
  // ObjectInspector
  @Override
  public final Category getCategory() {
    return Category.SET;
  }

  @Override
  public String getTypeName() {
    return org.apache.hadoop.hive.serde.Constants.SET_TYPE_NAME + "<"
        + setElementObjectInspector.getTypeName() + ">";
  }

  // /////////////////////////////
  // SetObjectInspector
  @Override
  public ObjectInspector getSetElementObjectInspector() {
    return setElementObjectInspector;
  }

  @Override
  public int getSetSize(Object data) {
    if (data == null) {
      return -1;
    }
    Set<?> set = (Set<?>) data;
    return set.size();
  }

  @Override
  public Set<?> getSet(Object data) {
    if (data == null) {
      return null;
    }
    Set<?> set = (Set<?>) data;
    return set;
  }

  // /////////////////////////////
  // SettableSetObjectInspector
  @Override
  public Object create() {
    Set<Object> set = new HashSet<Object>();
    return set;
  }

  @Override
  public Object add(Object set, Object element) {
    Set<Object> realSet = (Set<Object>) set;
    realSet.add(element);
    return realSet;
  }
}
