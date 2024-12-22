

public class LinearSearchlukeem {
    public static void main(String[] args) {
        
        int[] array = {9, 10, 8, 1, 5, 15, 20, 19, 6, 12};
        int target = 99 ;

        int result = function(array, target);

        if (result != -1) {
            System.out.println("Angka " + target + " ditemukan pada indeks ke-" + result);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan di dalam array.");
        }
    }

    public static int function(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target ) {
                return i;
            }
        }
        return -1;
    }
}