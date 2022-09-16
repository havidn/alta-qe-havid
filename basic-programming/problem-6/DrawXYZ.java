import java.util.Scanner;

public class DrawXYZ {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int besar_persegi,i,j,k = 0;

        System.out.print("Input besar persegi: ");
        besar_persegi = input.nextInt();

        System.out.println();

        for(i=1; i<=besar_persegi; i++) {
            for(j=1; j<=besar_persegi; j++) {
                k++;
                if (k%3==0){
                    System.out.print("X ");
                }
                else if (k%2==0) {
                    System.out.print("Z ");
                }
                else  {
                    System.out.print("Y ");
                }

            }
            System.out.println();

        }


    }
}
