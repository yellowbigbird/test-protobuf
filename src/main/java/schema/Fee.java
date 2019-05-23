// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: submit_booking.proto

package schema;

/**
 * Protobuf type {@code submit_booking.Fee}
 */
public  final class Fee extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:submit_booking.Fee)
    FeeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Fee.newBuilder() to construct.
  private Fee(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Fee() {
    currency_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Fee(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            schema.Amount.Builder subBuilder = null;
            if (amount_ != null) {
              subBuilder = amount_.toBuilder();
            }
            amount_ = input.readMessage(schema.Amount.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(amount_);
              amount_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            currency_ = s;
            break;
          }
          case 26: {
            schema.Description.Builder subBuilder = null;
            if (description_ != null) {
              subBuilder = description_.toBuilder();
            }
            description_ = input.readMessage(schema.Description.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(description_);
              description_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return schema.SubmitBooking.internal_static_submit_booking_Fee_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return schema.SubmitBooking.internal_static_submit_booking_Fee_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            schema.Fee.class, schema.Fee.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private schema.Amount amount_;
  /**
   * <code>.submit_booking.Amount amount = 1;</code>
   */
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <code>.submit_booking.Amount amount = 1;</code>
   */
  public schema.Amount getAmount() {
    return amount_ == null ? schema.Amount.getDefaultInstance() : amount_;
  }
  /**
   * <code>.submit_booking.Amount amount = 1;</code>
   */
  public schema.AmountOrBuilder getAmountOrBuilder() {
    return getAmount();
  }

  public static final int CURRENCY_FIELD_NUMBER = 2;
  private volatile java.lang.Object currency_;
  /**
   * <code>string currency = 2;</code>
   */
  public java.lang.String getCurrency() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currency_ = s;
      return s;
    }
  }
  /**
   * <code>string currency = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCurrencyBytes() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private schema.Description description_;
  /**
   * <pre>
   * Fee/ surcharge Description.  Example: U.S Customs User Fee
   * </pre>
   *
   * <code>.submit_booking.Description description = 3;</code>
   */
  public boolean hasDescription() {
    return description_ != null;
  }
  /**
   * <pre>
   * Fee/ surcharge Description.  Example: U.S Customs User Fee
   * </pre>
   *
   * <code>.submit_booking.Description description = 3;</code>
   */
  public schema.Description getDescription() {
    return description_ == null ? schema.Description.getDefaultInstance() : description_;
  }
  /**
   * <pre>
   * Fee/ surcharge Description.  Example: U.S Customs User Fee
   * </pre>
   *
   * <code>.submit_booking.Description description = 3;</code>
   */
  public schema.DescriptionOrBuilder getDescriptionOrBuilder() {
    return getDescription();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (amount_ != null) {
      output.writeMessage(1, getAmount());
    }
    if (!getCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, currency_);
    }
    if (description_ != null) {
      output.writeMessage(3, getDescription());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (amount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAmount());
    }
    if (!getCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, currency_);
    }
    if (description_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDescription());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof schema.Fee)) {
      return super.equals(obj);
    }
    schema.Fee other = (schema.Fee) obj;

    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount()
          .equals(other.getAmount())) return false;
    }
    if (!getCurrency()
        .equals(other.getCurrency())) return false;
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrency().hashCode();
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static schema.Fee parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static schema.Fee parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static schema.Fee parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static schema.Fee parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static schema.Fee parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static schema.Fee parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static schema.Fee parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static schema.Fee parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static schema.Fee parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static schema.Fee parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static schema.Fee parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static schema.Fee parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(schema.Fee prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code submit_booking.Fee}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:submit_booking.Fee)
      schema.FeeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return schema.SubmitBooking.internal_static_submit_booking_Fee_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return schema.SubmitBooking.internal_static_submit_booking_Fee_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              schema.Fee.class, schema.Fee.Builder.class);
    }

    // Construct using schema.Fee.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (amountBuilder_ == null) {
        amount_ = null;
      } else {
        amount_ = null;
        amountBuilder_ = null;
      }
      currency_ = "";

      if (descriptionBuilder_ == null) {
        description_ = null;
      } else {
        description_ = null;
        descriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return schema.SubmitBooking.internal_static_submit_booking_Fee_descriptor;
    }

    @java.lang.Override
    public schema.Fee getDefaultInstanceForType() {
      return schema.Fee.getDefaultInstance();
    }

    @java.lang.Override
    public schema.Fee build() {
      schema.Fee result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public schema.Fee buildPartial() {
      schema.Fee result = new schema.Fee(this);
      if (amountBuilder_ == null) {
        result.amount_ = amount_;
      } else {
        result.amount_ = amountBuilder_.build();
      }
      result.currency_ = currency_;
      if (descriptionBuilder_ == null) {
        result.description_ = description_;
      } else {
        result.description_ = descriptionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof schema.Fee) {
        return mergeFrom((schema.Fee)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(schema.Fee other) {
      if (other == schema.Fee.getDefaultInstance()) return this;
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
      }
      if (!other.getCurrency().isEmpty()) {
        currency_ = other.currency_;
        onChanged();
      }
      if (other.hasDescription()) {
        mergeDescription(other.getDescription());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      schema.Fee parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (schema.Fee) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private schema.Amount amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.Amount, schema.Amount.Builder, schema.AmountOrBuilder> amountBuilder_;
    /**
     * <code>.submit_booking.Amount amount = 1;</code>
     */
    public boolean hasAmount() {
      return amountBuilder_ != null || amount_ != null;
    }
    /**
     * <code>.submit_booking.Amount amount = 1;</code>
     */
    public schema.Amount getAmount() {
      if (amountBuilder_ == null) {
        return amount_ == null ? schema.Amount.getDefaultInstance() : amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }
    /**
     * <code>.submit_booking.Amount amount = 1;</code>
     */
    public Builder setAmount(schema.Amount value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
        onChanged();
      } else {
        amountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.Amount amount = 1;</code>
     */
    public Builder setAmount(
        schema.Amount.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
        onChanged();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.submit_booking.Amount amount = 1;</code>
     */
    public Builder mergeAmount(schema.Amount value) {
      if (amountBuilder_ == null) {
        if (amount_ != null) {
          amount_ =
            schema.Amount.newBuilder(amount_).mergeFrom(value).buildPartial();
        } else {
          amount_ = value;
        }
        onChanged();
      } else {
        amountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.Amount amount = 1;</code>
     */
    public Builder clearAmount() {
      if (amountBuilder_ == null) {
        amount_ = null;
        onChanged();
      } else {
        amount_ = null;
        amountBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.submit_booking.Amount amount = 1;</code>
     */
    public schema.Amount.Builder getAmountBuilder() {
      
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.submit_booking.Amount amount = 1;</code>
     */
    public schema.AmountOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_ == null ?
            schema.Amount.getDefaultInstance() : amount_;
      }
    }
    /**
     * <code>.submit_booking.Amount amount = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.Amount, schema.Amount.Builder, schema.AmountOrBuilder> 
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            schema.Amount, schema.Amount.Builder, schema.AmountOrBuilder>(
                getAmount(),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
    }

    private java.lang.Object currency_ = "";
    /**
     * <code>string currency = 2;</code>
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currency = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currency = 2;</code>
     */
    public Builder setCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 2;</code>
     */
    public Builder clearCurrency() {
      
      currency_ = getDefaultInstance().getCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 2;</code>
     */
    public Builder setCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currency_ = value;
      onChanged();
      return this;
    }

    private schema.Description description_;
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.Description, schema.Description.Builder, schema.DescriptionOrBuilder> descriptionBuilder_;
    /**
     * <pre>
     * Fee/ surcharge Description.  Example: U.S Customs User Fee
     * </pre>
     *
     * <code>.submit_booking.Description description = 3;</code>
     */
    public boolean hasDescription() {
      return descriptionBuilder_ != null || description_ != null;
    }
    /**
     * <pre>
     * Fee/ surcharge Description.  Example: U.S Customs User Fee
     * </pre>
     *
     * <code>.submit_booking.Description description = 3;</code>
     */
    public schema.Description getDescription() {
      if (descriptionBuilder_ == null) {
        return description_ == null ? schema.Description.getDefaultInstance() : description_;
      } else {
        return descriptionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Fee/ surcharge Description.  Example: U.S Customs User Fee
     * </pre>
     *
     * <code>.submit_booking.Description description = 3;</code>
     */
    public Builder setDescription(schema.Description value) {
      if (descriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description_ = value;
        onChanged();
      } else {
        descriptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Fee/ surcharge Description.  Example: U.S Customs User Fee
     * </pre>
     *
     * <code>.submit_booking.Description description = 3;</code>
     */
    public Builder setDescription(
        schema.Description.Builder builderForValue) {
      if (descriptionBuilder_ == null) {
        description_ = builderForValue.build();
        onChanged();
      } else {
        descriptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Fee/ surcharge Description.  Example: U.S Customs User Fee
     * </pre>
     *
     * <code>.submit_booking.Description description = 3;</code>
     */
    public Builder mergeDescription(schema.Description value) {
      if (descriptionBuilder_ == null) {
        if (description_ != null) {
          description_ =
            schema.Description.newBuilder(description_).mergeFrom(value).buildPartial();
        } else {
          description_ = value;
        }
        onChanged();
      } else {
        descriptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Fee/ surcharge Description.  Example: U.S Customs User Fee
     * </pre>
     *
     * <code>.submit_booking.Description description = 3;</code>
     */
    public Builder clearDescription() {
      if (descriptionBuilder_ == null) {
        description_ = null;
        onChanged();
      } else {
        description_ = null;
        descriptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Fee/ surcharge Description.  Example: U.S Customs User Fee
     * </pre>
     *
     * <code>.submit_booking.Description description = 3;</code>
     */
    public schema.Description.Builder getDescriptionBuilder() {
      
      onChanged();
      return getDescriptionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Fee/ surcharge Description.  Example: U.S Customs User Fee
     * </pre>
     *
     * <code>.submit_booking.Description description = 3;</code>
     */
    public schema.DescriptionOrBuilder getDescriptionOrBuilder() {
      if (descriptionBuilder_ != null) {
        return descriptionBuilder_.getMessageOrBuilder();
      } else {
        return description_ == null ?
            schema.Description.getDefaultInstance() : description_;
      }
    }
    /**
     * <pre>
     * Fee/ surcharge Description.  Example: U.S Customs User Fee
     * </pre>
     *
     * <code>.submit_booking.Description description = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.Description, schema.Description.Builder, schema.DescriptionOrBuilder> 
        getDescriptionFieldBuilder() {
      if (descriptionBuilder_ == null) {
        descriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            schema.Description, schema.Description.Builder, schema.DescriptionOrBuilder>(
                getDescription(),
                getParentForChildren(),
                isClean());
        description_ = null;
      }
      return descriptionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:submit_booking.Fee)
  }

  // @@protoc_insertion_point(class_scope:submit_booking.Fee)
  private static final schema.Fee DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new schema.Fee();
  }

  public static schema.Fee getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Fee>
      PARSER = new com.google.protobuf.AbstractParser<Fee>() {
    @java.lang.Override
    public Fee parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Fee(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Fee> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Fee> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public schema.Fee getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

