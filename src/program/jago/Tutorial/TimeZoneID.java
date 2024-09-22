package program.jago.Tutorial;
import java.util.Scanner;
import java.util.TimeZone;

public class TimeZoneID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] ZonaID = TimeZone.getAvailableIDs();
        for (String id : ZonaID){
            System.out.println(id);
        }
        String kata = "M";
        int jumlahAjad = 0;
        for (char kata1 : kata.toUpperCase().toCharArray()){
            jumlahAjad += kata1 - 'A' + 1;
        }
        System.out.println(jumlahAjad);
        System.out.println();
        String huruf = sc.nextLine();
        int nilaiHuruf = 0;
        for (int i = 0; i < huruf.length(); i++) {
            char karakterHuruf = huruf.toUpperCase().charAt(i);
            nilaiHuruf += karakterHuruf - 'A' + 1;
        }


        System.out.println(nilaiHuruf);
        System.out.println(huruf.codePointAt(0));

    }


}
