
import java.util.Scanner;

public class KembalianTelur {
    public static void main(String[] args) throws Exception {
    Double TotalBelanja, SubTotal, Diskon, UangYgDiBayarkan, Harga, Kembalian, TotalHargaTelur;
    Scanner inputan = new Scanner(System.in);
    System.out.print("Masukan Total telur yang akan dibeli = ");
    TotalBelanja = inputan.nextDouble();
    System.out.print("Masukan Total Uang yang diberikan");
    UangYgDiBayarkan = inputan.nextDouble();
    Diskon = 0.0;
    Harga = 28000.0;
    TotalHargaTelur = Harga*TotalBelanja;

    if (TotalBelanja > 3) {
        Diskon = 10.0/100*TotalHargaTelur;
    }

    SubTotal = TotalHargaTelur - Diskon;
    Kembalian = UangYgDiBayarkan - SubTotal;
    
    System.out.println("Total Kg telur yang dibeli = "+TotalBelanja);
    System.out.println("Total Harga Telur yang dibeli = "+TotalHargaTelur);
    System.out.println("Harga setelah diskon = "+Diskon);
    System.out.println("Uang yang dibayarkan = "+UangYgDiBayarkan);
    System.out.println("Subtotal = "+SubTotal);
    System.out.println("Kembalian dari membeil Telur = "+Kembalian);
    
    inputan.close();

    }
}
