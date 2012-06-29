/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Order implements org.apache.thrift.TBase<Order, Order._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Order");

  private static final org.apache.thrift.protocol.TField COL_FIELD_DESC = new org.apache.thrift.protocol.TField("col", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("order", org.apache.thrift.protocol.TType.I32, (short)2);

  private String col; // required
  private int order; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COL((short)1, "col"),
    ORDER((short)2, "order");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COL
          return COL;
        case 2: // ORDER
          return ORDER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ORDER_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COL, new org.apache.thrift.meta_data.FieldMetaData("col", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORDER, new org.apache.thrift.meta_data.FieldMetaData("order", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Order.class, metaDataMap);
  }

  public Order() {
  }

  public Order(
    String col,
    int order)
  {
    this();
    this.col = col;
    this.order = order;
    setOrderIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Order(Order other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetCol()) {
      this.col = other.col;
    }
    this.order = other.order;
  }

  public Order deepCopy() {
    return new Order(this);
  }

  @Override
  public void clear() {
    this.col = null;
    setOrderIsSet(false);
    this.order = 0;
  }

  public String getCol() {
    return this.col;
  }

  public void setCol(String col) {
    this.col = col;
  }

  public void unsetCol() {
    this.col = null;
  }

  /** Returns true if field col is set (has been assigned a value) and false otherwise */
  public boolean isSetCol() {
    return this.col != null;
  }

  public void setColIsSet(boolean value) {
    if (!value) {
      this.col = null;
    }
  }

  public int getOrder() {
    return this.order;
  }

  public void setOrder(int order) {
    this.order = order;
    setOrderIsSet(true);
  }

  public void unsetOrder() {
    __isset_bit_vector.clear(__ORDER_ISSET_ID);
  }

  /** Returns true if field order is set (has been assigned a value) and false otherwise */
  public boolean isSetOrder() {
    return __isset_bit_vector.get(__ORDER_ISSET_ID);
  }

  public void setOrderIsSet(boolean value) {
    __isset_bit_vector.set(__ORDER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COL:
      if (value == null) {
        unsetCol();
      } else {
        setCol((String)value);
      }
      break;

    case ORDER:
      if (value == null) {
        unsetOrder();
      } else {
        setOrder((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COL:
      return getCol();

    case ORDER:
      return Integer.valueOf(getOrder());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COL:
      return isSetCol();
    case ORDER:
      return isSetOrder();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Order)
      return this.equals((Order)that);
    return false;
  }

  public boolean equals(Order that) {
    if (that == null)
      return false;

    boolean this_present_col = true && this.isSetCol();
    boolean that_present_col = true && that.isSetCol();
    if (this_present_col || that_present_col) {
      if (!(this_present_col && that_present_col))
        return false;
      if (!this.col.equals(that.col))
        return false;
    }

    boolean this_present_order = true;
    boolean that_present_order = true;
    if (this_present_order || that_present_order) {
      if (!(this_present_order && that_present_order))
        return false;
      if (this.order != that.order)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_col = true && (isSetCol());
    builder.append(present_col);
    if (present_col)
      builder.append(col);

    boolean present_order = true;
    builder.append(present_order);
    if (present_order)
      builder.append(order);

    return builder.toHashCode();
  }

  public int compareTo(Order other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Order typedOther = (Order)other;

    lastComparison = Boolean.valueOf(isSetCol()).compareTo(typedOther.isSetCol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.col, typedOther.col);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrder()).compareTo(typedOther.isSetOrder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrder()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.order, typedOther.order);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // COL
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.col = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ORDER
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.order = iprot.readI32();
            setOrderIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.col != null) {
      oprot.writeFieldBegin(COL_FIELD_DESC);
      oprot.writeString(this.col);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ORDER_FIELD_DESC);
    oprot.writeI32(this.order);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Order(");
    boolean first = true;

    sb.append("col:");
    if (this.col == null) {
      sb.append("null");
    } else {
      sb.append(this.col);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("order:");
    sb.append(this.order);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

