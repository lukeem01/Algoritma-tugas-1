package Qeueu;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Student {
    String nama;
    int kelas;
    String status;

    Student(String nama, int kelas, String status) {
        this.nama = nama;
        this.kelas = kelas;
        this.status = status;
    }
}

public class ArrayTabel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Student> studentsQueue = new ArrayDeque<>();
        String inputLagi = "y";
        int sum = 0;

        do {
            System.out.print("Masukan Nama Mahasiswa: ");
            String nama = sc.next();

            // Validasi input nilai
            int kelas;
            do {
                System.out.print("Masukan Nilai Mahasiswa: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Nilai harus berupa angka! Silakan masukkan lagi.");
                    sc.next();
                }
                kelas = sc.nextInt();
                if (kelas < 0 || kelas > 100) {
                    System.out.println("Nilai harus antara 0 dan 100. Silakan masukkan lagi.");
                }
            } while (kelas < 0 || kelas > 100);

            // Menentukan keterangan
            String status = (kelas >= 75) ? "Lulus" : "Tidak Lulus";
            studentsQueue.add(new Student(nama, kelas, status));

            sc.nextLine();
            System.out.print("Tambah Mahasiswa Lagi? (y/n): ");
            inputLagi = sc.nextLine().trim().toLowerCase();

            sum += kelas;
        } while (inputLagi.equals("y"));

        // Cetak daftar mahasiswa
        System.out.println("\nDaftar Mahasiswa");
        System.out.printf("%-4s %-15s %-6s %-12s\n", "No", "Nama", "Nilai", "Keterangan");
        int i = 1;
        for (Student student : studentsQueue) {
            System.out.printf("%-4d %-15s %-6d %-12s\n", i++, student.nama, student.kelas, student.status);
        }

        // Menghitung rata-rata nilai
        double rataRata = (double) sum / studentsQueue.size();
        System.out.println("\nNilai Rata-Rata Mahasiswa adalah: " + rataRata);

        sc.close();
    }
}
