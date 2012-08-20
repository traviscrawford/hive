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

package org.apache.hadoop.hive.serde2.typeinfo;

import java.io.Serializable;

import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector.Category;

/**
 * A Set Type has homogeneous elements. All elements of the Set has the same
 * TypeInfo which is returned by getSetElementTypeInfo.
 * 
 * Always use the TypeInfoFactory to create new TypeInfo objects, instead of
 * directly creating an instance of this class.
 */
public final class SetTypeInfo extends TypeInfo implements Serializable {

  private static final long serialVersionUID = 1L;
  private TypeInfo setElementTypeInfo;

  /**
   * For java serialization use only.
   */
  public SetTypeInfo() {
  }

  @Override
  public String getTypeName() {
    return org.apache.hadoop.hive.serde.Constants.SET_TYPE_NAME + "<"
        + setElementTypeInfo.getTypeName() + ">";
  }

  /**
   * For java serialization use only.
   */
  public void setSetElementTypeInfo(TypeInfo setElementTypeInfo) {
    this.setElementTypeInfo = setElementTypeInfo;
  }

  /**
   * For TypeInfoFactory use only.
   */
  SetTypeInfo(TypeInfo elementTypeInfo) {
    setElementTypeInfo = elementTypeInfo;
  }

  @Override
  public Category getCategory() {
    return Category.SET;
  }

  public TypeInfo getSetElementTypeInfo() {
    return setElementTypeInfo;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof SetTypeInfo)) {
      return false;
    }
    return getSetElementTypeInfo().equals(
        ((SetTypeInfo) other).getSetElementTypeInfo());
  }

  @Override
  public int hashCode() {
    return setElementTypeInfo.hashCode();
  }

}
