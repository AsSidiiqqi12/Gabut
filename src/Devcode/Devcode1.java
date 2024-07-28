package Devcode;
import java.util.*;

public class Devcode1 {
    public static void main(String[] args) {
        String [] toloh = {"SOENARIO SASTROWARDOYO","cipung","pohan"};
        System.out.println(daftarTokohPenting(toloh)
);
        System.out.println(teksSumpahPemuda(1));
        System.out.println(konversiBiner("11011"));
    }
    static String teksSumpahPemuda(int poin) {
        switch (poin){
            case 1 -> {
                return "KAMI PUTRA DAN PUTRI INDONESIA MENGAKU BERTUMPAH DARAH YANG SATU TANAH AIR INDONESIA";
            }
            case 2 -> {
                return "KAMI PUTRA DAN PUTRI INDONESIA MENGAKU BERBANGSA YANG SATU BANGSA INDONESIA";
            }
            case 3 -> {
                return  "KAMI PUTRA DAN PUTRI INDONESIA MENJUNJUNG BAHASA PERSATUAN BAHASA INDONESIA";
            }
            default -> {
                return "KALIMAT TIDAK DITEMUKAN";
            }
        }
    }
    static int konversiBiner(String pesanBiner) {
        return Integer.parseInt(pesanBiner,2);
    }
    static String daftarTokohPenting(String[] daftarNama) {
        List<String> tokohPenting = Arrays.asList(
                "SOENARIO SASTROWARDOYO",
                "AMIR SYARIFUDDIN HARAHAP",
                "MOHAMMAD YAMIN",
                "DJOKO MARSAID",
                "SOEGONDO DJOJOPOESPITO",
                "JOHANNES LEIMENA"
        );
        List<String> nama = new ArrayList<>();
        for (String namaTokoh : daftarNama) {
            if (tokohPenting.contains(namaTokoh.toUpperCase())) {
                nama.add(namaTokoh);
            }
        }
        if (nama.isEmpty()) {
            return "nama tidak ditemukan";
        } else {
            return nama.toString();
        }
    }

}
