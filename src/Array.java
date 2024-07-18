import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah array ");
        int jumlah = sc.nextInt();
        int [] angka = new int[jumlah];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("array ke- " + i + " ");
            angka[i] = sc.nextInt();
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
        int jumlahAngka1 = 0;
        int jumlahAngka = 1;
        for (int i = 0; i < angka.length; i++) {
            jumlahAngka1++;
            jumlahAngka *= angka[i];
        }
        System.out.println( "Ada " + jumlahAngka1 + " angka ");
        System.out.println("Jumlahnya: " + jumlahAngka);
    }
}
