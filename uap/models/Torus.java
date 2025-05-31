package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

/**
 * Class Torus yang merepresentasikan donat dengan lubang.
 * Meng-extend Shape dan mengimplementasikan berbagai interface.
 */
public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculate, MassConverter, ShippingCostCalculator {
    private double majorRadius; // Radius utama torus
    private double minorRadius; // Radius minor torus

    // Constructor default
    public Torus() {
    }

    // Constructor dengan parameter
    public Torus(double majorRadius, double minorRadius) {
        this();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    // Menghitung volume torus
    @Override
    public double getVolume() {
        return (PI*minorRadius*minorRadius) * (2*PI*majorRadius);
    }

    // Menghitung luas permukaan torus
    @Override
    public double getSurfaceArea() {
        return (2 * PI * minorRadius) * (2 * PI * majorRadius);
    }

    // Menghitung massa torus
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
        int roundedKg = (int) Math.ceil(kg); // Pembulatan ke atas
        return roundedKg * PRICE_PER_KG;
    }

    // Menampilkan informasi torus
    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.printf("Volume                : %.0f\n", getVolume());
        System.out.printf("Luas permukaan        : %.0f\n", getSurfaceArea());
        System.out.printf("Massa                 : %.0f\n", getMass());
        System.out.printf("Massa dalam kg        : %.0f\n", gramToKilogram());
        System.out.printf("Biaya kirim           : Rp %.0f\n", calculateCost());
        System.out.println("=============================================");
    }
}