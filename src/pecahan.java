import java.util.Scanner;
public class pecahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah uang dari pengguna
        System.out.print("Masukkan jumlah uang: ");
        int jumlahUang = input.nextInt();

        // Array untuk menyimpan pecahan uang
        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};
        String[] namaPecahan = {"100 ribu", "50 ribu", "20 ribu", "10 ribu", "5 ribu", "2 ribu", "1 ribu", "500", "100"};

        // Menghitung dan menampilkan pecahan uang
        System.out.println("Pecahan uang: ");
        for (int i = 0; i < pecahan.length; i++) {
            int jumlahPecahan = jumlahUang / pecahan[i];
            if (jumlahPecahan > 0) {
                System.out.println(jumlahPecahan + " lembar/keping " + namaPecahan[i]);
            }
            jumlahUang %= pecahan[i];
        }
    }
}
