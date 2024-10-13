package Tugas_Sesi_3;
import java.util.Scanner;

public class LulusOrNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai Pelajar : ");
        double nilaiPelajar = input.nextDouble();

        String keterangan;
        if (nilaiPelajar>= 75) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }
        System.out.println("Keterangan: " + keterangan);
        input.close();
    }
}
