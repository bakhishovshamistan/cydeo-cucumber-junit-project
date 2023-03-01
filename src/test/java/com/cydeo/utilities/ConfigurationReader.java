package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    //1- Create object of Properties
    // make it "private" to limit access to the object
    //"static" is to make sure its created and loaded before everything else.
    private static Properties properties = new Properties();

    static {

        try {
            //2-We need to open file using FileInputStream (open file)
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties file in the Properties object(load properties)
            properties.load(file);

            //CLOSE THE FILE IN THE MEMORY
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
        }

    }




    //4- Use the "properties" object to read value from the file(read properties)

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}
