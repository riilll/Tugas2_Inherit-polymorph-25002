
package soal3;

/**
 * Merepresentasikan titik pada koordinat dua dimensi.
 */
public class Titik {

    private double x;
    private double y;

    /**
     * Membuat titik pada koordinat (0, 0).
     */
    public Titik() {
        this(0, 0);
    }

    /**
     * Membuat titik berdasarkan koordinat.
     *
     * @param x koordinat horizontal
     * @param y koordinat vertikal
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengambil koordinat x.
     *
     * @return nilai x
     */
    public double getX() {
        return x;
    }

    /**
     * Mengambil koordinat y.
     *
     * @return nilai y
     */
    public double getY() {
        return y;
    }

    /**
     * Mengubah koordinat x.
     *
     * @param x nilai x baru
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Mengubah koordinat y.
     *
     * @param y nilai y baru
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak ke titik lain.
     *
     * @param lain titik tujuan
     * @return jarak antara dua titik
     */
    public double jarakKe(Titik lain) {
        double dx = lain.x - x;
        double dy = lain.y - y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Mengembalikan koordinat dalam bentuk teks.
     *
     * @return koordinat (x, y)
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
