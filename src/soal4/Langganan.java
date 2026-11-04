
package soal4;

/**
 * Class Langganan merupakan turunan dari ProdukDigital
 * dengan harga berdasarkan durasi berlangganan.
 */
public class Langganan extends ProdukDigital {

    private int durasiBulan;

    private static final int MINIMAL_DURASI_DISKON = 12;
    private static final double DISKON_LANGGANAN = 0.20;

    /**
     * Constructor untuk membuat produk langganan.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga langganan per bulan
     * @param ukuranMb ukuran produk digital
     * @param durasiBulan lama berlangganan dalam bulan
     */
    public Langganan(String kode, String nama, double hargaDasar,
                     double ukuranMb, int durasiBulan) {

        super(kode, nama, hargaDasar, ukuranMb);
        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung harga akhir langganan berdasarkan durasi.
     * Diskon 20 persen diberikan jika durasi minimal 12 bulan.
     *
     * @return harga akhir langganan
     */
    @Override
    public double hitungHargaAkhir() {
        double total = hargaDasar * durasiBulan;

        if (durasiBulan >= MINIMAL_DURASI_DISKON) {
            total = total * (1 - DISKON_LANGGANAN);
        }

        return total;
    }

    /**
     * Menampilkan deskripsi produk langganan.
     *
     * @return deskripsi durasi langganan
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
