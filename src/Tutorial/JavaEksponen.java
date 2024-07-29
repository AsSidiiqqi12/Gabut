package Tutorial;

import java.util.Scanner;

public class JavaEksponen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//buat user input
        int angkaBasis = sc.nextInt();//inisialisasi angka basis melalui input user
        int angkaPangkat = sc.nextInt();// inisialisasi angka pangkat melalui input user
        System.out.println(Math.pow(angkaBasis, angkaPangkat));// output hasil dalam bentuk desimal
        System.out.println((int) Math.pow(angkaBasis, angkaPangkat));// output hasil dalam bentuk int
    }

}
