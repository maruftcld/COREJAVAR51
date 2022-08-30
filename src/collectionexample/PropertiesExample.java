package collectionexample;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("name1", "Mr. X");
        prop.setProperty("age1", "22");
        
        try {
            prop.store(new FileWriter("file.properties"), "comments");
        } catch (Exception e) {
        }
        
        Properties prop1 = new Properties();
        try {
            prop1.load(new FileReader("file.properties"));
            System.out.println(prop1.getProperty("age1"));
        } catch (Exception e) {
        }
        
         //labeled loop
        NAME1: for (int i = 0; i < 5; i++) {  //3
           
           if(i==3){
               continue;
           }
            System.out.println(i + " hello");            
        }
        
        Date date = new Date();
        System.out.println(date.getTime());
        
        SimpleDateFormat sf = new SimpleDateFormat("YY/MMM/dd");
        System.out.println(sf.format(new Date()));;
    }
    
    
    
}