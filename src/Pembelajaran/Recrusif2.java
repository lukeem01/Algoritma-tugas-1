public class Recrusif2 {
    public static int faktorial(int f) {
        if (f == 1) {
            return 1;
        } else {
            return f * faktorial(f - 1 );
        }
    }
}

public static void main(String[] args) {
    int f = 6;
    int result = faktorial(f:6);
    System.out.println(result);
}