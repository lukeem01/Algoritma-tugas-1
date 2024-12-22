public class InsertionSortB {
    public static void main(String[] args) {
        int[] array = {4, 3, 7, 1, 9};

        System.out.println("Array Sebelum diurutkan:");
        printArray(array);
        System.out.println();

        insertionSortWithSteps(array);

        System.out.println("\nArray Setelah diurutkan:");
        printArray(array);
    }

    public static void insertionSortWithSteps(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            System.out.println("Step " + i + ":");
            System.out.println("Angka = " + key);

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                printArray(array);
            }

            array[j + 1] = key;
            printArray(array);
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
