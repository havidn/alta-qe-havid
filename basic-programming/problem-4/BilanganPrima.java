import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int  number, cek = 0 ;
        System.out.println("Masukan Bilangan : ");
        number = keyboard.nextInt();
        for (int i =2; i<=number; i++){
            if (number%i==0)
                cek++;
        }
        if (cek==1){
            System.out.println("Bilangan Prima");
        }
        else
            System.out.println("Bukan Bilangan Prima");
    }
}
