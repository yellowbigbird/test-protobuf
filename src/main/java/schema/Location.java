// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: submit_booking.proto

package schema;

/**
 * Protobuf type {@code submit_booking.Location}
 */
public  final class Location extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:submit_booking.Location)
    LocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Location.newBuilder() to construct.
  private Location(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Location() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Location(
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
            schema.City.Builder subBuilder = null;
            if (city_ != null) {
              subBuilder = city_.toBuilder();
            }
            city_ = input.readMessage(schema.City.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(city_);
              city_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            schema.Country.Builder subBuilder = null;
            if (country_ != null) {
              subBuilder = country_.toBuilder();
            }
            country_ = input.readMessage(schema.Country.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(country_);
              country_ = subBuilder.buildPartial();
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
    return schema.SubmitBooking.internal_static_submit_booking_Location_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return schema.SubmitBooking.internal_static_submit_booking_Location_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            schema.Location.class, schema.Location.Builder.class);
  }

  public static final int CITY_FIELD_NUMBER = 1;
  private schema.City city_;
  /**
   * <code>.submit_booking.City city = 1;</code>
   */
  public boolean hasCity() {
    return city_ != null;
  }
  /**
   * <code>.submit_booking.City city = 1;</code>
   */
  public schema.City getCity() {
    return city_ == null ? schema.City.getDefaultInstance() : city_;
  }
  /**
   * <code>.submit_booking.City city = 1;</code>
   */
  public schema.CityOrBuilder getCityOrBuilder() {
    return getCity();
  }

  public static final int COUNTRY_FIELD_NUMBER = 2;
  private schema.Country country_;
  /**
   * <code>.submit_booking.Country country = 2;</code>
   */
  public boolean hasCountry() {
    return country_ != null;
  }
  /**
   * <code>.submit_booking.Country country = 2;</code>
   */
  public schema.Country getCountry() {
    return country_ == null ? schema.Country.getDefaultInstance() : country_;
  }
  /**
   * <code>.submit_booking.Country country = 2;</code>
   */
  public schema.CountryOrBuilder getCountryOrBuilder() {
    return getCountry();
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
    if (city_ != null) {
      output.writeMessage(1, getCity());
    }
    if (country_ != null) {
      output.writeMessage(2, getCountry());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (city_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCity());
    }
    if (country_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCountry());
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
    if (!(obj instanceof schema.Location)) {
      return super.equals(obj);
    }
    schema.Location other = (schema.Location) obj;

    if (hasCity() != other.hasCity()) return false;
    if (hasCity()) {
      if (!getCity()
          .equals(other.getCity())) return false;
    }
    if (hasCountry() != other.hasCountry()) return false;
    if (hasCountry()) {
      if (!getCountry()
          .equals(other.getCountry())) return false;
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
    if (hasCity()) {
      hash = (37 * hash) + CITY_FIELD_NUMBER;
      hash = (53 * hash) + getCity().hashCode();
    }
    if (hasCountry()) {
      hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
      hash = (53 * hash) + getCountry().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static schema.Location parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static schema.Location parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static schema.Location parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static schema.Location parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static schema.Location parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static schema.Location parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static schema.Location parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static schema.Location parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static schema.Location parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static schema.Location parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static schema.Location parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static schema.Location parseFrom(
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
  public static Builder newBuilder(schema.Location prototype) {
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
   * Protobuf type {@code submit_booking.Location}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:submit_booking.Location)
      schema.LocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return schema.SubmitBooking.internal_static_submit_booking_Location_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return schema.SubmitBooking.internal_static_submit_booking_Location_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              schema.Location.class, schema.Location.Builder.class);
    }

    // Construct using schema.Location.newBuilder()
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
      if (cityBuilder_ == null) {
        city_ = null;
      } else {
        city_ = null;
        cityBuilder_ = null;
      }
      if (countryBuilder_ == null) {
        country_ = null;
      } else {
        country_ = null;
        countryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return schema.SubmitBooking.internal_static_submit_booking_Location_descriptor;
    }

    @java.lang.Override
    public schema.Location getDefaultInstanceForType() {
      return schema.Location.getDefaultInstance();
    }

    @java.lang.Override
    public schema.Location build() {
      schema.Location result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public schema.Location buildPartial() {
      schema.Location result = new schema.Location(this);
      if (cityBuilder_ == null) {
        result.city_ = city_;
      } else {
        result.city_ = cityBuilder_.build();
      }
      if (countryBuilder_ == null) {
        result.country_ = country_;
      } else {
        result.country_ = countryBuilder_.build();
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
      if (other instanceof schema.Location) {
        return mergeFrom((schema.Location)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(schema.Location other) {
      if (other == schema.Location.getDefaultInstance()) return this;
      if (other.hasCity()) {
        mergeCity(other.getCity());
      }
      if (other.hasCountry()) {
        mergeCountry(other.getCountry());
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
      schema.Location parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (schema.Location) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private schema.City city_;
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.City, schema.City.Builder, schema.CityOrBuilder> cityBuilder_;
    /**
     * <code>.submit_booking.City city = 1;</code>
     */
    public boolean hasCity() {
      return cityBuilder_ != null || city_ != null;
    }
    /**
     * <code>.submit_booking.City city = 1;</code>
     */
    public schema.City getCity() {
      if (cityBuilder_ == null) {
        return city_ == null ? schema.City.getDefaultInstance() : city_;
      } else {
        return cityBuilder_.getMessage();
      }
    }
    /**
     * <code>.submit_booking.City city = 1;</code>
     */
    public Builder setCity(schema.City value) {
      if (cityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        city_ = value;
        onChanged();
      } else {
        cityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.City city = 1;</code>
     */
    public Builder setCity(
        schema.City.Builder builderForValue) {
      if (cityBuilder_ == null) {
        city_ = builderForValue.build();
        onChanged();
      } else {
        cityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.submit_booking.City city = 1;</code>
     */
    public Builder mergeCity(schema.City value) {
      if (cityBuilder_ == null) {
        if (city_ != null) {
          city_ =
            schema.City.newBuilder(city_).mergeFrom(value).buildPartial();
        } else {
          city_ = value;
        }
        onChanged();
      } else {
        cityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.City city = 1;</code>
     */
    public Builder clearCity() {
      if (cityBuilder_ == null) {
        city_ = null;
        onChanged();
      } else {
        city_ = null;
        cityBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.submit_booking.City city = 1;</code>
     */
    public schema.City.Builder getCityBuilder() {
      
      onChanged();
      return getCityFieldBuilder().getBuilder();
    }
    /**
     * <code>.submit_booking.City city = 1;</code>
     */
    public schema.CityOrBuilder getCityOrBuilder() {
      if (cityBuilder_ != null) {
        return cityBuilder_.getMessageOrBuilder();
      } else {
        return city_ == null ?
            schema.City.getDefaultInstance() : city_;
      }
    }
    /**
     * <code>.submit_booking.City city = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.City, schema.City.Builder, schema.CityOrBuilder> 
        getCityFieldBuilder() {
      if (cityBuilder_ == null) {
        cityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            schema.City, schema.City.Builder, schema.CityOrBuilder>(
                getCity(),
                getParentForChildren(),
                isClean());
        city_ = null;
      }
      return cityBuilder_;
    }

    private schema.Country country_;
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.Country, schema.Country.Builder, schema.CountryOrBuilder> countryBuilder_;
    /**
     * <code>.submit_booking.Country country = 2;</code>
     */
    public boolean hasCountry() {
      return countryBuilder_ != null || country_ != null;
    }
    /**
     * <code>.submit_booking.Country country = 2;</code>
     */
    public schema.Country getCountry() {
      if (countryBuilder_ == null) {
        return country_ == null ? schema.Country.getDefaultInstance() : country_;
      } else {
        return countryBuilder_.getMessage();
      }
    }
    /**
     * <code>.submit_booking.Country country = 2;</code>
     */
    public Builder setCountry(schema.Country value) {
      if (countryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        country_ = value;
        onChanged();
      } else {
        countryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.Country country = 2;</code>
     */
    public Builder setCountry(
        schema.Country.Builder builderForValue) {
      if (countryBuilder_ == null) {
        country_ = builderForValue.build();
        onChanged();
      } else {
        countryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.submit_booking.Country country = 2;</code>
     */
    public Builder mergeCountry(schema.Country value) {
      if (countryBuilder_ == null) {
        if (country_ != null) {
          country_ =
            schema.Country.newBuilder(country_).mergeFrom(value).buildPartial();
        } else {
          country_ = value;
        }
        onChanged();
      } else {
        countryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.submit_booking.Country country = 2;</code>
     */
    public Builder clearCountry() {
      if (countryBuilder_ == null) {
        country_ = null;
        onChanged();
      } else {
        country_ = null;
        countryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.submit_booking.Country country = 2;</code>
     */
    public schema.Country.Builder getCountryBuilder() {
      
      onChanged();
      return getCountryFieldBuilder().getBuilder();
    }
    /**
     * <code>.submit_booking.Country country = 2;</code>
     */
    public schema.CountryOrBuilder getCountryOrBuilder() {
      if (countryBuilder_ != null) {
        return countryBuilder_.getMessageOrBuilder();
      } else {
        return country_ == null ?
            schema.Country.getDefaultInstance() : country_;
      }
    }
    /**
     * <code>.submit_booking.Country country = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        schema.Country, schema.Country.Builder, schema.CountryOrBuilder> 
        getCountryFieldBuilder() {
      if (countryBuilder_ == null) {
        countryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            schema.Country, schema.Country.Builder, schema.CountryOrBuilder>(
                getCountry(),
                getParentForChildren(),
                isClean());
        country_ = null;
      }
      return countryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:submit_booking.Location)
  }

  // @@protoc_insertion_point(class_scope:submit_booking.Location)
  private static final schema.Location DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new schema.Location();
  }

  public static schema.Location getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Location>
      PARSER = new com.google.protobuf.AbstractParser<Location>() {
    @java.lang.Override
    public Location parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Location(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Location> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Location> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public schema.Location getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

