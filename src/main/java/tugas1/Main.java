/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek Mobil
        Mobil mobil1 = new Mobil("Toyota", "Camry", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2021, "Merah");

        // Menampilkan informasi kedua objek
        System.out.println("Informasi Mobil 1:");
        mobil1.displayInfo();
        System.out.println();
        
        System.out.println("Informasi Mobil 2:");
        mobil2.displayInfo();
        System.out.println();

        // Menyalakan mesin mobil
        mobil1.startEngine();
        mobil2.startEngine();
    }
}
