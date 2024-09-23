/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author 62859
 */
public class DemoHitung {
      public static void main(String[] args) {
        Hitung balok = new Balok(5, 3, 4);
        System.out.println("Balok:");
        System.out.println("Volume: " + balok.volume());
        System.out.println("Luas Permukaan: " + balok.surfaceArea());
        
        Hitung kubus = new Kubus(3);
        System.out.println("\nKubus:");
        System.out.println("Volume: " + kubus.volume());
        System.out.println("Luas Permukaan: " + kubus.surfaceArea());
    }
}
