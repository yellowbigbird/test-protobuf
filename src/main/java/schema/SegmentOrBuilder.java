// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: submit_booking.proto

package schema;

public interface SegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:submit_booking.Segment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.submit_booking.TransportInfo arrival = 1;</code>
   */
  boolean hasArrival();
  /**
   * <code>.submit_booking.TransportInfo arrival = 1;</code>
   */
  schema.TransportInfo getArrival();
  /**
   * <code>.submit_booking.TransportInfo arrival = 1;</code>
   */
  schema.TransportInfoOrBuilder getArrivalOrBuilder();

  /**
   * <code>.submit_booking.TransportInfo departure = 2;</code>
   */
  boolean hasDeparture();
  /**
   * <code>.submit_booking.TransportInfo departure = 2;</code>
   */
  schema.TransportInfo getDeparture();
  /**
   * <code>.submit_booking.TransportInfo departure = 2;</code>
   */
  schema.TransportInfoOrBuilder getDepartureOrBuilder();

  /**
   * <pre>
   * 3-8 char, e.g. WH7LNR
   * </pre>
   *
   * <code>string fare_basis_code = 3;</code>
   */
  java.lang.String getFareBasisCode();
  /**
   * <pre>
   * 3-8 char, e.g. WH7LNR
   * </pre>
   *
   * <code>string fare_basis_code = 3;</code>
   */
  com.google.protobuf.ByteString
      getFareBasisCodeBytes();

  /**
   * <pre>
   * The commercial designation under which a Dated Operating Segment can be booked,
   * either under the operating carrier's designator or that of another carrier (codeshare).
   * </pre>
   *
   * <code>.submit_booking.Carrier marketing_carrier_info = 4;</code>
   */
  boolean hasMarketingCarrierInfo();
  /**
   * <pre>
   * The commercial designation under which a Dated Operating Segment can be booked,
   * either under the operating carrier's designator or that of another carrier (codeshare).
   * </pre>
   *
   * <code>.submit_booking.Carrier marketing_carrier_info = 4;</code>
   */
  schema.Carrier getMarketingCarrierInfo();
  /**
   * <pre>
   * The commercial designation under which a Dated Operating Segment can be booked,
   * either under the operating carrier's designator or that of another carrier (codeshare).
   * </pre>
   *
   * <code>.submit_booking.Carrier marketing_carrier_info = 4;</code>
   */
  schema.CarrierOrBuilder getMarketingCarrierInfoOrBuilder();

  /**
   * <pre>
   * An operation between board point and any subsequent off point within the same flight designator.
   * Could be one or more legs. Could also be used for other transport vehicles such as train or bus etc.
   * </pre>
   *
   * <code>.submit_booking.Carrier operating_carrier_info = 5;</code>
   */
  boolean hasOperatingCarrierInfo();
  /**
   * <pre>
   * An operation between board point and any subsequent off point within the same flight designator.
   * Could be one or more legs. Could also be used for other transport vehicles such as train or bus etc.
   * </pre>
   *
   * <code>.submit_booking.Carrier operating_carrier_info = 5;</code>
   */
  schema.Carrier getOperatingCarrierInfo();
  /**
   * <pre>
   * An operation between board point and any subsequent off point within the same flight designator.
   * Could be one or more legs. Could also be used for other transport vehicles such as train or bus etc.
   * </pre>
   *
   * <code>.submit_booking.Carrier operating_carrier_info = 5;</code>
   */
  schema.CarrierOrBuilder getOperatingCarrierInfoOrBuilder();

  /**
   * <code>string segment_id = 6;</code>
   */
  java.lang.String getSegmentId();
  /**
   * <code>string segment_id = 6;</code>
   */
  com.google.protobuf.ByteString
      getSegmentIdBytes();

  /**
   * <pre>
   * It could be the RBD code passed by airlines in request. (e.g. P, J, W, M, etc.)
   * </pre>
   *
   * <code>string service_class_code = 7;</code>
   */
  java.lang.String getServiceClassCode();
  /**
   * <pre>
   * It could be the RBD code passed by airlines in request. (e.g. P, J, W, M, etc.)
   * </pre>
   *
   * <code>string service_class_code = 7;</code>
   */
  com.google.protobuf.ByteString
      getServiceClassCodeBytes();
}
