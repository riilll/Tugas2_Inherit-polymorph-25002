
package soal4;

import java.util.ArrayList;

/**
 * Class Keranjang untuk menyimpan produk,
 * menghitung total, dan mencetak struk belanja.
 */
public class Keranjang {

    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    /**
     * Menambahkan produk ke keranjang.
     *
     * @param produk produk yang ingin ditambahkan
     * @throws IllegalStateException jika kode produk sudah ada
     */
    public void tambah(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk tidak boleh null.");
        }

        for (Produk p : daftarProduk) {
            if (p.getKode().equals(produk.getKode())) {
                throw new IllegalStateException(
                        "Kode produk " + produk.getKode() + " sudah ada."
                );
            }
        }

        daftarProduk.add(produk);
    }

    /**
     * Menghitung total harga seluruh produk.
     *
     * @return total harga belanja
     */
    public double hitungTotal() {
        double total = 0;

        for (Produk p : daftarProduk) {
            total += p.hitungHargaAkhir();
        }

        return total;
    }

    /**
     * Mencetak struk seluruh produk dalam keranjang.
     */
    public void cetakStruk() {
        for (Produk p : daftarProduk) {
            System.out.printf(
                    "%s | %s | %s | Rp%.0f%n",
                    p.getKode(),
                    p.getNama(),
                    p.deskripsi(),
                    p.hitungHargaAkhir()
            );
        }

        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung jumlah produk berdasarkan jenisnya.
     */
    public void hitungPerJenis() {
        int fisik = 0;
        int digital = 0;
        int langganan = 0;

        for (Produk p : daftarProduk) {
            if (p instanceof Langganan) {
                Langganan l = (Langganan) p;
                langganan++;
            } else if (p instanceof ProdukFisik) {
                ProdukFisik f = (ProdukFisik) p;
                fisik++;
            } else if (p instanceof ProdukDigital) {
                ProdukDigital d = (ProdukDigital) p;
                digital++;
            }
        }

        System.out.println(
                "Fisik: " + fisik
                + ", Digital: " + digital
                + ", Langganan: " + langganan
        );
    }
}
