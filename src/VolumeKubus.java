
import java.util.Scanner;

public class VolumeKubus {
    public static void main(String[] args) {
        Scanner kubus = new Scanner(System.in);

        System.out.print("Masukan panjang sisi : ");
        Double sisi = kubus.nextDouble();

        Double Volume = sisi * sisi * sisi;
        System.out.println("Jadi Volume pada kubus tersebut adalah : "+Volume+" cm");

        kubus.close();
    }
}
