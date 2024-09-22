package LatihanSemester3;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = sc.nextInt();
        int hasil = 1;
        if (angka < 2){
            System.out.println("Faktorial = " + 1);
        }else{
            for (int i = 2; i <= angka; i++) {
                hasil *= i;
            }
            System.out.println("Faktorial = " + hasil);
        }
    }
}
