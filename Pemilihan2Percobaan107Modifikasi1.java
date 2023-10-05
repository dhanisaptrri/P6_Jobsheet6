import java.util.Scanner;

public class Pemilihan2Percobaan107Modifikasi1{

    public static void main(String [] args){

        Scanner input7 =new Scanner(System.in);

        int tahun;
        System.out.print("Masukan tahun: ");
        tahun= input7.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat");
            else
            System.out.println("Bukan Tahun Kabisat");
       }else
        System.out.println("Bukan Tahun Kabisat");
    }
}