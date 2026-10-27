// Superclass abstract
public abstract class Kendaraan {
    protected String merek;
    protected int tahun;

    public Kendaraan(String merek, int tahun) {
        this.merek = merek;
        this.tahun = tahun;
    }

    public void infoKendaraan() {
        System.out.println("Merek: " + merek + " | Tahun: " + tahun);
    }

    // abstrak yang wajib diimplementasikan subclass
    public abstract void menyalakanMesin();
}