package Tutorial;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Latihan9 {
    public static void main(String[] args) {
        String format = "yyyy-MM-dd HH:mm:ss a";//format untuk tahun-bulan-hari jam:menit:detik AM/PM
        SimpleDateFormat jakartaFormat = new SimpleDateFormat(format);//add format tadi
        String waktuTempat = TimeZone.getDefault().getID();//default ID setempat (ASIA/JAKARTA)
        System.out.println(waktuTempat);
        Calendar cl = new GregorianCalendar();
        TimeZone Jakrta = TimeZone.getTimeZone("Asia/Jakarta");
        cl.setTimeZone(Jakrta);
        System.out.println("Tanggal: "+ jakartaFormat.format(cl.getTime()));
        System.out.println("Zona waktu: " + cl.getTimeZone().getID());
        System.out.println("Nama zona waktu: " + cl.getTimeZone().getDisplayName());

        System.out.println("========================================");

        TimeZone Israel = TimeZone.getTimeZone("Israel");
        SimpleDateFormat IsraelFormat = new SimpleDateFormat(format);
        IsraelFormat.setTimeZone(Israel);
        cl.setTimeZone(Israel);
        System.out.println("Tanggal: "+ IsraelFormat.format(cl.getTime()));
        System.out.println("Zona waktu: " + cl.getTimeZone().getID());
        System.out.println("Nama zona waktu: " + cl.getTimeZone().getDisplayName());

        System.out.println("========================================");


        TimeZone GMT = TimeZone.getTimeZone("GMT");
        SimpleDateFormat gmtFormat = new SimpleDateFormat(format);
        gmtFormat.setTimeZone(GMT);
        cl.setTimeZone(GMT);
        System.out.println("Tanggal: " + gmtFormat.format(cl.getTime()));
        System.out.println("Zona waktu: " + cl.getTimeZone().getID());
        System.out.println("Nama Zona waktu: " + cl.getTimeZone().getDisplayName());


    }
}
