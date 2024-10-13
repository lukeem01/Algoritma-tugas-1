
import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) throws Exception {
        Scanner belanjaan = new Scanner(System.in);
        System.out.print("Masukan Total Harga = ");
        Double TotalBelanja = belanjaan.nextDouble();
        Double diskon = 5.0/100;
        Double diskon1 = 10.0/100;
        Double diskon2 = 12.0/100; 
        if (TotalBelanja > 50000 && TotalBelanja < 100000 ) { 
            diskon = 5.0/100*TotalBelanja;
            if (diskon>4000) {
                diskon = 4000.0;
                System.out.println("Harga Total : "+ (TotalBelanja-diskon));
            }
            
        } else if (TotalBelanja >= 100000 && TotalBelanja < 200000 ) {
            diskon1 = 10.0/100*TotalBelanja;
            if (diskon1>15000) {
                diskon1 = 15000.0;
                System.out.println("Harga Total : "+(TotalBelanja-diskon1));
            }
            
        } else if (TotalBelanja >= 200000) {
            diskon2 = 12.0/100*TotalBelanja;
            if (diskon2>50000) {
                diskon2 = 50000.0;
                System.out.println("Harga Total : "+(TotalBelanja-diskon2));
            }
            
        } else {
            System.out.println(TotalBelanja+"Tidak mendapat Diskon");
        }
        
        belanjaan.close();
    }
}
