package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import model.SubmitBookingRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Base64;

public class ModelConverter {
    private ModelConverter() {
    }

    public static SubmitBookingRequest parseJsonToModel(String strJson) {
        // model deserialize
        SubmitBookingRequest submitBookingRequest = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            submitBookingRequest = mapper.readValue(strJson, SubmitBookingRequest.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return submitBookingRequest;
    }

//    public static SubmitBookingRequest parseJsonToModel(HttpServletRequest request) {
//        String strJson = "";
//        try {
//            strJson = StreamReader.read(request.getInputStream());
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        return parseJsonToModel(strJson);
//    }

//    public static SubmitBookingRequest parseProtoToModel(HttpServletRequest request) {
//        SubmitBookingRequest submitBookingRequest = null;
//
//        try {
//            InputStream stream = request.getInputStream();
//            SubmitBookingRQ rawRequest = SubmitBookingRQ.parseFrom(stream);
//
//            submitBookingRequest = convertProtoRequestToModelRequest(rawRequest);
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        return submitBookingRequest;
//    }

    public static <T> String serializeModel(T t) {
        String strJson = "";

        try {
            ObjectMapper mapper = new ObjectMapper();
            strJson = mapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return strJson;
    }

    public static <T> T deserializeModel(String strJson, Class<T> var1) {
        // model deserialize
        T submitBookingRequest = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            submitBookingRequest = mapper.readValue(strJson, var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return submitBookingRequest;
    }

    public static <T extends GeneratedMessageV3> String serializeProtoJson(T t) {

        String strJson = "";
        try {
            ObjectMapper mapper = new ObjectMapper();
            strJson = JsonFormat.printer().print(t);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strJson;
    }

    public static <T extends GeneratedMessageV3> T deserializeProto(String message, Class<T> clazz) {
        try {
            Method method = clazz.getMethod("newBuilder");
            T.Builder builder = (T.Builder) method.invoke(null);
            JsonFormat.parser().merge(message, builder);
            return (T) builder.build();
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Parse model error.");
    }

//    @CheckForNull
//    public static SubmitBooking.SubmitBookingRQ deserializeProtoRequest(String strJson) throws InvalidProtocolBufferException {
//        SubmitBooking.SubmitBookingRQ.Builder submitBookingRQBuilder =
//                SubmitBooking.SubmitBookingRQ.newBuilder();
//        JsonFormat.parser().merge(strJson, submitBookingRQBuilder);
//        return submitBookingRQBuilder.build();
//    }


//
//    public static SubmitBookingRequest convertProtoRequestToModelRequest(SubmitBooking.SubmitBookingRQ submitBookingRQ) {
//        if (submitBookingRQ == null) {
//            return null;
//        }
//        SubmitBookingRequest submitBookingRequest = null;
//
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            String strJson = JsonFormat.printer().print(submitBookingRQ);
//            submitBookingRequest = mapper.readValue(strJson, SubmitBookingRequest.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return submitBookingRequest;
//    }





}
