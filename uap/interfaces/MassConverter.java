package uap.interfaces;

/**
 * Interface untuk konversi satuan massa.
 * Mengandung konstanta denominator dan method gramToKilogram().
 */
public interface MassConverter {
    int DENOMINATOR = 1000; // Pembagi untuk konversi gram ke kilogram
    double gramToKilogram(); // Method untuk konversi gram ke kilogram
}
