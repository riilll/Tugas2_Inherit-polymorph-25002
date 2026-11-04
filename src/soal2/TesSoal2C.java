
package soal2;

public class TesSoal2C {

    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = new Titik();
        Titik l3 = new Titik();

        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
