package Tugas_Sesi_3;
import java.util.Scanner;

public class GanjilDanGenap {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        
        System.out.print ("Masukan Angka = ");
        int Angka = inputan.nextInt();

        if (Angka % 2 == 0) {
            System.out.println("Maka "+Angka+"itu adalah bilangan genap");
        } else {
            System.out.println("Maka "+Angka+" itu adalah bilangan ganjil");
        }
        inputan.close();
    }
}
