package Devcode;

import java.util.Arrays;

public class Haikyuu {
    public static void main(String[] args) {
        int [] skor = {0,0};
        String [] hasilKarasuno = {"W","w","D","W","L"};
        int [] hasilSemua = {5,8,4,6,2};
        System.out.println(Arrays.toString(hitungSkorPertandingan(true, "in", skor)));
        System.out.println(cekLolos(hasilKarasuno,hasilSemua));
    }
    //Menghitung skor pertandingan
    static int[] hitungSkorPertandingan(boolean isTeamA, String status, int[] skorPertandingan) {
        if (isTeamA) {//jika team a true dengan maksud team a yang melakukan serangan
            if (status.equals("out")) {//jika serangan out
                skorPertandingan[0] += 1;
            }else if (status.equals("in")){
                skorPertandingan[1] += 1;
            }
        }else {
            if (status.equals("out")) {
                skorPertandingan[0] += 1;
            }else if (status.equals("in")){
                skorPertandingan[1] += 1;
            }
        }
        return skorPertandingan;
    }
    static String cekLolos(String[] hasilKarasuno, int[] poinGrup) {
        int poinKarasuno = 0;
        for (String hasil : hasilKarasuno) {
            switch (hasil) {
                case "W": // Kemenangan
                    poinKarasuno += 2;
                    break;
                case "D": // Hasil imbang
                    poinKarasuno += 1;
                    break;
                case "L": // Kekalahan
                    // Tidak ada poin yang ditambahkan
                    break;
            }
        }
        Arrays.sort(poinGrup);
        if (poinGrup[0] < poinKarasuno || poinGrup[1] < poinKarasuno){
            return "lolos";
        }else {
            return "gagal";
        }
    }
    

}
