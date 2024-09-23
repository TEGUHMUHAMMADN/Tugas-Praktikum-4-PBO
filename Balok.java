/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author 62859
 */
public class Balok  extends Hitung {
     double length, width, height;

    public Balok(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    public double volume() {
        return length * width * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
}

