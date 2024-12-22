package Tugas_Sesi_12;

public class SearchNilaiMaksimumArray {
    public static int findNilaiMaks(int[] array, int  n, int max) {
        if (n == 0) {
            return max;
        }
        if (array[n] > max) {
            max = array[n];
        }
        if (n > 0) {
            findNilaiMaks(array, n-1, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int array[] = {1, 5, 2, 7, 10, 6, 15, 12, 20, 3, 25};
        int max = 0;
        int result = findNilaiMaks(array, array.length - 1, max);
        System.out.println("Nilai Maksimum pada array = " + result);
    }
}
