
package soal4;

/**
 * Class ProdukFisik merupakan turunan dari Produk
 * yang memiliki berat dan biaya tambahan.
 */
public class ProdukFisik extends Produk {

    private double beratKg;
    private static final double BIAYA_PER_KG = 10000;

    /**
     * Constructor untuk membuat produk fisik.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga awal produk
     * @param beratKg berat produk dalam kilogram
     */
    public ProdukFisik(String kode, String nama, double hargaDasar,
                       double beratKg) {
        super(kode, nama, hargaDasar);
        this.beratKg = beratKg;
    }

    /**
     * Menghitung harga akhir produk fisik.
     *
     * @return harga dasar ditambah biaya berdasarkan berat
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar + (beratKg * BIAYA_PER_KG);
    }

    /**
     * Menampilkan deskripsi produk fisik.
     *
     * @return deskripsi berat produk
     */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}
