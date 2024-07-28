package Devcode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Kartini {
    public static void main(String[] args) {
        String suratKartini = "Hola amigo, espero que esta carta te encuentre bien. Quer??a compartir mi historia sobre la lucha por los derechos de las mujeres. Espero que esta carta pueda inspirar y difundir el esp??ritu de igualdad. Gracias por tu atenci??n.";
        System.out.println(hitungJumlahKata(suratKartini));
        System.out.println(hitungHariSekolahKartini("20-05-2022"));
    }
    // kasus pertama
    static int hitungJumlahKata(String surat) {
        String kataPerKata [] = surat.trim().split("\\s+");
        return kataPerKata.length;
    }
    static int hitungHariSekolahKartini(String tanggal) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            // Mengubah string tanggal menjadi Date
            Date tanggalInput = sdf.parse(tanggal);
            Date tanggalAwal = sdf.parse("15-07-1912");

            // Menghitung selisih hari
            long diffInMillies = Math.abs(tanggalInput.getTime() - tanggalAwal.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            return (int) diff;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1; // Mengembalikan -1 jika terjadi error
        }
    }

}
