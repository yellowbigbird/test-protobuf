// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: submit_booking.proto

package schema;

public interface SelectedOfferItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:submit_booking.SelectedOfferItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * leg id list
   * </pre>
   *
   * <code>repeated string leg_references = 1;</code>
   */
  java.util.List<java.lang.String>
      getLegReferencesList();
  /**
   * <pre>
   * leg id list
   * </pre>
   *
   * <code>repeated string leg_references = 1;</code>
   */
  int getLegReferencesCount();
  /**
   * <pre>
   * leg id list
   * </pre>
   *
   * <code>repeated string leg_references = 1;</code>
   */
  java.lang.String getLegReferences(int index);
  /**
   * <pre>
   * leg id list
   * </pre>
   *
   * <code>repeated string leg_references = 1;</code>
   */
  com.google.protobuf.ByteString
      getLegReferencesBytes(int index);

  /**
   * <code>string offer_item_id = 2;</code>
   */
  java.lang.String getOfferItemId();
  /**
   * <code>string offer_item_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getOfferItemIdBytes();

  /**
   * <pre>
   * segment id list
   * </pre>
   *
   * <code>repeated string segment_references = 3;</code>
   */
  java.util.List<java.lang.String>
      getSegmentReferencesList();
  /**
   * <pre>
   * segment id list
   * </pre>
   *
   * <code>repeated string segment_references = 3;</code>
   */
  int getSegmentReferencesCount();
  /**
   * <pre>
   * segment id list
   * </pre>
   *
   * <code>repeated string segment_references = 3;</code>
   */
  java.lang.String getSegmentReferences(int index);
  /**
   * <pre>
   * segment id list
   * </pre>
   *
   * <code>repeated string segment_references = 3;</code>
   */
  com.google.protobuf.ByteString
      getSegmentReferencesBytes(int index);

  /**
   * <pre>
   * traveler id list
   * </pre>
   *
   * <code>repeated string traveler_references = 4;</code>
   */
  java.util.List<java.lang.String>
      getTravelerReferencesList();
  /**
   * <pre>
   * traveler id list
   * </pre>
   *
   * <code>repeated string traveler_references = 4;</code>
   */
  int getTravelerReferencesCount();
  /**
   * <pre>
   * traveler id list
   * </pre>
   *
   * <code>repeated string traveler_references = 4;</code>
   */
  java.lang.String getTravelerReferences(int index);
  /**
   * <pre>
   * traveler id list
   * </pre>
   *
   * <code>repeated string traveler_references = 4;</code>
   */
  com.google.protobuf.ByteString
      getTravelerReferencesBytes(int index);
}