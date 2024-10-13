
import java.util.Scanner;

/**
 * Ganjil_Genap
 */
public class Libur {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Hari :");
        String Hari = inputan.nextLine();
        Hari = Hari.toLowerCase();

        if (Hari.equals("Sabtu") ||
    Hari.equals("minggu")){
        System.out.println("Hari Libur");
    } else {
        System.out.println("Hari Kerja");
    }
    inputan.close();
    }
}
