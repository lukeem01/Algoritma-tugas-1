public class insertionSort {
    public static void main(String[] args) {
        int[] array = {4, 3, 7, 1, 9};

        System.out.println("Array Sebelum diurutkan");
        printArray(array);

        insertionSort(array);

        System.out.println("Array Setelah diurutkan");
        printArray(array);
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1 ;

        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key;
        }
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + "");
        }
        System.out.println();
    }
}

