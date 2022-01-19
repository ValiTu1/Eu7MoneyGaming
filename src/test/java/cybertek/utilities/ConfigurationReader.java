package cybertek.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private ConfigurationReader(){}

    private static Properties properties;


    static{

        try{

            //getting the path to configuration file
            String path = "configuration.properties";

            //creating an instance of Properties class
            properties = new Properties();

            //storing the configuration file into Java memory
            FileInputStream input = new FileInputStream(path);

            //loading information from input file to properties object
            properties.load(input);

            //closing the input file
            input.close();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    //creating get method to get values using the key
    public static String get(String key){
        return properties.getProperty(key);
    }



}
