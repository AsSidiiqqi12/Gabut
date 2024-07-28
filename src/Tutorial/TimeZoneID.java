package Tutorial;
import java.util.TimeZone;

public class TimeZoneID {
    public static void main(String[] args) {
        String [] ZonaID = TimeZone.getAvailableIDs();
        for (String id : ZonaID){
            System.out.println(id);
        }
    }


}
