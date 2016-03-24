package packet.chapter03;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

public class MapAttributesExample {

public static void main(String[] args) throws Exception {
        Path path = Paths.get("/home/docs/users.txt");
        try {
            Map<String, Object> attrsMap = Files.readAttributes(path, "*");
            Set<String> keys = attrsMap.keySet();
            
            for(String attribute : keys) {
                System.out.println(attribute + ": "
                        + Files.getAttribute(path, attribute));                
            }        
         } finally{
        	 
         }
    }

}