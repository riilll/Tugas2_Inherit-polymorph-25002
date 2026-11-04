
package soal4;

/**
 * Class ProdukDigital merupakan turunan dari Produk
 * yang memiliki ukuran file dan diskon otomatis.
 */
public class ProdukDigital extends Produk {

    private double ukuranMb;
    private static final double DISKON_DIGITAL = 0.10;

    /**
     * Constructor untuk membuat produk digital.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga awal produk
     * @param ukuranMb ukuran file dalam MB
     */
    public ProdukDigital(String kode, String nama, double hargaDasar,
                         double ukuranMb) {
        super(kode, nama, hargaDasar);
        this.ukuranMb = ukuranMb;
    }

    /**
     * Menghitung harga akhir produk digital
     * setelah diskon 10 persen.
     *
     * @return harga setelah diskon
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar * (1 - DISKON_DIGITAL);
    }

    /**
     * Menampilkan deskripsi produk digital.
     *
     * @return deskripsi ukuran file produk
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}
