package Semester3;

public class Faktorial {
    public static void main(String[] args) {
        System.out.println("rekursif: " + faktorial(5));
        System.out.println("loop: " + loop(5));

    }
    public static int faktorial(int angka ){
        if (angka < 0){
            return 0;
        }
        if (angka < 2){
            return 1;
        }
        return angka * faktorial(angka -1);

    }
    public static int loop(int angka){
        int faktorial = 1;
        if (angka < 0) {
            return 0;
        }
        if (angka < 2){
            return 1;
        }

        for (int i = 1; i <= angka ; i++) {
            faktorial += faktorial * i;

        }
        return faktorial;

    }
}
