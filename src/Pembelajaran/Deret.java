package Pembelajaran;

public class Deret {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 0; i <=89; i++) {
            System.out.print(a+ "");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
