package Devcode;

import java.util.Arrays;

public class HariGuru {
    public static void main(String[] args) {
        String [] daftarnama = {"Andila","Iqbal","Diwan","Ismail","Arnold","Akyas","Steven","Toufik","Yosua","Yusraf","Imanual","Rizqo"};
        String [] bagi = {"Pohan","Dandy","Sholihin","Najah"};
        for (String dafatar : daftarnama){
            System.out.println(dafatar);
        }
        System.out.println(absensiMuridBaru(daftarnama));
        System.out.println(pembagianKelompok(bagi));
    }
    static String absensiMuridBaru(String[] daftarNama) {
        Arrays.sort(daftarNama);
        StringBuilder stringBuilder = new StringBuilder("Absensi: ");
        for (int i = 0; i < daftarNama.length; i++) {
            stringBuilder.append(daftarNama[i]);
            if (i < daftarNama.length -1){
                stringBuilder.append(",");
            }
            if (i == daftarNama.length -2){
                stringBuilder.append("dan ");
            }
        }
        stringBuilder.append(" ");

        return stringBuilder.toString();
    }
    static String pembagianKelompok(String[] daftarMurid) {
        StringBuilder scbd = new StringBuilder();
        int indexKIri = 0;
        int indexKanan = daftarMurid.length - 1;
        for (int i = 0; i < daftarMurid.length-2; i++) {
            if (indexKIri == indexKanan){
                scbd.append("(").append(daftarMurid[indexKIri]).append(")");
            }else {
                scbd.append("(").append(daftarMurid[indexKIri]).append(",").append(daftarMurid[indexKanan]).append(")");
            }
            indexKIri++;
            indexKanan--;
        }
        return scbd.toString();
    }
}
