/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.jena.riot.thrift.wire;

@SuppressWarnings("all")
public class Patch_Data_Add implements org.apache.thrift.TBase<Patch_Data_Add, Patch_Data_Add._Fields>, java.io.Serializable, Cloneable, Comparable<Patch_Data_Add> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Patch_Data_Add");

  private static final org.apache.thrift.protocol.TField S_FIELD_DESC = new org.apache.thrift.protocol.TField("s", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField P_FIELD_DESC = new org.apache.thrift.protocol.TField("p", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField O_FIELD_DESC = new org.apache.thrift.protocol.TField("o", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField G_FIELD_DESC = new org.apache.thrift.protocol.TField("g", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new Patch_Data_AddStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new Patch_Data_AddTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable RDF_Term s; // required
  public @org.apache.thrift.annotation.Nullable RDF_Term p; // required
  public @org.apache.thrift.annotation.Nullable RDF_Term o; // required
  public @org.apache.thrift.annotation.Nullable RDF_Term g; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    S((short)1, "s"),
    P((short)2, "p"),
    O((short)3, "o"),
    G((short)4, "g");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // S
          return S;
        case 2: // P
          return P;
        case 3: // O
          return O;
        case 4: // G
          return G;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.G};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.S, new org.apache.thrift.meta_data.FieldMetaData("s", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Term.class)));
    tmpMap.put(_Fields.P, new org.apache.thrift.meta_data.FieldMetaData("p", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Term.class)));
    tmpMap.put(_Fields.O, new org.apache.thrift.meta_data.FieldMetaData("o", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Term.class)));
    tmpMap.put(_Fields.G, new org.apache.thrift.meta_data.FieldMetaData("g", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Term.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Patch_Data_Add.class, metaDataMap);
  }

  public Patch_Data_Add() {
  }

  public Patch_Data_Add(
    RDF_Term s,
    RDF_Term p,
    RDF_Term o)
  {
    this();
    this.s = s;
    this.p = p;
    this.o = o;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Patch_Data_Add(Patch_Data_Add other) {
    if (other.isSetS()) {
      this.s = new RDF_Term(other.s);
    }
    if (other.isSetP()) {
      this.p = new RDF_Term(other.p);
    }
    if (other.isSetO()) {
      this.o = new RDF_Term(other.o);
    }
    if (other.isSetG()) {
      this.g = new RDF_Term(other.g);
    }
  }

  public Patch_Data_Add deepCopy() {
    return new Patch_Data_Add(this);
  }

  @Override
  public void clear() {
    this.s = null;
    this.p = null;
    this.o = null;
    this.g = null;
  }

  @org.apache.thrift.annotation.Nullable
  public RDF_Term getS() {
    return this.s;
  }

  public Patch_Data_Add setS(@org.apache.thrift.annotation.Nullable RDF_Term s) {
    this.s = s;
    return this;
  }

  public void unsetS() {
    this.s = null;
  }

  /** Returns true if field s is set (has been assigned a value) and false otherwise */
  public boolean isSetS() {
    return this.s != null;
  }

  public void setSIsSet(boolean value) {
    if (!value) {
      this.s = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public RDF_Term getP() {
    return this.p;
  }

  public Patch_Data_Add setP(@org.apache.thrift.annotation.Nullable RDF_Term p) {
    this.p = p;
    return this;
  }

  public void unsetP() {
    this.p = null;
  }

  /** Returns true if field p is set (has been assigned a value) and false otherwise */
  public boolean isSetP() {
    return this.p != null;
  }

  public void setPIsSet(boolean value) {
    if (!value) {
      this.p = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public RDF_Term getO() {
    return this.o;
  }

  public Patch_Data_Add setO(@org.apache.thrift.annotation.Nullable RDF_Term o) {
    this.o = o;
    return this;
  }

  public void unsetO() {
    this.o = null;
  }

  /** Returns true if field o is set (has been assigned a value) and false otherwise */
  public boolean isSetO() {
    return this.o != null;
  }

  public void setOIsSet(boolean value) {
    if (!value) {
      this.o = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public RDF_Term getG() {
    return this.g;
  }

  public Patch_Data_Add setG(@org.apache.thrift.annotation.Nullable RDF_Term g) {
    this.g = g;
    return this;
  }

  public void unsetG() {
    this.g = null;
  }

  /** Returns true if field g is set (has been assigned a value) and false otherwise */
  public boolean isSetG() {
    return this.g != null;
  }

  public void setGIsSet(boolean value) {
    if (!value) {
      this.g = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case S:
      if (value == null) {
        unsetS();
      } else {
        setS((RDF_Term)value);
      }
      break;

    case P:
      if (value == null) {
        unsetP();
      } else {
        setP((RDF_Term)value);
      }
      break;

    case O:
      if (value == null) {
        unsetO();
      } else {
        setO((RDF_Term)value);
      }
      break;

    case G:
      if (value == null) {
        unsetG();
      } else {
        setG((RDF_Term)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case S:
      return getS();

    case P:
      return getP();

    case O:
      return getO();

    case G:
      return getG();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case S:
      return isSetS();
    case P:
      return isSetP();
    case O:
      return isSetO();
    case G:
      return isSetG();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Patch_Data_Add)
      return this.equals((Patch_Data_Add)that);
    return false;
  }

  public boolean equals(Patch_Data_Add that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_s = true && this.isSetS();
    boolean that_present_s = true && that.isSetS();
    if (this_present_s || that_present_s) {
      if (!(this_present_s && that_present_s))
        return false;
      if (!this.s.equals(that.s))
        return false;
    }

    boolean this_present_p = true && this.isSetP();
    boolean that_present_p = true && that.isSetP();
    if (this_present_p || that_present_p) {
      if (!(this_present_p && that_present_p))
        return false;
      if (!this.p.equals(that.p))
        return false;
    }

    boolean this_present_o = true && this.isSetO();
    boolean that_present_o = true && that.isSetO();
    if (this_present_o || that_present_o) {
      if (!(this_present_o && that_present_o))
        return false;
      if (!this.o.equals(that.o))
        return false;
    }

    boolean this_present_g = true && this.isSetG();
    boolean that_present_g = true && that.isSetG();
    if (this_present_g || that_present_g) {
      if (!(this_present_g && that_present_g))
        return false;
      if (!this.g.equals(that.g))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetS()) ? 131071 : 524287);
    if (isSetS())
      hashCode = hashCode * 8191 + s.hashCode();

    hashCode = hashCode * 8191 + ((isSetP()) ? 131071 : 524287);
    if (isSetP())
      hashCode = hashCode * 8191 + p.hashCode();

    hashCode = hashCode * 8191 + ((isSetO()) ? 131071 : 524287);
    if (isSetO())
      hashCode = hashCode * 8191 + o.hashCode();

    hashCode = hashCode * 8191 + ((isSetG()) ? 131071 : 524287);
    if (isSetG())
      hashCode = hashCode * 8191 + g.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Patch_Data_Add other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetS(), other.isSetS());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetS()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.s, other.s);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetP(), other.isSetP());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetP()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.p, other.p);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetO(), other.isSetO());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetO()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.o, other.o);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetG(), other.isSetG());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetG()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.g, other.g);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Patch_Data_Add(");
    boolean first = true;

    sb.append("s:");
    if (this.s == null) {
      sb.append("null");
    } else {
      sb.append(this.s);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("p:");
    if (this.p == null) {
      sb.append("null");
    } else {
      sb.append(this.p);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("o:");
    if (this.o == null) {
      sb.append("null");
    } else {
      sb.append(this.o);
    }
    first = false;
    if (isSetG()) {
      if (!first) sb.append(", ");
      sb.append("g:");
      if (this.g == null) {
        sb.append("null");
      } else {
        sb.append(this.g);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (s == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 's' was not present! Struct: " + toString());
    }
    if (p == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'p' was not present! Struct: " + toString());
    }
    if (o == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'o' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class Patch_Data_AddStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public Patch_Data_AddStandardScheme getScheme() {
      return new Patch_Data_AddStandardScheme();
    }
  }

  private static class Patch_Data_AddStandardScheme extends org.apache.thrift.scheme.StandardScheme<Patch_Data_Add> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Patch_Data_Add struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // S
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.s = new RDF_Term();
              struct.s.read(iprot);
              struct.setSIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // P
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.p = new RDF_Term();
              struct.p.read(iprot);
              struct.setPIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // O
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.o = new RDF_Term();
              struct.o.read(iprot);
              struct.setOIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // G
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.g = new RDF_Term();
              struct.g.read(iprot);
              struct.setGIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Patch_Data_Add struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.s != null) {
        oprot.writeFieldBegin(S_FIELD_DESC);
        struct.s.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.p != null) {
        oprot.writeFieldBegin(P_FIELD_DESC);
        struct.p.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.o != null) {
        oprot.writeFieldBegin(O_FIELD_DESC);
        struct.o.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.g != null) {
        if (struct.isSetG()) {
          oprot.writeFieldBegin(G_FIELD_DESC);
          struct.g.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Patch_Data_AddTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public Patch_Data_AddTupleScheme getScheme() {
      return new Patch_Data_AddTupleScheme();
    }
  }

  private static class Patch_Data_AddTupleScheme extends org.apache.thrift.scheme.TupleScheme<Patch_Data_Add> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Patch_Data_Add struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.s.write(oprot);
      struct.p.write(oprot);
      struct.o.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetG()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetG()) {
        struct.g.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Patch_Data_Add struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.s = new RDF_Term();
      struct.s.read(iprot);
      struct.setSIsSet(true);
      struct.p = new RDF_Term();
      struct.p.read(iprot);
      struct.setPIsSet(true);
      struct.o = new RDF_Term();
      struct.o.read(iprot);
      struct.setOIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.g = new RDF_Term();
        struct.g.read(iprot);
        struct.setGIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
