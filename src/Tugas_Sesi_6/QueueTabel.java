package Tugas_Sesi_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTabel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLagi = "y";
        
        Queue<String> mahasiswa = new LinkedList<>();
        Queue<String> keterangan = new LinkedList<>();
        Queue<Integer> nilai = new LinkedList<>();
        
        int sum = 0;
        int i = 0;

        do {
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = sc.next();
            mahasiswa.add(nama);

            System.out.print("Masukkan Nilai Mahasiswa: ");
            int score = sc.nextInt();
            nilai.add(score);

            if (score >= 75) {
                keterangan.add("Lulus");
            } else {
                keterangan.add("Tidak Lulus");
            }

            sum += score;
            sc.nextLine(); 

            System.out.print("Tambah Mahasiswa Lagi? (y/n): ");
            inputLagi = sc.nextLine().toLowerCase();
            i++;
        } while (inputLagi.equals("y"));

        System.out.println("Daftar Mahasiswa");
        System.out.println("No\tNama\tNilai\tKeterangan");
        
        int j = 1;
        while (!mahasiswa.isEmpty()) {
            String nama = mahasiswa.poll();
            int nilaiMahasiswa = nilai.poll();
            String status = keterangan.poll();

            System.out.println(j + "\t" + nama + "\t" + nilaiMahasiswa + "\t" + status);
            j++;
        }

        double rata_rata = (double) sum / i;
        System.out.println("Nilai Rata-Rata Mahasiswa adalah: " + rata_rata);

        sc.close();
    }
}
