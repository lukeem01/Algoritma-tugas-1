package Tugas_Sesi_5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
    static ArrayList<String> namaBuah = new ArrayList<>();
    static ArrayList<Integer> jumlahBuah = new ArrayList<>();
    static ArrayList<Integer> hargaBuah = new ArrayList<>();
    static int totalBelanja = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar Buah dan Harga
        String[][] buah = {
            {"apel", "3000"},
            {"jeruk", "5000"},
            {"mangga", "2500"},
            {"duku", "15000"},
            {"semangka", "20000"}
        };

        int pilihan;
        String inputLagi = "y";

        do {
            System.out.println("Menu: ");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.print("Masukan Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan buffer setelah nextInt()

            if (pilihan == 3) {
                System.out.print("Apakah anda yakin ingin keluar? (y/n): ");
                String confirmExit = sc.nextLine();
                if (confirmExit.equalsIgnoreCase("y")) {
                    System.out.println("Anda telah keluar dari program");
                    break;
                } else {
                    continue;
                }
            }

            switch (pilihan) {
                case 1:
                    System.out.println("Buah yang tersedia: ");
                    for (int i = 0; i < buah.length; i++) {
                        System.out.println((i + 1) + ". " + buah[i][0] + " - Rp" + buah[i][1]);
                    }

                    System.out.print("Buah yang ingin anda beli (nomor): ");
                    int buahrDipilih = sc.nextInt() - 1;

                    if (buahrDipilih >= 0 && buahrDipilih < buah.length) {
                        System.out.print("Masukan jumlah: ");
                        int jumlah = sc.nextInt();

                        String nama = buah[buahrDipilih][0];
                        int harga = Integer.parseInt(buah[buahrDipilih][1]);
                        int subtotal = jumlah * harga;

                        // Tambahkan ke keranjang
                        namaBuah.add(nama);
                        jumlahBuah.add(jumlah);
                        hargaBuah.add(harga);
                        totalBelanja += subtotal;

                        System.out.println(nama + " telah ditambahkan ke dalam keranjang");
                    } else {
                        System.out.println("Masukan berupa angka yang tersedia");
                    }
                    sc.nextLine(); // membersihkan buffer setelah nextInt()
                    break;

                case 2:
                    if (namaBuah.isEmpty()) {
                        System.out.println("Anda belum membeli apapun");
                    } else {
                        System.out.println("Daftar Belanja:");
                        System.out.println("=".repeat(30));
                        System.out.println("No.\tNama Buah\tJumlah\tHarga\tSubtotal");

                        for (int i = 0; i < namaBuah.size(); i++) {
                            String nama = namaBuah.get(i);
                            int jumlah = jumlahBuah.get(i);
                            int harga = hargaBuah.get(i);
                            int subtotal = jumlah * harga;

                            System.out.printf("%d\t%s\t%d\t%d\t%d\n", i + 1, nama, jumlah, harga, subtotal);
                        }

                        System.out.println("=".repeat(30));
                        System.out.println("Total: " + totalBelanja);
                        double diskon = totalBelanja * 0.15;
                        double totalBayar = totalBelanja - diskon;
                        System.out.println("Discount (15%): -Rp" + diskon);
                        System.out.println("Total bayar: Rp" + totalBayar);
                    }
                    break;

                default:
                    System.out.println("Masukan pilihan yang tersedia");
                    break;
            }

            System.out.print("Apakah ingin kembali ke menu utama? (y/n): ");
            inputLagi = sc.nextLine(); // Membaca input kembali ke menu utama dengan benar

        } while (inputLagi.equalsIgnoreCase("y"));
        
        sc.close();
    }
}
