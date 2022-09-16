import java.util.Scanner;

public class MenghitungVolume {

    public static void main(String[] args) {
        int tinggi, panjang,lebar, opsi;
        double volume;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan bidang yang mau dihitung ");
        System.out.println("1. Kubus\n2. Balok\n3. Tabung");
        opsi = scan.nextInt();
        System.out.println("----------------------------");
        switch (opsi){
            case 1 :
                System.out.println("Masukan panjang sisi Kubus : ");
                panjang = scan.nextInt();
                volume = panjang*panjang*panjang;
                System.out.println("Volume kubus adalah: " + volume);
                break;
            case 2 :
                System.out.print("Masukan Panjang Balok: ");
                panjang = scan.nextInt();
                System.out.print("Masukan Lebar balok: ");
                lebar = scan.nextInt();
                System.out.print("Masukan Tinggi Balok: ");
                tinggi = scan.nextInt();
                volume =  panjang*lebar*tinggi ;
                System.out.println("Volume Balok  adalah: " + volume);
                break;
            case 3 :
                System.out.println("Masukan jari-jari Tabung : ");
                panjang = scan.nextInt();
                System.out.println("Masukan tinggi Tabung : ");
                tinggi = scan.nextInt();
                volume = (panjang*panjang*3.14)*tinggi;
                System.out.println("Volume Tabung  adalah: " + volume);
                break;
            default :
                System.out.println("Salah memasukan pilihan");
        }
    }

}
