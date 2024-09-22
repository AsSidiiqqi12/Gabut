package LatihanSemester3;

import java.util.Scanner;

public class PerpangkatanRe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        System.out.print("Masukkan pangkat");
        int pangkat = sc.nextInt();
        System.out.println(pangkat(angka, pangkat));
        System.out.println(Math.pow(angka,pangkat));

    }
    static int pangkat (int angka, int pangkatan){
        if (pangkatan == 0){
            return 1;
        }else{
            return angka * pangkat(angka,pangkatan-1);
        }
    }
}
