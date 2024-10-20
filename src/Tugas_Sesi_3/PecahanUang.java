package Tugas_Sesi_3;

import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args) throws Exception {
        Scanner inputUang = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah uang
        System.out.print("Masukkan jumlah uang: ");
        int jumlahUang = inputUang.nextInt();

        // Menghitung jumlah setiap pecahan
        int seratusRibu = jumlahUang / 100000;
        jumlahUang %= 100000;

        int limaPuluhRibu = jumlahUang / 50000;
        jumlahUang %= 50000;

        int duaPuluhRibu = jumlahUang / 20000;
        jumlahUang %= 20000;

        int sepuluhRibu = jumlahUang / 10000;
        jumlahUang %= 10000;

        int limaRibu = jumlahUang / 5000;
        jumlahUang %= 5000;

        int duaRibu = jumlahUang / 2000;
        jumlahUang %= 2000;

        int seribu = jumlahUang / 1000;
        jumlahUang %= 1000;

        int limaRatus = jumlahUang / 500;
        jumlahUang %= 500;

        int seratus = jumlahUang / 100;
        jumlahUang %= 100;

        // Menampilkan hasil pecahan
        System.out.println("Pecahan uang yang didapat:");
        System.out.println("100 ribuan: " + seratusRibu);
        System.out.println("50 ribuan: " + limaPuluhRibu);
        System.out.println("20 ribuan: " + duaPuluhRibu);
        System.out.println("10 ribuan: " + sepuluhRibu);
        System.out.println("5 ribuan: " + limaRibu);
        System.out.println("2 ribuan: " + duaRibu);
        System.out.println("1 ribuan: " + seribu);
        System.out.println("500an: " + limaRatus);
        System.out.println("100an: " + seratus);

        inputUang.close();
    }
}
