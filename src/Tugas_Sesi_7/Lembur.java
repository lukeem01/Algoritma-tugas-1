package Tugas_Sesi_7;

import java.util.Scanner;

public class Lembur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menghitung total gaji");
        System.out.print("Masukan gaji : ");
        int gaji = sc.nextInt();
        System.err.print("Masukan total lembur(jam): ");
        int jamLembur = sc.nextInt();
        int lemburLebih  = 0;
        if (jamLembur>4){
            lemburLebih = jamLembur - 4;
            jamLembur = 4;
        }

        int UpahLembur = (int) Math.ceil(gaji/173);
        int totalGaji = gaji + (jamLembur*UpahLembur) + (lemburLebih*2*UpahLembur);
        System.out.println("Total Gaji: "+totalGaji);
        sc.close();
    }    
}