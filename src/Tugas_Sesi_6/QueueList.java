package Tugas_Sesi_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueList {
    static Queue<Queue<String>> Buah = new LinkedList<>();
    static Queue<String> NamaBuah = new LinkedList<>();
    static Queue<Integer> JumlahBuah = new LinkedList<>();
    static Queue<Integer> HargaBuah = new LinkedList<>();
    static int TotalBelanja = 0;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Initialize the list of fruits with name and price using Queue of Queues
        Queue<String> Buah1 = new LinkedList<>();
        Buah1.add("Apel");
        Buah1.add("35000");
        Buah.add(Buah1);

        Queue<String> Buah2 = new LinkedList<>();
        Buah2.add("Jeruk");
        Buah2.add("50000");
        Buah.add(Buah2);

        Queue<String> Buah3 = new LinkedList<>();
        Buah3.add("Mangga");
        Buah3.add("25000");
        Buah.add(Buah3);

        Queue<String> Buah4 = new LinkedList<>();
        Buah4.add("Duku");
        Buah4.add("15000");
        Buah.add(Buah4);

        Queue<String> Buah5 = new LinkedList<>();
        Buah5.add("Semangka");
        Buah5.add("20000");
        Buah.add(Buah5);

        int Pilihan;
        String InputLagi = "y";

        do {
            System.out.println("Menu");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.print("Masukan Pilihan: ");
            Pilihan = inp.nextInt();
            inp.nextLine();  // Clear the buffer

            if (Pilihan == 3) {
                System.out.println("Anda Telah Keluar Dari Program!");
                break;
            }

            switch (Pilihan) {
                case 1:
                    System.out.println("Buah yang tersedia:");
                    int index = 1;
                    for (Queue<String> buah : Buah) {
                        String nama = buah.peek(); // Get fruit name without removing
                        String harga = ((LinkedList<String>) buah).get(1); // Get price by position
                        System.out.println(index++ + ". " + nama + " - Rp" + harga);
                    }

                    System.out.print("Buah yang ingin dibeli (nomor): ");
                    int pilihBuah = inp.nextInt() - 1;
                    inp.nextLine();

                    if (pilihBuah >= 0 && pilihBuah < Buah.size()) {
                        System.out.print("Masukkan jumlah: ");
                        int Jumlah = inp.nextInt();
                        inp.nextLine();

                        // Get the fruit details based on selected index
                        Queue<String> selectedFruit = ((LinkedList<Queue<String>>) Buah).get(pilihBuah);
                        String nama = selectedFruit.peek(); // Get fruit name
                        int harga = Integer.parseInt(((LinkedList<String>) selectedFruit).get(1)); // Get price
                        int SubTotal = Jumlah * harga;

                        NamaBuah.add(nama);
                        JumlahBuah.add(Jumlah);
                        HargaBuah.add(harga);
                        TotalBelanja += SubTotal;

                        System.out.println("Buah telah ditambahkan ke dalam keranjang.");
                    } else {
                        System.out.println("Masukan berupa angka yang tersedia.");
                    }
                    break;

                case 2:
                    if (NamaBuah.isEmpty()) {
                        System.out.println("Anda belum membeli apa-apa.");
                    } else {
                        System.out.println("Daftar Belanja:");
                        System.out.println("=".repeat(30));
                        System.out.println("No.\tNama Buah\tJumlah\tHarga\tSubtotal");

                        int i = 1;
                        for (String Nama : NamaBuah) {
                            int Jumlah = JumlahBuah.poll(); // Retrieve and remove quantity
                            int Harga = HargaBuah.poll(); // Retrieve and remove price
                            int SubTotal = Jumlah * Harga;

                            System.out.println(i++ + "\t" + Nama + "\t\t" + Jumlah + "\t" + Harga + "\t" + SubTotal);
                        }

                        System.out.println("=".repeat(30));
                        System.out.println("Total Belanja: Rp" + TotalBelanja);
                        double Diskon = TotalBelanja * 0.15;
                        System.out.println("Discount (15%): -Rp" + Diskon);
                        double TotalBayar = TotalBelanja - Diskon;
                        System.out.println("Total yang harus dibayar: Rp" + TotalBayar);
                    }
                    break;

                default:
                    System.out.println("Masukan pilihan yang sudah tersedia.");
                    break;
            }

            System.out.print("Apakah ingin kembali ke menu utama? (y/n): ");
            InputLagi = inp.nextLine(); // Checking if the user wants to go back to the main menu

        } while (InputLagi.equalsIgnoreCase("y"));

        inp.close();
    }
}
