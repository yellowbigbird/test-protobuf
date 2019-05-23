package util;

public class ProtobufUtil {

    public static String convertByteArrayToString(byte[] byteArray) {
        StringBuilder sb = new StringBuilder();
        for (byte b : byteArray) {
            sb.append(b);
            sb.append(",");
        }
        return sb.toString();
    }
}
