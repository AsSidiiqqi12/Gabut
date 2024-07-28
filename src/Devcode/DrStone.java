package Devcode;

public class DrStone {
    public static void main(String[] args) {
        System.out.println(totalAirDikumpulkan(1));
        System.out.println(hitungLangkahEksperimen(12));
        System.out.println(cekRamuan(" CHHHOHH", "OHNOO"));
    }
    static double totalAirDikumpulkan(int waktu) {
        float total = waktu * 0.36f;
        return (double) Math.round(total * 100) / 100;
    }
    static int hitungLangkahEksperimen(int jumlahBahan) {
        int a = 0, b = 1;
        int [] fibo = new int [jumlahBahan];
        for (int i = 1; i < jumlahBahan; i++) {
            fibo[i] = a + b;
            a = b;
            b = fibo[i];
        }
        return fibo[jumlahBahan - 1];
    }
    public static boolean cekRamuan(String zatKimia1, String zatKimia2) {
        String etanol = "C2H5OH";
        String asamNitrat = "NHO3";

        // Cek apakah zat kimia 1 dapat membentuk etanol
        boolean etanol1 = cekZatKimia(zatKimia1, etanol);

        // Cek apakah zat kimia 2 dapat membentuk asam nitrat
        boolean asamNitrat2 = cekZatKimia(zatKimia2, asamNitrat);

        // Cek apakah zat kimia 1 dapat membentuk asam nitrat
        boolean asamNitrat1 = cekZatKimia(zatKimia1, asamNitrat);

        // Cek apakah zat kimia 2 dapat membentuk etanol
        boolean etanol2 = cekZatKimia(zatKimia2, etanol);

        // Jika salah satu pasangan dapat membentuk ramuan yang efektif, maka return true
        return (etanol1 && asamNitrat2 && cekJumlahAtom(zatKimia1, etanol) && cekJumlahAtom(zatKimia2, asamNitrat)) ||
                (asamNitrat1 && etanol2 && cekJumlahAtom(zatKimia1, asamNitrat) && cekJumlahAtom(zatKimia2, etanol));
    }
    public static boolean cekZatKimia(String zatKimia, String target) {
        int[] count = new int[26]; // 26 huruf alphabet

        // Hitung frekuensi huruf pada zat kimia
        for (char c : zatKimia.toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                count[c - 'A']++;
            }
        }

        // Cek apakah frekuensi huruf pada zat kimia sesuai dengan target
        for (char c : target.toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                if (count[c - 'A'] < 1) {
                    return false;
                }
                count[c - 'A']--;
            }
        }

        return true;
    }

    public static boolean cekJumlahAtom(String zatKimia, String target) {
        int[] countZatKimia = new int[26];
        int[] countTarget = new int[26];

        for (char c : zatKimia.toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                countZatKimia[c - 'A']++;
            }
        }

        for (char c : target.toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                countTarget[c - 'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (countTarget[i] > countZatKimia[i]) {
                return false;
            }
        }

        return true;
    }
}
