package Pembelajaran;

public class DeretGanjil {
    public static void main(String[] args) {
        int a = 0, b = 1; 
        
        while (a <=89) {
            System.out.print(a + ", ");
            int c = a + b ;
            a = b;
            b = c;
        }
    }
}
