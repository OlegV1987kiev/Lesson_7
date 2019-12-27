import java.util.*;
import java.util.Map.*;

public class Lesson_7_3 {
    public static void main(String[] args) {
        HashMap vehicles = new HashMap();
        vehicles.put("BMW", 5);

        if(!vehicles.isEmpty()) {
            Iterator it = vehicles.entrySet().iterator();
            while(it.hasNext()) {
                Map.Entry obj = (Entry)it.next();
                System.out.println(obj.getValue() );
                System.out.println(obj.getKey());
            }
        }
    }
}