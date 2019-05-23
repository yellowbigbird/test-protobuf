// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: submit_booking.proto

package schema;

public interface LegOrBuilder extends
    // @@protoc_insertion_point(interface_extends:submit_booking.Leg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.submit_booking.TransportInfo destination = 1;</code>
   */
  boolean hasDestination();
  /**
   * <code>.submit_booking.TransportInfo destination = 1;</code>
   */
  schema.TransportInfo getDestination();
  /**
   * <code>.submit_booking.TransportInfo destination = 1;</code>
   */
  schema.TransportInfoOrBuilder getDestinationOrBuilder();

  /**
   * <code>string leg_id = 2;</code>
   */
  java.lang.String getLegId();
  /**
   * <code>string leg_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getLegIdBytes();

  /**
   * <code>.submit_booking.TransportInfo origin = 3;</code>
   */
  boolean hasOrigin();
  /**
   * <code>.submit_booking.TransportInfo origin = 3;</code>
   */
  schema.TransportInfo getOrigin();
  /**
   * <code>.submit_booking.TransportInfo origin = 3;</code>
   */
  schema.TransportInfoOrBuilder getOriginOrBuilder();

  /**
   * <pre>
   * segment id list
   * </pre>
   *
   * <code>repeated string segment_references = 4;</code>
   */
  java.util.List<java.lang.String>
      getSegmentReferencesList();
  /**
   * <pre>
   * segment id list
   * </pre>
   *
   * <code>repeated string segment_references = 4;</code>
   */
  int getSegmentReferencesCount();
  /**
   * <pre>
   * segment id list
   * </pre>
   *
   * <code>repeated string segment_references = 4;</code>
   */
  java.lang.String getSegmentReferences(int index);
  /**
   * <pre>
   * segment id list
   * </pre>
   *
   * <code>repeated string segment_references = 4;</code>
   */
  com.google.protobuf.ByteString
      getSegmentReferencesBytes(int index);
}