package program.jago.Tutorial.cobaCoba;

import java.util.Scanner;

public class Jadwa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hari: ");
        String hari = sc.nextLine();

        String[] senin = {"Basis data \njam 8",
                            "Teori bahasa dan automata \njam10",
                            "Pemrogaman Mahir \njam2"};
        String[] selasa = {"Basis data \njam8","Bahasa arab \njam10","Pemrogaman Mahir \njam2"};
        String[] rabu = {"Aljabar Linieer \njam10","Teori bahasa dan automata \njam12","Siat dan tamadun \njam3"};

        if (hari.equalsIgnoreCase("Senin")){
            System.out.println("Ada Matkul hari " + hari);
            for (String senin1 : senin){
                System.out.println(senin1);
            }
        } else if (hari.equalsIgnoreCase("Selasa")) {
            System.out.println("Ada Matkul hari " + hari);
            for (String selasa1 : selasa){
                System.out.println(selasa1);
            }
        } else if (hari.equalsIgnoreCase("Rabu")) {
            System.out.println("Ada Matkul hari " + hari);
            for (String rabu1 : rabu){
                System.out.println(rabu1);
            }
        } else {
            System.out.println("Tidak ada Matkul hari ini");
        }


    }
}
