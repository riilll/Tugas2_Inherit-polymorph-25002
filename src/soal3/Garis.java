
package soal3;

/**
 * Merepresentasikan garis yang memiliki titik awal dan akhir.
 */
public class Garis {

    private Titik awal;
    private Titik akhir;

    /**
     * Membuat garis dari dua objek Titik.
     *
     * @param awal titik awal garis
     * @param akhir titik akhir garis
     */
    public Garis(Titik awal, Titik akhir) {
    this.awal = new Titik(awal.getX(), awal.getY());
    this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Membuat garis dari empat koordinat.
     *
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /**
     * Mengambil titik awal garis.
     *
     * @return titik awal
     */
    public Titik getAwal() {
        return awal;
    }

    /**
     * Mengambil titik akhir garis.
     *
     * @return titik akhir
     */
    public Titik getAkhir() {
        return akhir;
    }

    /**
     * Mengubah titik awal garis.
     *
     * @param awal titik awal baru
     */
    public void setAwal(Titik awal) {
        this.awal = awal;
    }

    /**
     * Mengubah titik akhir garis.
     *
     * @param akhir titik akhir baru
     */
    public void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    /**
     * Menghitung panjang garis.
     *
     * @return panjang garis
     */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    /**
     * Menampilkan titik awal dan akhir garis.
     *
     * @return representasi garis
     */
    @Override
    public String toString() {
        return awal + " - " + akhir;
    }
}
