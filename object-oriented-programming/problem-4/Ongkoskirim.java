import java.util.Scanner;

public class Ongkoskirim {
    public static void main(String[] args) {
        int berat, tinggi, panjang,lebar, harga = 5000;
        double ongkos,volume;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Panjang : ");
        panjang = scan.nextInt();
        System.out.println("Masukan Lebar   : ");
        lebar = scan.nextInt();
        System.out.println("Masukan Tinggi  : ");
        tinggi = scan.nextInt();
        System.out.println("Masukan Berat   : ");
        berat = scan.nextInt();
        System.out.println("----------------------------");
        volume = panjang*lebar*tinggi;
        if (volume >50){
            ongkos = volume*harga;
            System.out.println("Harga ongkirnya adalah : " + ongkos);
        }
        else {
            ongkos = berat*harga;
            System.out.println("Harga ongkirnya adalah : " + ongkos);
        }
    }
}
