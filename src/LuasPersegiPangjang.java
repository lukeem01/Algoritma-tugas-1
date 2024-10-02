import java.util.Scanner;

public class LuasPersegiPangjang {
    public static void main(String[] args) {
        Scanner persegiPanjang = new Scanner(System.in);

        System.out.print("Masukan Panjang : ");
        double Panjang = persegiPanjang.nextDouble();
        System.out.print("Masukan Lebar : ");
        double Lebar = persegiPanjang.nextDouble();

        double luas = Panjang * Lebar ;

        System.out.print("Jadi Luas dari persegi panjang tersebut adalah : " +luas+ " cm");

        persegiPanjang.close();
    }
}
