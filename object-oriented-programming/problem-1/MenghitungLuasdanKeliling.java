import java.util.Scanner;

public class MenghitungLuasdanKeliling {
    public static void main(String[] args) {
        int sisi, panjang,lebar, opsi,a,t;
        double luas, keliling;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan bidang yang mau dihitung ");
        System.out.println("1. Persegi\n2. Persegi Panjang \n3. Segitiga ");
        opsi = scan.nextInt();
        System.out.println("----------------------------");
        switch (opsi){
            case 1 :
                System.out.print("Masukkan panjang sisi persegi: ");
                sisi = scan.nextInt();
                luas = sisi * sisi;
                keliling = 4*sisi;
                System.out.println("Keliling Persegi adalah " + keliling);
                System.out.println("Luas Persegi adalah " + luas);
                break;
            case 2 :
                System.out.print("Masukkan panjang : ");
                panjang = scan.nextInt();
                System.out.print("Masukkan lebar : ");
                lebar = scan.nextInt();
                luas = panjang * lebar;
                keliling = panjang + lebar +panjang + lebar;
                System.out.println("Keliling Persegi Panjang adalah " + keliling);
                System.out.println("Luas Persegi Panjang adalah " + luas);
                break;
            case 3 :
                System.out.print("Masukan Alas : ");
                a=scan.nextInt();
                System.out.print("Masukan Tinggi : ");
                t=scan.nextInt();
                luas=0.5*a*t;
                keliling = a*3;
                System.out.println("Keliling Segitiga  adalah " + keliling);
                System.out.println("Luas Segitiga adalah "+luas);
                break;
            default :
                System.out.println("Salah memasukan pilihan");


        }
    }

}
