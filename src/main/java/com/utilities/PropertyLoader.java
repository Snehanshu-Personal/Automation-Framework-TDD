package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    public static Properties loadProperty() {
        Properties prop = new Properties();
        try {
            FileInputStream fis =
                new FileInputStream("src/test/resources/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
        return prop;
    }
}
