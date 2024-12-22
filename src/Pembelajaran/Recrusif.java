public class Recrusif {
    public class Main {
        public static void main(String[] args) {
        System.out.print(f);
        System.out.print(" X ");
        int result = faktorial(4);
        System.out.print(" = " + result);
        int f = faktorial(6);
        }
        public static int faktorial(int f) {
        if (f > 1) {
            return f * faktorial(f - 1);
        } else {
            return 1;
        }
        }
    }
}