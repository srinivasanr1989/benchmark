/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.srini.benchmark.encoders.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class BasicHeaderBlock extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6478205411546611698L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BasicHeaderBlock\",\"namespace\":\"org.srini.benchmark.encoders.avro\",\"fields\":[{\"name\":\"ApplicationIdentifier\",\"type\":\"string\"},{\"name\":\"ServiceIdentifier\",\"type\":\"int\"},{\"name\":\"LTAddress\",\"type\":\"string\"},{\"name\":\"SessionNumber\",\"type\":\"string\"},{\"name\":\"SequenceNumber\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BasicHeaderBlock> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BasicHeaderBlock> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<BasicHeaderBlock> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<BasicHeaderBlock> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<BasicHeaderBlock> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this BasicHeaderBlock to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a BasicHeaderBlock from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a BasicHeaderBlock instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static BasicHeaderBlock fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence ApplicationIdentifier;
  private int ServiceIdentifier;
  private java.lang.CharSequence LTAddress;
  private java.lang.CharSequence SessionNumber;
  private java.lang.CharSequence SequenceNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BasicHeaderBlock() {}

  /**
   * All-args constructor.
   * @param ApplicationIdentifier The new value for ApplicationIdentifier
   * @param ServiceIdentifier The new value for ServiceIdentifier
   * @param LTAddress The new value for LTAddress
   * @param SessionNumber The new value for SessionNumber
   * @param SequenceNumber The new value for SequenceNumber
   */
  public BasicHeaderBlock(java.lang.CharSequence ApplicationIdentifier, java.lang.Integer ServiceIdentifier, java.lang.CharSequence LTAddress, java.lang.CharSequence SessionNumber, java.lang.CharSequence SequenceNumber) {
    this.ApplicationIdentifier = ApplicationIdentifier;
    this.ServiceIdentifier = ServiceIdentifier;
    this.LTAddress = LTAddress;
    this.SessionNumber = SessionNumber;
    this.SequenceNumber = SequenceNumber;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ApplicationIdentifier;
    case 1: return ServiceIdentifier;
    case 2: return LTAddress;
    case 3: return SessionNumber;
    case 4: return SequenceNumber;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ApplicationIdentifier = (java.lang.CharSequence)value$; break;
    case 1: ServiceIdentifier = (java.lang.Integer)value$; break;
    case 2: LTAddress = (java.lang.CharSequence)value$; break;
    case 3: SessionNumber = (java.lang.CharSequence)value$; break;
    case 4: SequenceNumber = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ApplicationIdentifier' field.
   * @return The value of the 'ApplicationIdentifier' field.
   */
  public java.lang.CharSequence getApplicationIdentifier() {
    return ApplicationIdentifier;
  }


  /**
   * Sets the value of the 'ApplicationIdentifier' field.
   * @param value the value to set.
   */
  public void setApplicationIdentifier(java.lang.CharSequence value) {
    this.ApplicationIdentifier = value;
  }

  /**
   * Gets the value of the 'ServiceIdentifier' field.
   * @return The value of the 'ServiceIdentifier' field.
   */
  public int getServiceIdentifier() {
    return ServiceIdentifier;
  }


  /**
   * Sets the value of the 'ServiceIdentifier' field.
   * @param value the value to set.
   */
  public void setServiceIdentifier(int value) {
    this.ServiceIdentifier = value;
  }

  /**
   * Gets the value of the 'LTAddress' field.
   * @return The value of the 'LTAddress' field.
   */
  public java.lang.CharSequence getLTAddress() {
    return LTAddress;
  }


  /**
   * Sets the value of the 'LTAddress' field.
   * @param value the value to set.
   */
  public void setLTAddress(java.lang.CharSequence value) {
    this.LTAddress = value;
  }

  /**
   * Gets the value of the 'SessionNumber' field.
   * @return The value of the 'SessionNumber' field.
   */
  public java.lang.CharSequence getSessionNumber() {
    return SessionNumber;
  }


  /**
   * Sets the value of the 'SessionNumber' field.
   * @param value the value to set.
   */
  public void setSessionNumber(java.lang.CharSequence value) {
    this.SessionNumber = value;
  }

  /**
   * Gets the value of the 'SequenceNumber' field.
   * @return The value of the 'SequenceNumber' field.
   */
  public java.lang.CharSequence getSequenceNumber() {
    return SequenceNumber;
  }


  /**
   * Sets the value of the 'SequenceNumber' field.
   * @param value the value to set.
   */
  public void setSequenceNumber(java.lang.CharSequence value) {
    this.SequenceNumber = value;
  }

  /**
   * Creates a new BasicHeaderBlock RecordBuilder.
   * @return A new BasicHeaderBlock RecordBuilder
   */
  public static org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder newBuilder() {
    return new org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder();
  }

  /**
   * Creates a new BasicHeaderBlock RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BasicHeaderBlock RecordBuilder
   */
  public static org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder newBuilder(org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder other) {
    if (other == null) {
      return new org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder();
    } else {
      return new org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder(other);
    }
  }

  /**
   * Creates a new BasicHeaderBlock RecordBuilder by copying an existing BasicHeaderBlock instance.
   * @param other The existing instance to copy.
   * @return A new BasicHeaderBlock RecordBuilder
   */
  public static org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder newBuilder(org.srini.benchmark.encoders.avro.BasicHeaderBlock other) {
    if (other == null) {
      return new org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder();
    } else {
      return new org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder(other);
    }
  }

  /**
   * RecordBuilder for BasicHeaderBlock instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BasicHeaderBlock>
    implements org.apache.avro.data.RecordBuilder<BasicHeaderBlock> {

    private java.lang.CharSequence ApplicationIdentifier;
    private int ServiceIdentifier;
    private java.lang.CharSequence LTAddress;
    private java.lang.CharSequence SessionNumber;
    private java.lang.CharSequence SequenceNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ApplicationIdentifier)) {
        this.ApplicationIdentifier = data().deepCopy(fields()[0].schema(), other.ApplicationIdentifier);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ServiceIdentifier)) {
        this.ServiceIdentifier = data().deepCopy(fields()[1].schema(), other.ServiceIdentifier);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.LTAddress)) {
        this.LTAddress = data().deepCopy(fields()[2].schema(), other.LTAddress);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.SessionNumber)) {
        this.SessionNumber = data().deepCopy(fields()[3].schema(), other.SessionNumber);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.SequenceNumber)) {
        this.SequenceNumber = data().deepCopy(fields()[4].schema(), other.SequenceNumber);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing BasicHeaderBlock instance
     * @param other The existing instance to copy.
     */
    private Builder(org.srini.benchmark.encoders.avro.BasicHeaderBlock other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.ApplicationIdentifier)) {
        this.ApplicationIdentifier = data().deepCopy(fields()[0].schema(), other.ApplicationIdentifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ServiceIdentifier)) {
        this.ServiceIdentifier = data().deepCopy(fields()[1].schema(), other.ServiceIdentifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LTAddress)) {
        this.LTAddress = data().deepCopy(fields()[2].schema(), other.LTAddress);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.SessionNumber)) {
        this.SessionNumber = data().deepCopy(fields()[3].schema(), other.SessionNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.SequenceNumber)) {
        this.SequenceNumber = data().deepCopy(fields()[4].schema(), other.SequenceNumber);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'ApplicationIdentifier' field.
      * @return The value.
      */
    public java.lang.CharSequence getApplicationIdentifier() {
      return ApplicationIdentifier;
    }


    /**
      * Sets the value of the 'ApplicationIdentifier' field.
      * @param value The value of 'ApplicationIdentifier'.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder setApplicationIdentifier(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ApplicationIdentifier = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ApplicationIdentifier' field has been set.
      * @return True if the 'ApplicationIdentifier' field has been set, false otherwise.
      */
    public boolean hasApplicationIdentifier() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ApplicationIdentifier' field.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder clearApplicationIdentifier() {
      ApplicationIdentifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ServiceIdentifier' field.
      * @return The value.
      */
    public int getServiceIdentifier() {
      return ServiceIdentifier;
    }


    /**
      * Sets the value of the 'ServiceIdentifier' field.
      * @param value The value of 'ServiceIdentifier'.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder setServiceIdentifier(int value) {
      validate(fields()[1], value);
      this.ServiceIdentifier = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ServiceIdentifier' field has been set.
      * @return True if the 'ServiceIdentifier' field has been set, false otherwise.
      */
    public boolean hasServiceIdentifier() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ServiceIdentifier' field.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder clearServiceIdentifier() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'LTAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getLTAddress() {
      return LTAddress;
    }


    /**
      * Sets the value of the 'LTAddress' field.
      * @param value The value of 'LTAddress'.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder setLTAddress(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.LTAddress = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'LTAddress' field has been set.
      * @return True if the 'LTAddress' field has been set, false otherwise.
      */
    public boolean hasLTAddress() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'LTAddress' field.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder clearLTAddress() {
      LTAddress = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'SessionNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getSessionNumber() {
      return SessionNumber;
    }


    /**
      * Sets the value of the 'SessionNumber' field.
      * @param value The value of 'SessionNumber'.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder setSessionNumber(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.SessionNumber = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'SessionNumber' field has been set.
      * @return True if the 'SessionNumber' field has been set, false otherwise.
      */
    public boolean hasSessionNumber() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'SessionNumber' field.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder clearSessionNumber() {
      SessionNumber = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'SequenceNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getSequenceNumber() {
      return SequenceNumber;
    }


    /**
      * Sets the value of the 'SequenceNumber' field.
      * @param value The value of 'SequenceNumber'.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder setSequenceNumber(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.SequenceNumber = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'SequenceNumber' field has been set.
      * @return True if the 'SequenceNumber' field has been set, false otherwise.
      */
    public boolean hasSequenceNumber() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'SequenceNumber' field.
      * @return This builder.
      */
    public org.srini.benchmark.encoders.avro.BasicHeaderBlock.Builder clearSequenceNumber() {
      SequenceNumber = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BasicHeaderBlock build() {
      try {
        BasicHeaderBlock record = new BasicHeaderBlock();
        record.ApplicationIdentifier = fieldSetFlags()[0] ? this.ApplicationIdentifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ServiceIdentifier = fieldSetFlags()[1] ? this.ServiceIdentifier : (java.lang.Integer) defaultValue(fields()[1]);
        record.LTAddress = fieldSetFlags()[2] ? this.LTAddress : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.SessionNumber = fieldSetFlags()[3] ? this.SessionNumber : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.SequenceNumber = fieldSetFlags()[4] ? this.SequenceNumber : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BasicHeaderBlock>
    WRITER$ = (org.apache.avro.io.DatumWriter<BasicHeaderBlock>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BasicHeaderBlock>
    READER$ = (org.apache.avro.io.DatumReader<BasicHeaderBlock>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.ApplicationIdentifier);

    out.writeInt(this.ServiceIdentifier);

    out.writeString(this.LTAddress);

    out.writeString(this.SessionNumber);

    out.writeString(this.SequenceNumber);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.ApplicationIdentifier = in.readString(this.ApplicationIdentifier instanceof Utf8 ? (Utf8)this.ApplicationIdentifier : null);

      this.ServiceIdentifier = in.readInt();

      this.LTAddress = in.readString(this.LTAddress instanceof Utf8 ? (Utf8)this.LTAddress : null);

      this.SessionNumber = in.readString(this.SessionNumber instanceof Utf8 ? (Utf8)this.SessionNumber : null);

      this.SequenceNumber = in.readString(this.SequenceNumber instanceof Utf8 ? (Utf8)this.SequenceNumber : null);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.ApplicationIdentifier = in.readString(this.ApplicationIdentifier instanceof Utf8 ? (Utf8)this.ApplicationIdentifier : null);
          break;

        case 1:
          this.ServiceIdentifier = in.readInt();
          break;

        case 2:
          this.LTAddress = in.readString(this.LTAddress instanceof Utf8 ? (Utf8)this.LTAddress : null);
          break;

        case 3:
          this.SessionNumber = in.readString(this.SessionNumber instanceof Utf8 ? (Utf8)this.SessionNumber : null);
          break;

        case 4:
          this.SequenceNumber = in.readString(this.SequenceNumber instanceof Utf8 ? (Utf8)this.SequenceNumber : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










