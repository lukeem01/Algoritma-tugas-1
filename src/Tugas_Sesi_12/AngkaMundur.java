package Tugas_Sesi_12;

public class AngkaMundur {
    public static void pointReverse(int n) {
        if (n > 1) {
            System.out.print(n+ " , ");
            pointReverse(n-1);

        }else if (n == 1) {
            System.out.print(n);
        }
        return;
    }
    public static void main(String[] args) {
        pointReverse(5);
    }
}