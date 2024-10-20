package Tugas_Sesi_4;

public class Loop2 {
    public static void main(String[] args) {
        int baris = 3;
        
        for (int i = 0; i < baris; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print((i + j) + " ");
            }
            System.out.println();
        }
    }
}
