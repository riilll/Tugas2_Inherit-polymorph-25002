package soal1;

/**
 * Class Ponsel merupakan turunan dari class Perangkat.
 */

public class Ponsel extends Perangkat {
    private int kapasitasGb;
    private int jumlahKamera;

     /**
     * Constructor untuk membuat objek Ponsel.
     *
     * @param merek merek ponsel
     * @param harga harga ponsel
     * @param garansiBulan masa garansi ponsel
     * @param kapasitasGb kapasitas penyimpanan ponsel
     * @param jumlahKamera jumlah kamera ponsel
     */

    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera){
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }   

   /**
     * Menampilkan informasi lengkap ponsel.
     *
     * @return informasi ponsel
     */

    @Override
    public String infoSingkat(){
        return super.infoSingkat()+ kapasitasGb + " GB"+ jumlahKamera + "kamera";
    }
}