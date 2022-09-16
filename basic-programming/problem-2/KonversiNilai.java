import java.util.Scanner;

public class KonversiNilai {
    public static void main (String [] args ) {
        Scanner keyboard = new Scanner(System.in);
        float nilai ;
        System.out.println("Masukan Nilai : ");
        nilai = keyboard.nextFloat();

        if (nilai >=80 && nilai <=100 ){
            System.out.println("Scorenya adalah : A ");
        }
        else if (nilai >=65 && nilai <80) {
            System.out.println("Scorenya adalah : B+ ");
        }
        else if (nilai >=50 && nilai <65) {
            System.out.println("Scorenya adalah : B ");
        }
        else if (nilai >=35 && nilai <50) {
            System.out.println("Scorenya adalah : C ");
        }
        else if (nilai >=0 && nilai <35) {
            System.out.println("Scorenya adalah : D ");
        }
        else {
            System.out.println("Invalid ");

        }
    }
}
