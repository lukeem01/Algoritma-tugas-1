import java.util.Scanner;

public class HargaJeeruk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah buah jeruk: ");
        int jumlahBuah = input.nextInt();

        int harga5Buah = 10000, harga2Buah = 5000, harga1Buah = 3000;
        int totalHarga = 0;

        if (jumlahBuah >= 5) {
            int paket5Buah = jumlahBuah / 5;
            totalHarga += paket5Buah * harga5Buah;
            jumlahBuah = jumlahBuah % 5;
        }

        if (jumlahBuah >= 2) {
            int paket2Buah = jumlahBuah / 2;
            totalHarga += paket2Buah * harga2Buah;
            jumlahBuah = jumlahBuah % 2;
        }

        if (jumlahBuah >= 1) {
            totalHarga += jumlahBuah * harga1Buah;
        }

        System.out.println("Total harga: " + totalHarga);
        input.close();
    }
}
