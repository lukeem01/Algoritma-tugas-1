package UTS;

import java.util.Scanner;

public class UpahLembur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menghitung Total Gaji");
        System.out.print("Masukan Gaji : ");
        Double Gaji = sc.nextDouble();
        System.err.print("Masukan Total Lembur(jam): ");
        Double JamLembur = sc.nextDouble();
        Double LemburLebih  = 0.0;
        if (JamLembur>5){
            LemburLebih = JamLembur - 5.0;
            JamLembur = 5.0;
        }

        Double UpahLembur = (Double) Math.ceil(Gaji/150);
        Double TotalGaji = Gaji + (JamLembur*UpahLembur) + (LemburLebih*1.5*UpahLembur);
        System.out.println("Total Gaji: "+TotalGaji);
        sc.close();
    } 
}
