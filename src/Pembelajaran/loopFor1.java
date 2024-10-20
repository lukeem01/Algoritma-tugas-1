package Pembelajaran;

public class loopFor1 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.print(" ");
        
        for (int i = 0; a <= 89; i++) {
            System.out.print(a + ","); 
            int c = a + b; 
            a = b;          
            b = c;  
        }
    }
}
