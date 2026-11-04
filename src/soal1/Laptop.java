package soal1;

/**
 * Class Laptop merupakan turunan dari class Perangkat.
 */
public class Laptop extends Perangkat {
    private int ramGb;
    private double ukuranLayarInci;

     /**
     * Constructor untuk membuat objek Laptop.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan masa garansi laptop
     * @param ramGb kapasitas RAM laptop
     * @param ukuranLayarInci ukuran layar laptop
     */

    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci){
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

     /**
     * Menghitung harga laptop setelah diskon.
     *
     * @param diskonPersen persentase diskon
     * @return harga setelah diskon
     */

    public double hitungHargaPromo(double diskonPersen){
        return harga - (harga*diskonPersen /100);
    }
    /**
     * Menampilkan informasi laptop.
     *
     * @return informasi lengkap laptop
     */

    @Override 
    public String infoSingkat(){
        return super.infoSingkat() + "RAM " + ramGb + "GB" + " layar "+ ukuranLayarInci+" inci"; 
    }
}