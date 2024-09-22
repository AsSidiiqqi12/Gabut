package LatihanSemester3;

import java.util.Scanner;

public class Perpangkatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        System.out.print("Masukkan Pangkat: ");
        int pangkat = sc.nextInt();
        int hasil = angka;
        if (pangkat < 1){
            System.out.println(1);
        } else if (pangkat < 2) {
            System.out.println(angka);
        }else {
            for (int i = 1; i < pangkat; i++) {
                hasil *= angka;
            }
            System.out.print(hasil);
        }
    }

}
