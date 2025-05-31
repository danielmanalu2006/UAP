package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

/**
 * Class utama yang menjalankan program kalkulator pabrik donat.
 * Menangani input dari user dan menampilkan output.
 */
public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner niel = new Scanner(System.in);

        // Header program
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("DANIEL SMITE MANALU");
        System.out.println("245150701111018");
        System.out.println("=============================================");

        // Input dan perhitungan untuk Torus (donat dengan lubang)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius         : ");
        double majorRadius = niel.nextDouble();
        System.out.print("Isikan radius         : ");
        double minorRadius = niel.nextDouble();

        // Membuat objek Torus dengan parameter radius utama dan radius minor
        Torus torus = new Torus(majorRadius, minorRadius);
        torus.printInfo();

        // Input dan perhitungan untuk Sphere (donat tanpa lubang)
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius         : ");
        double radius = niel.nextDouble();

        // Membuat objek Sphere dengan radius yang diinput pengguna
        Sphere sphere = new Sphere(radius);
        sphere.printInfo();

        niel.close();
    }
}