
package soal4;

/**
 * Merepresentasikan produk dengan kode, nama, dan harga dasar.
 */
public class Produk {

    private String kode;
    private String nama;
    protected double hargaDasar;

    /**
     * Membuat objek produk.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga awal produk
     * @throws IllegalArgumentException jika data produk tidak valid
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong.");
        }

        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong.");
        }

        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif.");
        }

        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengambil kode produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return kode;
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Menghitung harga akhir produk.
     *
     * @return harga dasar produk
     */
    public double hitungHargaAkhir() {
        return hargaDasar;
    }

    /**
     * Menghasilkan deskripsi produk.
     *
     * @return deskripsi produk
     */
    public String deskripsi() {
        return "produk umum";
    }
}
