import java.util.Scanner;

public class Pemilihan2Percobaan207{

    public static void main(String [] args) {

        Scanner input7 =new Scanner(System.in);

        float sudut1;
        float sudut2;
        float sudut3;
        float totalSudut;

        System.out.print("Masukan Sudut 1 : ");
        sudut1 = input7.nextFloat();

        System.out.print("Masukan Sudut 2 : ");
        sudut2 = input7.nextFloat();

        System.out.print("Masukan Sudut 3 : ");
        sudut3 = input7.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan Segitiga");

    }
}