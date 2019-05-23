package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUtil {
    private FileUtil() {
    }

    public static final String readFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(path);
        if (!file.exists()) {
            return stringBuilder.toString();
        }

        try(FileInputStream stream = new FileInputStream(file)) {
            int ch = 0;
            while ((ch = stream.read()) != -1) {
                stringBuilder.append((char) ch);
            }
        }
        catch (IOException e) {
            e.printStackTrace(); // todo: log
        }
        return stringBuilder.toString();
    }

}
