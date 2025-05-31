package uap.interfaces;

/**
 * Interface untuk menghitung massa.
 * Mengandung konstanta densitas dan ketebalan material.
 */
public interface MassCalculate {
    int DENSITY = 8; // Densitas material (g/cm³)
    double THICKNESS = 0.5; // Ketebalan material dalam cm
    double getMass(); // Method untuk menghitung massa
}