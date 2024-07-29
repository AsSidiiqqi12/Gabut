package Devcode;

import java.util.Arrays;

public class KebunMinion {
    public static void main(String[] args) {
        String[] buah = {"pisang","apel","pisang","anggur","pisang"};
        System.out.println(Arrays.toString(pisangDuplikat(buah)));

    }
    static String[] pisangDuplikat(String[] daftarBuah) {

        int untukIndex = 0;
        String[] duplikat = new String[daftarBuah.length];
        for (int i = 0; i < daftarBuah.length -1 ; i++) {
            if (daftarBuah[i].equals(daftarBuah[i + 1])) {
                if (untukIndex == 0 || !duplikat[untukIndex - 1].equals(daftarBuah[i])) {
                    duplikat[untukIndex] = daftarBuah[i];
                    untukIndex++;
                }
            }
        }
        String[] result = new String[untukIndex];
        System.arraycopy(duplikat, 0, result, 0, untukIndex);

        return result;

    }
}
