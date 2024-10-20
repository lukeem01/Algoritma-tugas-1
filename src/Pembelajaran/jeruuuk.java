package Pembelajaran;

import java.util.Scanner;

public class jeruuuk {
    // Mendefinisikan limit dan harga untuk setiap kelompok
    private static final int[] LIMITS = { 5, 2, 1 }; // Limit untuk kelompok 3, 2, dan 1
    private static final int[] PRICES = { 10000, 5000, 3000 }; // Harga untuk kelompok 3, 2, dan 1

     // Fungsi untuk menghitung total harga berdasarkan jumlah buah
     private static int calculatePrice(int totalFruit) {
        int price = 0;

        // Loop melalui setiap kelompok limit
        for (int i = 0; i < LIMITS.length; i++) {
            // Hitung berapa banyak kelompok yang bisa dibeli
            int count = totalFruit / LIMITS[i];
            price += count * PRICES[i]; // Tambahkan harga kelompok ke total harga
            totalFruit %= LIMITS[i]; // Hitung sisa buah setelah kelompok
        }

        return price;
     }
     // Method untuk menanyakan apakah user ingin mengulangi perhitungan
    private static void repeatCalculation() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Apakah anda ingin mengulangi perhitungan? (Y/N): ");
            String repeat = scanner.next();
            if (repeat.equalsIgnoreCase("Y")) {
                main(null); // Memanggil kembali method main
            } else {
                System.out.println("Terima kasih telah menggunakan aplikasi ini.");
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah buah yang ingin dibeli: ");
            int totalFruit = scanner.nextInt();
            int price = calculatePrice(totalFruit);
            System.out.println("Harga yang harus dibayar: " + price);
            repeatCalculation();
        }
    }
}




