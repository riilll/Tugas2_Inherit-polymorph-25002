package soal1;
/**
 * Class LaptopGaming merupakan turunan dari Laptop
 * dengan tambahan kartu grafis dan masa garansi.
 */
public class LaptopGaming extends Laptop{
    private String kartuGrafis;
    private static final int TAMBAHAN_GARANSI = 6;

    /**
     * Constructor untuk membuat objek LaptopGaming.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan masa garansi awal
     * @param ramGb kapasitas RAM
     * @param ukuranLayarInci ukuran layar
     * @param kartuGrafis jenis kartu grafis
     */

    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }
    /**
     * Menampilkan informasi laptop gaming.
     *
     * @return informasi lengkap laptop gaming
     */

    @Override
    public String infoSingkat(){
        return super.infoSingkat()+ "GPU" + kartuGrafis;
    }
}