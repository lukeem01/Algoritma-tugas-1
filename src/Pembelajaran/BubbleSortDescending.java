public class BubbleSortDescending {
    public static void main(String[] args) {
        String[] cities = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};
        
        for (int i = 0; i < cities.length - 1; i++) {
            for (int j = 0; j < cities.length - 1 - i; j++) {
                if (cities[j].compareTo(cities[j + 1]) < 0) {
                    // Tukar posisi
                    String temp = cities[j];
                    cities[j] = cities[j + 1];
                    cities[j + 1] = temp;
                }
            }
        }

        System.out.println("Data setelah diurutkan secara descending:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
