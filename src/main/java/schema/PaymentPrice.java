// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: submit_booking.proto

package schema;

/**
 * Protobuf type {@code submit_booking.PaymentPrice}
 */
public  final class PaymentPrice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:submit_booking.PaymentPrice)
    PaymentPriceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaymentPrice.newBuilder() to construct.
  private PaymentPrice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaymentPrice() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaymentPrice(
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
            schema.PriceBreakdown.Builder subBuilder = null;
            if (priceBreakdown_ != null) {
              subBuilder = priceBreakdown_.toBuilder();
            }
            priceBreakdown_ = input.readMessage(schema.PriceBreakdown.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(priceBreakdown_);
              priceBreakdown_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            schema.Price.Builder subBuilder = null;
            if (totalAmount_ != null) {
              subBuilder = totalAmount_.toBuilder();
            }
            totalAmount_ = input.readMessage(schema.Price.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(totalAmount_);
              totalAmount_ = subBuilder.buildPartial();
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
    return schema.SubmitBooking.internal_static_submit_booking_PaymentPrice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return schema.SubmitBooking.internal_static_submit_booking_PaymentPrice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            schema.PaymentPrice.class, schema.PaymentPrice.Builder.class);
  }

  public static final int PRICE_BREAKDOWN_FIELD_NUMBER = 1;
  private schema.PriceBreakdown priceBreakdown_;
  /**
   * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
   */
  public boolean hasPriceBreakdown() {
    return priceBreakdown_ != null;
  }
  /**
   * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
   */
  public schema.PriceBreakdown getPriceBreakdown() {
    return priceBreakdown_ == null ? schema.PriceBreakdown.getDefaultInstance() : priceBreakdown_;
  }
  /**
   * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
   */
  public schema.PriceBreakdownOrBuilder getPriceBreakdownOrBuilder() {
    return getPriceBreakdown();
  }

  public static final int TOTAL_AMOUNT_FIELD_NUMBER = 2;
  private schema.Price totalAmount_;
  /**
   * <code>.submit_booking.Price total_amount = 2;</code>
   */
  public boolean hasTotalAmount() {
    return totalAmount_ != null;
  }
  /**
   * <code>.submit_booking.Price total_amount = 2;</code>
   */
  public schema.Price getTotalAmount() {
    return totalAmount_ == null ? schema.Price.getDefaultInstance() : totalAmount_;
  }
  /**
   * <code>.submit_booking.Price total_amount = 2;</code>
   */
  public schema.PriceOrBuilder getTotalAmountOrBuilder() {
    return getTotalAmount();
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
    if (priceBreakdown_ != null) {
      output.writeMessage(1, getPriceBreakdown());
    }
    if (totalAmount_ != null) {
      output.writeMessage(2, getTotalAmount());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (priceBreakdown_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPriceBreakdown());
    }
    if (totalAmount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTotalAmount());
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
    if (!(obj instanceof schema.PaymentPrice)) {
      return super.equals(obj);
    }
    schema.PaymentPrice other = (schema.PaymentPrice) obj;

    if (hasPriceBreakdown() != other.hasPriceBreakdown()) return false;
    if (hasPriceBreakdown()) {
      if (!getPriceBreakdown()
          .equals(other.getPriceBreakdown())) return false;
    }
    if (hasTotalAmount() != other.hasTotalAmount()) return false;
    if (hasTotalAmount()) {
      if (!getTotalAmount()
          .equals(other.getTotalAmount())) return false;
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
    if (hasPriceBreakdown()) {
      hash = (37 * hash) + PRICE_BREAKDOWN_FIELD_NUMBER;
      hash = (53 * hash) + getPriceBreakdown().hashCode();
    }
    if (hasTotalAmount()) {
      hash = (37 * hash) + TOTAL_AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTotalAmount().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static schema.PaymentPrice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static schema.PaymentPrice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static schema.PaymentPrice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static schema.PaymentPrice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static schema.PaymentPrice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static schema.PaymentPrice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static schema.PaymentPrice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static schema.PaymentPrice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static schema.PaymentPrice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static schema.PaymentPrice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static schema.PaymentPrice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static schema.PaymentPrice parseFrom(
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
  public static Builder newBuilder(schema.PaymentPrice prototype) {
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
   * Protobuf type {@code submit_booking.PaymentPrice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:submit_booking.PaymentPrice)
      schema.PaymentPriceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return schema.SubmitBooking.internal_static_submit_booking_PaymentPrice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return schema.SubmitBooking.internal_static_submit_booking_PaymentPrice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              schema.PaymentPrice.class, schema.PaymentPrice.Builder.class);
    }

    // Construct using schema.PaymentPrice.newBuilder()
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
      if (priceBreakdownBuilder_ == null) {
        priceBreakdown_ = null;
      } else {
        priceBreakdown_ = null;
        priceBreakdownBuilder_ = null;
      }
      if (totalAmountBuilder_ == null) {
        totalAmount_ = null;
      } else {
        totalAmount_ = null;
        totalAmountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return schema.SubmitBooking.internal_static_submit_booking_PaymentPrice_descriptor;
    }

    @java.lang.Override
    public schema.PaymentPrice getDefaultInstanceForType() {
      return schema.PaymentPrice.getDefaultInstance();
    }

    @java.lang.Override
    public schema.PaymentPrice build() {
      schema.PaymentPrice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public schema.PaymentPrice buildPartial() {
      schema.PaymentPrice result = new schema.PaymentPrice(this);
      if (priceBreakdownBuilder_ == null) {
        result.priceBreakdown_ = priceBreakdown_;
      } else {
        result.priceBreakdown_ = priceBreakdownBuilder_.build();
      }
      if (totalAmountBuilder_ == null) {
        result.totalAmount_ = totalAmount_;
      } else {
        result.totalAmount_ = totalAmountBuilder_.build();
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
      if (other instanceof schema.PaymentPrice) {
        return mergeFrom((schema.PaymentPrice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(schema.PaymentPrice other) {
      if (other == schema.PaymentPrice.getDefaultInstance()) return this;
      if (other.hasPriceBreakdown()) {
        mergePriceBreakdown(other.getPriceBreakdown());
      }
      if (other.hasTotalAmount()) {
        mergeTotalAmount(other.getTotalAmount());
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
      schema.PaymentPrice parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (schema.PaymentPrice) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private schema.PriceBreakdown priceBreakdown_;
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.PriceBreakdown, schema.PriceBreakdown.Builder, schema.PriceBreakdownOrBuilder> priceBreakdownBuilder_;
    /**
     * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
     */
    public boolean hasPriceBreakdown() {
      return priceBreakdownBuilder_ != null || priceBreakdown_ != null;
    }
    /**
     * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
     */
    public schema.PriceBreakdown getPriceBreakdown() {
      if (priceBreakdownBuilder_ == null) {
        return priceBreakdown_ == null ? schema.PriceBreakdown.getDefaultInstance() : priceBreakdown_;
      } else {
        return priceBreakdownBuilder_.getMessage();
      }
    }
    /**
     * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
     */
    public Builder setPriceBreakdown(schema.PriceBreakdown value) {
      if (priceBreakdownBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        priceBreakdown_ = value;
        onChanged();
      } else {
        priceBreakdownBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
     */
    public Builder setPriceBreakdown(
        schema.PriceBreakdown.Builder builderForValue) {
      if (priceBreakdownBuilder_ == null) {
        priceBreakdown_ = builderForValue.build();
        onChanged();
      } else {
        priceBreakdownBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
     */
    public Builder mergePriceBreakdown(schema.PriceBreakdown value) {
      if (priceBreakdownBuilder_ == null) {
        if (priceBreakdown_ != null) {
          priceBreakdown_ =
            schema.PriceBreakdown.newBuilder(priceBreakdown_).mergeFrom(value).buildPartial();
        } else {
          priceBreakdown_ = value;
        }
        onChanged();
      } else {
        priceBreakdownBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
     */
    public Builder clearPriceBreakdown() {
      if (priceBreakdownBuilder_ == null) {
        priceBreakdown_ = null;
        onChanged();
      } else {
        priceBreakdown_ = null;
        priceBreakdownBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
     */
    public schema.PriceBreakdown.Builder getPriceBreakdownBuilder() {
      
      onChanged();
      return getPriceBreakdownFieldBuilder().getBuilder();
    }
    /**
     * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
     */
    public schema.PriceBreakdownOrBuilder getPriceBreakdownOrBuilder() {
      if (priceBreakdownBuilder_ != null) {
        return priceBreakdownBuilder_.getMessageOrBuilder();
      } else {
        return priceBreakdown_ == null ?
            schema.PriceBreakdown.getDefaultInstance() : priceBreakdown_;
      }
    }
    /**
     * <code>.submit_booking.PriceBreakdown price_breakdown = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.PriceBreakdown, schema.PriceBreakdown.Builder, schema.PriceBreakdownOrBuilder> 
        getPriceBreakdownFieldBuilder() {
      if (priceBreakdownBuilder_ == null) {
        priceBreakdownBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            schema.PriceBreakdown, schema.PriceBreakdown.Builder, schema.PriceBreakdownOrBuilder>(
                getPriceBreakdown(),
                getParentForChildren(),
                isClean());
        priceBreakdown_ = null;
      }
      return priceBreakdownBuilder_;
    }

    private schema.Price totalAmount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.Price, schema.Price.Builder, schema.PriceOrBuilder> totalAmountBuilder_;
    /**
     * <code>.submit_booking.Price total_amount = 2;</code>
     */
    public boolean hasTotalAmount() {
      return totalAmountBuilder_ != null || totalAmount_ != null;
    }
    /**
     * <code>.submit_booking.Price total_amount = 2;</code>
     */
    public schema.Price getTotalAmount() {
      if (totalAmountBuilder_ == null) {
        return totalAmount_ == null ? schema.Price.getDefaultInstance() : totalAmount_;
      } else {
        return totalAmountBuilder_.getMessage();
      }
    }
    /**
     * <code>.submit_booking.Price total_amount = 2;</code>
     */
    public Builder setTotalAmount(schema.Price value) {
      if (totalAmountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        totalAmount_ = value;
        onChanged();
      } else {
        totalAmountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.Price total_amount = 2;</code>
     */
    public Builder setTotalAmount(
        schema.Price.Builder builderForValue) {
      if (totalAmountBuilder_ == null) {
        totalAmount_ = builderForValue.build();
        onChanged();
      } else {
        totalAmountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.submit_booking.Price total_amount = 2;</code>
     */
    public Builder mergeTotalAmount(schema.Price value) {
      if (totalAmountBuilder_ == null) {
        if (totalAmount_ != null) {
          totalAmount_ =
            schema.Price.newBuilder(totalAmount_).mergeFrom(value).buildPartial();
        } else {
          totalAmount_ = value;
        }
        onChanged();
      } else {
        totalAmountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.Price total_amount = 2;</code>
     */
    public Builder clearTotalAmount() {
      if (totalAmountBuilder_ == null) {
        totalAmount_ = null;
        onChanged();
      } else {
        totalAmount_ = null;
        totalAmountBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.submit_booking.Price total_amount = 2;</code>
     */
    public schema.Price.Builder getTotalAmountBuilder() {
      
      onChanged();
      return getTotalAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.submit_booking.Price total_amount = 2;</code>
     */
    public schema.PriceOrBuilder getTotalAmountOrBuilder() {
      if (totalAmountBuilder_ != null) {
        return totalAmountBuilder_.getMessageOrBuilder();
      } else {
        return totalAmount_ == null ?
            schema.Price.getDefaultInstance() : totalAmount_;
      }
    }
    /**
     * <code>.submit_booking.Price total_amount = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.Price, schema.Price.Builder, schema.PriceOrBuilder> 
        getTotalAmountFieldBuilder() {
      if (totalAmountBuilder_ == null) {
        totalAmountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            schema.Price, schema.Price.Builder, schema.PriceOrBuilder>(
                getTotalAmount(),
                getParentForChildren(),
                isClean());
        totalAmount_ = null;
      }
      return totalAmountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:submit_booking.PaymentPrice)
  }

  // @@protoc_insertion_point(class_scope:submit_booking.PaymentPrice)
  private static final schema.PaymentPrice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new schema.PaymentPrice();
  }

  public static schema.PaymentPrice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaymentPrice>
      PARSER = new com.google.protobuf.AbstractParser<PaymentPrice>() {
    @java.lang.Override
    public PaymentPrice parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaymentPrice(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaymentPrice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaymentPrice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public schema.PaymentPrice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
