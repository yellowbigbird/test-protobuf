package util;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Test;
import validate.ValidateRequest;
//import schema.Price;
//import schema.SubmitBookingRQ;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ServiceCombTest {
    @Test
    public void testEqual_SubmitBookingRequest() throws InvalidProtocolBufferException {
        String strJson = getFileContent("SubmitBookingRQType.json");

        // proto class
        schema.SubmitBookingRQ protoClass = ModelConverter.deserializeProto(strJson, schema.SubmitBookingRQ.class);
        byte[] bytesProtobuf = protoClass.toByteArray();
        String strBytesProtobuf = ProtobufUtil.convertByteArrayToString(bytesProtobuf);

        //init converter
        ServiceCombUtil serviceCombUtil = new ServiceCombUtil("submit_booking.proto", "SubmitBookingRQ");

        // model
        model.SubmitBookingRequest modelClass = serviceCombUtil.deserialize(bytesProtobuf, model.SubmitBookingRequest.class);

        // serialize
        byte[] bytesProtostuff = serviceCombUtil.serialize(modelClass);
        String strBytesProtostuff = ProtobufUtil.convertByteArrayToString(bytesProtostuff);

        String strJsonProtobuf = ModelConverter.serializeProtoJson(protoClass);
        String strJsonProtostuff = ModelConverter.serializeModel(modelClass);

        System.out.println(strBytesProtobuf);
        System.out.println(strBytesProtostuff);
        System.out.println("");
//        System.out.println(strJsonProtobuf);
//        System.out.println(strJsonProtostuff);

//        assertEquals(strJson, strJsonProtostuff);
        assertEquals(strBytesProtobuf, strBytesProtostuff);
    }

    @Test
    public void testEqual_price() throws InvalidProtocolBufferException {
        String strJson = "{\"amount\":{\"amount\":110.5},\"currency\":\"EUR\"}";

        // proto class
        schema.Price priceProto = ModelConverter.deserializeProto(strJson, schema.Price.class);
        byte[] bytesProtobuf = priceProto.toByteArray();
        String strBase64Protobuf = ProtobufUtil.convertByteArrayToString(bytesProtobuf);

        // model
        ServiceCombUtil serviceCombUtil = new ServiceCombUtil("submit_booking.proto", "Price");
        model.Price priceModel = serviceCombUtil.deserialize(bytesProtobuf, model.Price.class);

        // serialize
        byte[] bytesProtostuff = serviceCombUtil.serialize(priceModel);
        String strBase64Protostuff = ProtobufUtil.convertByteArrayToString(bytesProtostuff);
        String strJson1 = ModelConverter.serializeModel(priceModel);

        System.out.println(strBase64Protobuf);
        System.out.println(strBase64Protostuff);

        assertEquals(strJson, strJson1);
        assertEquals(strBase64Protostuff, strBase64Protobuf);
    }

    @Test
    public void testEqual_additionalInfo() throws InvalidProtocolBufferException {
        String strJson = "{\n" +
                "    \"info\": {\n" +
                "      \"str0\": \"dummy0\",\n" +
                "      \"str1\": \"dummy1\"\n" +
                "    }\n" +
                "  }";

        // proto class
        schema.AdditionalInfos protoClass = ModelConverter.deserializeProto(strJson, schema.AdditionalInfos.class);
        byte[] bytesProtobuf = protoClass.toByteArray();
        String strBytesProtobuf = ProtobufUtil.convertByteArrayToString(bytesProtobuf);


        // model
        ServiceCombUtil serviceCombUtil = new ServiceCombUtil("submit_booking.proto", "AdditionalInfos");
        model.AdditionalInfos modelClass = serviceCombUtil.deserialize(bytesProtobuf, model.AdditionalInfos.class);

        // serialize
        byte[] bytesProtostuff = serviceCombUtil.serialize(modelClass);
        String strBytesProtostuff = ProtobufUtil.convertByteArrayToString(bytesProtostuff);
        String strJsonProtostuff = ModelConverter.serializeModel(modelClass);

        System.out.println(strBytesProtobuf);
        System.out.println(strBytesProtostuff);


//        assertEquals(strJson, strJsonProtostuff);
        assertEquals(strBytesProtobuf, strBytesProtostuff);

    }

    @Test
    public void testEqual_SelectedOfferItem() throws InvalidProtocolBufferException {
        String strJson = "{\n" +
                "        \"legReferences\": [\n" +
                "          \"leg_SHA_LON\",\n" +
                "          \"leg_SHA_hkg\"\n" +
                "        ],\n" +
                "        \"offerItemId\": \"offer_item_01\",\n" +
                "        \"segmentReferences\": [\n" +
                "          \"seg_SHA_LON\"\n" +
                "        ],\n" +
                "        \"travelerReferences\": [\n" +
                "          \"traveller_0\"\n" +
                "        ]\n" +
                "      }";

        // proto class
        schema.SelectedOfferItem protoClass = ModelConverter.deserializeProto(strJson, schema.SelectedOfferItem.class);
        byte[] bytesProtobuf = protoClass.toByteArray();
        String strBytesProtobuf = ProtobufUtil.convertByteArrayToString(bytesProtobuf);

        //init converter
        ServiceCombUtil serviceCombUtil = new ServiceCombUtil("submit_booking.proto", "SelectedOfferItem");

        // model
        model.SelectedOfferItem modelClass = serviceCombUtil.deserialize(bytesProtobuf, model.SelectedOfferItem.class);

        // serialize
        byte[] bytesProtostuff = serviceCombUtil.serialize(modelClass);
        String strBytesProtostuff = ProtobufUtil.convertByteArrayToString(bytesProtostuff);
        String strJsonProtostuff = ModelConverter.serializeModel(modelClass);

        System.out.println(strBytesProtobuf);
        System.out.println(strBytesProtostuff);

//        assertEquals(strJson, strJsonProtostuff);
        assertEquals(strBytesProtobuf, strBytesProtostuff);

        String str1 = protoClass.toString();
        String strValidate = ValidateRequest.validate(modelClass);
        assertNotNull(strValidate);
    }

    @Test
    public void testEqual_basicinfo() throws InvalidProtocolBufferException {
        String strJson = getFileContent("basicinfo.json");

        // proto class
        schema.BasicInfo protoClass = ModelConverter.deserializeProto(strJson, schema.BasicInfo.class);
//                ProtobufUtil.deserializeProtoBasicinfo(strJson);
        byte[] bytesProtobuf = protoClass.toByteArray();
        String strBytesProtobuf = ProtobufUtil.convertByteArrayToString(bytesProtobuf);

        //init converter
        ServiceCombUtil serviceCombUtil = new ServiceCombUtil("submit_booking.proto", "BasicInfo");

        // model
        model.BasicInfo modelClass = serviceCombUtil.deserialize(bytesProtobuf, model.BasicInfo.class);

        // serialize
        byte[] bytesProtostuff = serviceCombUtil.serialize(modelClass);
        String strBytesProtostuff = ProtobufUtil.convertByteArrayToString(bytesProtostuff);

//        String strJsonProtobuf = ModelConverter.serializeProtoJson(protoClass);
        String strJsonProtostuff = ModelConverter.serializeModel(modelClass);

        System.out.println(strBytesProtobuf);
        System.out.println(strBytesProtostuff);
        System.out.println("");
//        System.out.println(strJsonProtobuf);
//        System.out.println(strJsonProtostuff);

//        assertEquals(strJson, strJsonProtostuff);
        assertEquals(strBytesProtobuf, strBytesProtostuff);
    }


    public String getFileContent(String fileName){
        String strPath = this.getClass().getClassLoader().getResource(fileName).getPath();
        return FileUtil.readFile(strPath);
    }
}
