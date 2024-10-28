package Tugas_Sesi_4;

public class Loop6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 1;
        int i = 2;
        while (d <= 81) {
            if (i == 2) {
                i++;
            } else {
                System.out.print(d + " ");
                d = a + b + c;
            }
            a = b;
            b = c;
            c = d;
        }
    }
}
