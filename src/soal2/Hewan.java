package soal2;
class Hewan {
    protected String nama; Hewan(String
    nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }
    void suara() { System.out.println("..."); } void makan() {
        System.out.println(nama + " makan"); suara();
    }
}