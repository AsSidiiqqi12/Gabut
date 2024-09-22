package LatihanSemester3;

import java.util.Scanner;

public class FibonacciRe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        System.out.println(fibonacci(angka));

    }
    static int fibonacci(int angka){
        if (angka < 1){
            return 0;
        } else if (angka < 2) {
            return 1;
        } else {
            return fibonacci(angka - 1) + fibonacci(angka - 2);
            /* 3 + 2
                [2 + 1] + [1 + 0]
                1 + 0 + 1 + 1 + 0
                3

             */
        }
    }
}
