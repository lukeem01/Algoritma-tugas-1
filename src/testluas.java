import java.util.Scanner;

public class testluas {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner lingkaran = new Scanner(System.in);

        System.out.print("Masukan jari-jari lingkaran : ");
        String r = lingkaran.next();

        Double k_lingkaran = 2 * (22.0/7) * r ;
        System.out.println("Jadi Keliling Lingkarannya adalah : "+k_lingkaran+" cm");
        
        lingkaran.close();
    }
}