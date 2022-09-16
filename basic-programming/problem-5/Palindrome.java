import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String kata, reverse = "";
        int  cek = 0 ;
        System.out.println("Masukan Kata : ");
        kata = keyboard.nextLine();
        int length = kata.length();
        for (int i = length-1;i>=0;i--)
            reverse = reverse + kata.charAt(i);
        if (kata.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("bukan palindrome");
    }
}
