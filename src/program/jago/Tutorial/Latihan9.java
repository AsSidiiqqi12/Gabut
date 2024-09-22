package program.jago.Tutorial;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Latihan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahNegara = sc.nextInt();//untuk input jumlah negara yang ingin di konversi waktunya
        sc.nextLine();//untuk membuat baris baru karena ada input int dan String secara berturut
        String[] negaraZonaWaktu = new String[jumlahNegara];//array untuk menyimpan negara yang diinput user
        for (int i = 0; i < jumlahNegara; i++) {//perulangan untuk input negara sebanyak yang diinginkan user
            negaraZonaWaktu[i] = sc.nextLine();
        }
        System.out.println("==============================================");
        for (String negara : negaraZonaWaktu){//perulangan untuk output negara serta tanggal dan zonaID nya perulangan ini menggunakan for each
            konversiWaktu(negara);
            System.out.println("==============================================");
        }

    }
    static void konversiWaktu (String zonaID){//function/method untuk konversi waktu negara
        Calendar calendar = new GregorianCalendar();//objek kalender/deklarasi dengan GreogrianCalender => calander yang dipakai saat ini
        String format = "dd-MM-yyyy HH:mm a";//setel format untuk waktu dan tanggal
        SimpleDateFormat formatWaktu = new SimpleDateFormat(format);//format tanggal
        TimeZone zonaIDtime = TimeZone.getTimeZone(zonaID);//pilih zona untuk konversi
        formatWaktu.setTimeZone(zonaIDtime);//set format waktu berdasarkan zona ID
        calendar.setTimeZone(zonaIDtime);// set calender nanti dipakai untuk zona waktu dan namanya
        System.out.println("Tanggal        : " + formatWaktu.format(calendar.getTime()));
        System.out.println("Zona waktu     : " + calendar.getTimeZone().getID());//mengeluarkan zona
        System.out.println("Nama Zona waktu: " + calendar.getTimeZone().getDisplayName());//mengeluarkan waktu zona contohnya waktu indonesia barat
    }
}
