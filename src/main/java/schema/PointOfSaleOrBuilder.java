// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: submit_booking.proto

package schema;

public interface PointOfSaleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:submit_booking.PointOfSale)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.submit_booking.DeviceInfo device_info = 1;</code>
   */
  boolean hasDeviceInfo();
  /**
   * <code>.submit_booking.DeviceInfo device_info = 1;</code>
   */
  schema.DeviceInfo getDeviceInfo();
  /**
   * <code>.submit_booking.DeviceInfo device_info = 1;</code>
   */
  schema.DeviceInfoOrBuilder getDeviceInfoOrBuilder();

  /**
   * <code>.submit_booking.Location location = 2;</code>
   */
  boolean hasLocation();
  /**
   * <code>.submit_booking.Location location = 2;</code>
   */
  schema.Location getLocation();
  /**
   * <code>.submit_booking.Location location = 2;</code>
   */
  schema.LocationOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * e.g.UK,pattern value="^[A-Z]{2}$"
   * </pre>
   *
   * <code>string market = 3;</code>
   */
  java.lang.String getMarket();
  /**
   * <pre>
   * e.g.UK,pattern value="^[A-Z]{2}$"
   * </pre>
   *
   * <code>string market = 3;</code>
   */
  com.google.protobuf.ByteString
      getMarketBytes();
}