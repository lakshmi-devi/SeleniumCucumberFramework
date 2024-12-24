package driverfactory;

import java.io.IOException;
import java.util.Properties;

public class ManufactonUrlPageFactory {


    private static ManufactonUrlPageFactory instance = null;
    private Properties properties;

    protected ManufactonUrlPageFactory() throws IOException{

        properties = new Properties();
        properties.load(this.getClass().getResourceAsStream("../com/properties/ManufactonUrls.properties"));
    }

    public static ManufactonUrlPageFactory getInstance() {
        if(instance == null) {
            try {
                instance = new ManufactonUrlPageFactory();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return instance;
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

}
