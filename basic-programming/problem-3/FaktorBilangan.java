import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int bilangan ;
        System.out.println("Masukan Angka : ");
        bilangan = keyboard.nextInt();
        System.out.println("Faktor dari "+bilangan + "adalah : ");
        for(int i =1 ; i <= bilangan; i++){
            if(bilangan%i == 0 ){
                System.out.print(i + ", ");
            }
        }
    }
}
