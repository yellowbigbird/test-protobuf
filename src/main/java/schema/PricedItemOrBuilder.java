// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: submit_booking.proto

package schema;

public interface PricedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:submit_booking.PricedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Base amount for a specific product, purpose, or service.
   * </pre>
   *
   * <code>.submit_booking.Fee base = 1;</code>
   */
  boolean hasBase();
  /**
   * <pre>
   * Base amount for a specific product, purpose, or service.
   * </pre>
   *
   * <code>.submit_booking.Fee base = 1;</code>
   */
  schema.Fee getBase();
  /**
   * <pre>
   * Base amount for a specific product, purpose, or service.
   * </pre>
   *
   * <code>.submit_booking.Fee base = 1;</code>
   */
  schema.FeeOrBuilder getBaseOrBuilder();

  /**
   * <code>string item_id = 2;</code>
   */
  java.lang.String getItemId();
  /**
   * <code>string item_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getItemIdBytes();

  /**
   * <pre>
   * A compulsory contribution to state revenue, levied by the government on workers' income and business profits
   * or added to the cost of some goods, services, and transactions.
   * </pre>
   *
   * <code>repeated .submit_booking.Fee surcharges = 3;</code>
   */
  java.util.List<schema.Fee> 
      getSurchargesList();
  /**
   * <pre>
   * A compulsory contribution to state revenue, levied by the government on workers' income and business profits
   * or added to the cost of some goods, services, and transactions.
   * </pre>
   *
   * <code>repeated .submit_booking.Fee surcharges = 3;</code>
   */
  schema.Fee getSurcharges(int index);
  /**
   * <pre>
   * A compulsory contribution to state revenue, levied by the government on workers' income and business profits
   * or added to the cost of some goods, services, and transactions.
   * </pre>
   *
   * <code>repeated .submit_booking.Fee surcharges = 3;</code>
   */
  int getSurchargesCount();
  /**
   * <pre>
   * A compulsory contribution to state revenue, levied by the government on workers' income and business profits
   * or added to the cost of some goods, services, and transactions.
   * </pre>
   *
   * <code>repeated .submit_booking.Fee surcharges = 3;</code>
   */
  java.util.List<? extends schema.FeeOrBuilder> 
      getSurchargesOrBuilderList();
  /**
   * <pre>
   * A compulsory contribution to state revenue, levied by the government on workers' income and business profits
   * or added to the cost of some goods, services, and transactions.
   * </pre>
   *
   * <code>repeated .submit_booking.Fee surcharges = 3;</code>
   */
  schema.FeeOrBuilder getSurchargesOrBuilder(
      int index);

  /**
   * <pre>
   * Amount added on to a charge for a specific product, purpose, or service.
   * </pre>
   *
   * <code>repeated .submit_booking.Tax tax = 4;</code>
   */
  java.util.List<schema.Tax> 
      getTaxList();
  /**
   * <pre>
   * Amount added on to a charge for a specific product, purpose, or service.
   * </pre>
   *
   * <code>repeated .submit_booking.Tax tax = 4;</code>
   */
  schema.Tax getTax(int index);
  /**
   * <pre>
   * Amount added on to a charge for a specific product, purpose, or service.
   * </pre>
   *
   * <code>repeated .submit_booking.Tax tax = 4;</code>
   */
  int getTaxCount();
  /**
   * <pre>
   * Amount added on to a charge for a specific product, purpose, or service.
   * </pre>
   *
   * <code>repeated .submit_booking.Tax tax = 4;</code>
   */
  java.util.List<? extends schema.TaxOrBuilder> 
      getTaxOrBuilderList();
  /**
   * <pre>
   * Amount added on to a charge for a specific product, purpose, or service.
   * </pre>
   *
   * <code>repeated .submit_booking.Tax tax = 4;</code>
   */
  schema.TaxOrBuilder getTaxOrBuilder(
      int index);

  /**
   * <code>.submit_booking.Price total_amount = 5;</code>
   */
  boolean hasTotalAmount();
  /**
   * <code>.submit_booking.Price total_amount = 5;</code>
   */
  schema.Price getTotalAmount();
  /**
   * <code>.submit_booking.Price total_amount = 5;</code>
   */
  schema.PriceOrBuilder getTotalAmountOrBuilder();
}
