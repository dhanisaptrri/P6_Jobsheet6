import java.util.Scanner;

public class Pemilihan2Percobaan307Modifikasi {

    public static void main(String [] args){

        Scanner input7 =new Scanner(System.in);

        String kategori;
        int penghasilan;
        int gajiBersih;
        double pajak;

        System.out.print("Masukan Kategori : ");
        kategori = input7.nextLine();
        System.out.print("Masukan Besarnya Penghasilan : ");
        penghasilan = input7.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih =(int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        } else
            System.out.println("Masukan Kategori Salah ");

    }
    
}
