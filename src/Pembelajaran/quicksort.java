public class quicksort {
    public static void main(String[] args) {
        int[] angka = {29, 10, 14, 37, 13};
        System.out.println("Array sebelum diurutkan:");
        printArray(angka);

        selectionSort(angka);

        System.out.println("Array setelah diurutkan:");
        printArray(angka);
    }

    public static void selectionSort(int[] angka) {
        int n = angka.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (angka[j] < angka[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = angka[minIndex];
            angka[minIndex] = angka[i];
            angka[i] = temp;
        }
    }

    public static void printArray(int[] angka) {
        for (int num : angka) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}