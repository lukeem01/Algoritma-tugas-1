package Qeueu;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueExample {
    public static void main(String[] args) {
        // Membuat Queue menggunakan LinkedList
        Queue<String> queue = new LinkedList<>();

        // Menambahkan elemen ke antrian
        queue.add("Orang 1");
        queue.add("Orang 2");
        queue.add("Orang 3");

        // Menampilkan isi antrian
        System.out.println("Antrian: " + queue);

        // Melayani orang di depan antrian
        System.out.println("Melayani: " + queue.poll()); // Menghapus "Orang 1"
        
        // Menampilkan isi antrian setelah pelayanan
        System.out.println("Antrian setelah melayani satu orang: " + queue);
    }
}