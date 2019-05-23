package util;

import org.apache.servicecomb.foundation.protobuf.ProtoMapper;
import org.apache.servicecomb.foundation.protobuf.ProtoMapperFactory;
import org.apache.servicecomb.foundation.protobuf.RootDeserializer;
import org.apache.servicecomb.foundation.protobuf.RootSerializer;

import java.io.IOException;

public class ServiceCombUtil {
    ProtoMapperFactory factory = new ProtoMapperFactory();
    ProtoMapper protoMapper = null;
    String className = "";

    public ServiceCombUtil(String strProtoFilePath, String name) {
        protoMapper = factory.createFromName(strProtoFilePath);
        className = name;
    }

    public <T> byte[] serialize(T t) {
        RootSerializer serializer = protoMapper.createRootSerializer(className, (Class<T>)t.getClass());

        byte[] pojoBytes= new byte[0];
        try {
            pojoBytes = serializer.serialize(t);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pojoBytes;
    }

    public <T> T deserialize(byte[] content, Class<T> clazz) {
        RootDeserializer<T> pojoDeserializer = protoMapper.createRootDeserializer(className, clazz);

        T t = null;
        try {
            t = pojoDeserializer.deserialize(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }
}
