package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

/**
 * Class Sphere yang merepresentasikan donat tanpa lubang.
 * Meng-extend Shape dan mengimplementasikan berbagai interface.
 */
public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculate, MassConverter, ShippingCostCalculator {
    private double radius; // Radius bola

    // Constructor default
    public Sphere() {
    }

    // Constructor dengan parameter
    public Sphere(double radius) {
        this();
        this.radius = radius;
    }

    // Menghitung volume bola
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    // Menghitung luas permukaan bola
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    // Menghitung massa bola
    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    // Konversi gram ke kilogram
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // Menghitung biaya pengiriman
    @Override
    public double calculateCost() {
        double kg = gramToKilogram();
        int roundedKg = (int) Math.ceil(kg);
        return roundedKg * PRICE_PER_KG;
    }

    // Menampilkan informasi bola
    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.printf("Volume                : %.2f\n", getVolume());
        System.out.printf("Luas permukaan        : %.2f\n", getSurfaceArea());
        System.out.printf("Massa                 : %.2f\n", getMass());
        System.out.printf("Massa dalam kg        : %.2f\n", gramToKilogram());
        System.out.printf("Biaya kirim           : Rp %.0f\n", calculateCost());
        System.out.println("=============================================");
    }
}
