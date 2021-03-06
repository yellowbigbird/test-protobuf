// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: submit_booking.proto

package schema;

public interface BasicInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:submit_booking.BasicInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * e.g.EUR
   * </pre>
   *
   * <code>string currency = 1;</code>
   */
  java.lang.String getCurrency();
  /**
   * <pre>
   * e.g.EUR
   * </pre>
   *
   * <code>string currency = 1;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <pre>
   * the URL of deeplink
   * </pre>
   *
   * <code>string deep_link = 2;</code>
   */
  java.lang.String getDeepLink();
  /**
   * <pre>
   * the URL of deeplink
   * </pre>
   *
   * <code>string deep_link = 2;</code>
   */
  com.google.protobuf.ByteString
      getDeepLinkBytes();

  /**
   * <pre>
   * e.g.en-GB, pattern value="^[a-z]{2}-[a-zA-Z]{2}$"
   * </pre>
   *
   * <code>string locale = 3;</code>
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * e.g.en-GB, pattern value="^[a-z]{2}-[a-zA-Z]{2}$"
   * </pre>
   *
   * <code>string locale = 3;</code>
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <code>.submit_booking.PointOfSale point_of_sale = 4;</code>
   */
  boolean hasPointOfSale();
  /**
   * <code>.submit_booking.PointOfSale point_of_sale = 4;</code>
   */
  schema.PointOfSale getPointOfSale();
  /**
   * <code>.submit_booking.PointOfSale point_of_sale = 4;</code>
   */
  schema.PointOfSaleOrBuilder getPointOfSaleOrBuilder();

  /**
   * <code>.submit_booking.BasicInfo.Proposition proposition = 5;</code>
   */
  int getPropositionValue();
  /**
   * <code>.submit_booking.BasicInfo.Proposition proposition = 5;</code>
   */
  schema.BasicInfo.Proposition getProposition();

  /**
   * <code>bool test_booking = 6;</code>
   */
  boolean getTestBooking();

  /**
   * <pre>
   * Skyscanner website ID. e.g. byoj
   * </pre>
   *
   * <code>string website_id = 7;</code>
   */
  java.lang.String getWebsiteId();
  /**
   * <pre>
   * Skyscanner website ID. e.g. byoj
   * </pre>
   *
   * <code>string website_id = 7;</code>
   */
  com.google.protobuf.ByteString
      getWebsiteIdBytes();
}
