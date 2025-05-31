package uap.interfaces;

/**
 * Interface untuk menghitung biaya pengiriman.
 * Mengandung konstanta harga per kg dan method calculateCost().
 */
public interface ShippingCostCalculator {
    int PRICE_PER_KG = 2000; // Harga pengiriman per kg dalam rupiah
    double calculateCost(); // Method untuk menghitung biaya pengiriman
}