package LatihanSemester3;

import java.util.Scanner;

public class FaktorialRe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        System.out.println(faktorial(angka));
    }
    static long  faktorial(int angka ){
        if (angka < 2){
            return 1;
        }else {
            return angka * faktorial(angka -1);
        }
    }
}
