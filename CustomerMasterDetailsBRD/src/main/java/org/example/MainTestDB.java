package org.example;
/*
code is developed by Abhishek
*/
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;

public class MainTestDB {
    private static final Logger logger = LogManager.getLogger("Abhshek");

    public static void main(String[] args) throws Exception{
        FileInputStream propertyFile = new FileInputStream("src/main/java/org/example/config.properties");
        Properties properties = new Properties();
        properties.load(propertyFile);
        String fileLocation = properties.getProperty("inputFile1");
        if (!fileLocation.toLowerCase().endsWith(".txt")) {
            logger.info(" Given file is not in format type");
            return;
        }
        try {
            Connection connection = ConnectionClass.getConnection();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(properties.getProperty("inputFile1.txt")));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                while (line.contains("~~")){
                    line=line.replaceAll("~~","~null~");
                }
                if(line.endsWith("~")){
                    line=line.concat("null");
                }
                String[] fields = line.split("~");
                for (int i = 0; i < fields.length; i++) {
                    System.out.print(fields[i] + "  ");
                }
                logger.info("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}