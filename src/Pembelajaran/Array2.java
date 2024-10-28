package Pembelajaran;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputAgain = "y";
        String Mahasiswa[] = new String [10];
        int i=0;
        
        do {
            System.out.print("Masukan Nama Mahasiswa = ");
            Mahasiswa[i] = input.nextLine();
            System.out.print(" Tambah Data Nama Mahasiswa Lagi? (y/n) :");
            inputAgain = input.nextLine().toLowerCase();
            i++;
        }while (i < Mahasiswa.length && inputAgain.equals("y"));
        System.out.println("Daftar Nama Mahasiswa");

        for (int j = 0; j< Mahasiswa.length; j++){
            if (Mahasiswa[j] == null){
                break;
            }
            System.out.println((j+1)+". "+Mahasiswa[j]);
        }
        input.close();
    }
}