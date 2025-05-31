package uap.bases;

/**
 * Abstract class Shape sebagai base class untuk semua bentuk geometri.
 * Mengandung properti dasar name dan method abstrak printInfo().
 */
public abstract class Shape {
    private String name; // Nama dari bentuk geometri

    // Constructor default
    public Shape() {
        this.name = "Shape";
    }

    // Setter untuk nama
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Getter untuk nama
    public String getName() {
        return this.name;
    }

    /**
     * Method abstrak untuk mencetak informasi tentang bentuk.
     * Harus diimplementasikan oleh subclass.
     */
    public abstract void printInfo();
}