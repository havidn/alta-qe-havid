import java.util.Scanner;

public class Mean {
    public static void main(String[] args)
    {
        int input;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan banyak data: ");
        input = scan.nextInt();

        System.out.println("\nMasukkan isi data berupa angka:");
        int[] data =  new int[input];
        for (int i = 0; i < input; i++)
        {
            System.out.print("- Isi Data ke-" +(i + 1)+ " = ");
            data[i] = scan.nextInt();
        }

        System.out.println("\nHasil Perhitungan:");
        System.out.printf("- Mean\t\t= %.1f%n", mean(data));

    }
    static double mean(int[] data)
    {
        int tambah = 0;
        for (int dataTambah : data)
        {
            tambah += dataTambah;
        }

        return tambah / (double) data.length;
    }
    static int[] urutkan(int[] data)
    {
        int temp;
        for (int i = 0; i < data.length-1; i++)
        {
            for (int j = data.length-1; j > i; j--)
            {
                if (data[j-1] > data[j])
                {
                    temp        = data[j];
                    data[j]     = data[j-1];
                    data[j-1]   = temp;
                }
            }
        }

        return data;
    }
}
