import java.util.Scanner;

public class MenghitungLuasSegitiga {
    public static void main (String [] args ) {
        Scanner keyboard = new Scanner(System.in);
        float alas, tinggi, luas ;
        System.out.println("Masukan Alas : ");
        alas = keyboard.nextFloat();
        System.out.println("Masukan Tinggi : ");
        tinggi = keyboard.nextFloat();
        luas = alas*tinggi/2;
        System.out.println("Luasnya adalah : " +luas);
    }
}
