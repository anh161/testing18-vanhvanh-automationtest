package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties  properties = new Properties();

    //Static block: chạy 1 lần duy nhất khi class được gọi lên
    static {
        // lấy file trong thư mục resources => getResourcesAsStream()
        try(InputStream in = ConfigReader.class.getResourceAsStream("/config.properties")){
            properties.load(in);
        } catch (Exception e){
            throw new RuntimeException(" không đọc được file config.properties", e);
        }
    }

    public static String get(String key){
        return properties.getProperty(key);

    }


}
