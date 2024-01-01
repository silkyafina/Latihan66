import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166017.pbo.lat66;

/**
 *
 * @author User
 * Nama     : Silky Afina Saly
 * NIM      : 22166017
 * Prodi    : Sistem Informasi
 * Matkul   : PBO 1
 */
public class Shape {
    private final String color;
    
    public Shape(String color){
        this.color= color;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return 0;
    }
}
class Circle extends Shape{
    private final double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI* radius*radius;
    }
}
class Rectangle extends Shape{
    private final double length;
    private final double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length= length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length* width;
    }

 // ... (Kode sebelumnya)

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Perhitungan Luas Lingkaran");
    System.out.println("=============================");
    System.out.print("Masukkan warna Lingkaran: ");
    String colorCircle = scanner.nextLine();
    System.out.print("Masukkan radius Lingkaran: ");
    double radius = scanner.nextDouble();
    scanner.nextLine(); // Membersihkan newline
    Circle circle = new Circle(colorCircle, radius);
    System.out.print("Luas Lingkaran: " + circle.getArea());
    System.out.println(" ");
    System.out.println(" ");

    System.out.println("Perhitungan Luas Persegi Panjang");
    System.out.println("=============================");
    System.out.print("Masukkan warna Persegi Panjang: ");
    String colorRectangle = scanner.nextLine();
    System.out.print("Masukkan panjang Persegi Panjang: ");
    double length = scanner.nextDouble();
    System.out.print("Masukkan lebar Persegi Panjang: ");
    double width = scanner.nextDouble();
    scanner.nextLine(); // Membersihkan newline
    Rectangle rectangle = new Rectangle(colorRectangle, length, width);
    System.out.print("Luas Persegi Panjang: " + rectangle.getArea());

    scanner.close();
}
}
