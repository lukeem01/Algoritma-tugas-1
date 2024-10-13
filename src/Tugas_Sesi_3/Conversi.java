package Tugas_Sesi_3;
import java.util.Scanner;

public class Conversi {
    public static void main(String[] args) throws Exception {
        Scanner inputanAngka = new Scanner(System.in);
        System.out.print("Masukan Nilai :");
        Double nilai = inputanAngka.nextDouble();
        
        char grade;
        if (nilai > 85) {
            grade = 'A';
        } else if (nilai > 75) {
            grade = 'B';
        } else if (nilai > 65) {
            grade = 'C';
        } else if (nilai > 55) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Nilai Huruf " +grade);

        inputanAngka.close();
    }
}
