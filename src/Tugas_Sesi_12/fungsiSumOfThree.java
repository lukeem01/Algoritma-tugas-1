package Tugas_Sesi_12;

public class fungsiSumOfThree {
    public static int deretSumOfThree(int n, int x,int y,int z) {
        if (n==0) {
            return 0;
        }else {
            System.out.print(x + " , ");
            deretSumOfThree(n-1, y, z, x+y+z);
        }
        return 0;
    } 
    public static void main(String[] args) {
        int n = 5;
        int x = 1;
        int y = 1;
        int z = 1;
        
        deretSumOfThree(n, x, y, z);
    }
}