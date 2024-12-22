package Tugas_Sesi_12;

public class SearchElemenArray {
    public static boolean contains(int[]array, int n, int target) {
        if (n == array.length) {
            return false;
        }else if (array[n] == target) {
            return true;
        }
        return contains(array, n+1, target);
    }
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 1;
        boolean result = contains(array, 1, target);
        System.out.println(" Target yang dicari ada didalam Array : " +result);
    }
}
