/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author 62859
 */
public class Kubus extends Hitung {
     double side;
    public Kubus(double side) {
        this.side = side;
    }
    @Override
    public double volume() {
        return Math.pow(side, 3);
    }
    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}
