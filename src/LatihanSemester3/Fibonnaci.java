package LatihanSemester3;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        if (angka < 1){
            System.out.println("0");
        } else if (angka < 2) {
            System.out.println("0 1");
        }else {
            int a = 0;
            int b = 1;
            System.out.print("0 1");
            for (int i = 2; i < angka ; i++) {
                int fibonacci = a + b;
                a = b;
                b = fibonacci;
                System.out.print(" " + fibonacci);
            }
        }
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
}
