package Devcode;

import java.util.Scanner;

public class HariPahlawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tanggal = sc.nextInt();
        System.out.println(peristiwaPenting(tanggal));
        System.out.println(hitungNilaiAbjad("MERDEKA"));
    }
    static String peristiwaPenting(int tanggal) {
        if (tanggal == 1) {
            return "Pada tanggal 1 November 1945, Laskar Hizbullah, sebuah kelompok pemuda yang dipimpin oleh Suhud, berhasil merebut alun-alun Yogyakarta dari penjajah Belanda.";
        } else if (tanggal == 10) {
            return "Tanggal 10 November diperingati sebagai Hari Pahlawan untuk mengenang jasa-jasa para pejuang kemerdekaan Indonesia. Pada tanggal ini, tahun 1945, Letnan Jenderal Soedirman, panglima besar Tentara Nasional Indonesia, wafat.";
        } else if (tanggal == 14) {
            return "Pada tanggal 14 November 1945, Belanda resmi mengakui kedaulatan Republik Indonesia dalam Konferensi Meja Bundar.";
        } else if (tanggal == 17) {
            return "Pada tanggal 17 November 1945, memasuki bulan Muharram tahun 1365 Hijriah, Indonesia memutuskan untuk memakai kalender Hijriah sebagai kalender resmi.";
        } else if (tanggal == 25) {
            return "Tanggal 25 November diperingati sebagai Hari Guru untuk menghormati peran guru dalam pendidikan di Indonesia.";
        } else if (tanggal == 27) {
            return "Pada tanggal 27 November 1945, sebuah pesawat Dakota yang membawa delegasi Indonesia ke Konferensi Asia-Afrika jatuh di Bukit Tinggi, Sumatera Barat.";
        } else if (tanggal == 30) {
            return "Pada tanggal 30 November 1947, Serangan Umum 1 Maret (SU 1 Maret) dimulai, yang merupakan salah satu peristiwa penting dalam perang kemerdekaan Indonesia.";
        }
        return "Tidak ada peristiwa bersejarah pada tanggal tersebut.";
    }
    static int hitungNilaiAbjad(String teks) {
        int jumlahAbjad = 0;
        for (char abjad : teks.toUpperCase().toCharArray()){
            jumlahAbjad += abjad - 'A' + 1;
        }
        return jumlahAbjad;
    }
    static int hitungBendera(String simbol) {
        int simbo = 0;
        int huruf = 0;
        for (int i = 0; i < simbol.length(); i++) {
            char c = simbol.charAt(i);
            if (c == '!'){
                simbo++;
                if (simbo == 3){
                    break;
                }
            }else {
                huruf++;
            }
        }
        return huruf;
    }
}
