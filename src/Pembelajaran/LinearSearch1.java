public class LinearSearch1 {
    public static void main(String[] args) {
        int [] array = {7, 9, 2, 4, 8,};
        int targetIn = 4;

        int result = linearSearch(array, targetIn);

        if (result != 1) {
            System.out.println("Target  " + targetIn + " ditemukan pada index " + result);
        } else {
            System.out.println("Target " + targetIn + " tidak ditemukan dalm data" );
        }
    }
    public static int linearSearch(int[] array, int targetIn) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetIn) {
                return i;
            }
        }
        return -1;
    }
}
