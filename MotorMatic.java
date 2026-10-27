// Subclass Motor (Matic)
public class MotorMatic extends Motor {
    private int kapasitasBagasi; // liter

    public MotorMatic(String merek, int tahun, int kapasitasBagasi) {
        super(merek, tahun, "Matic");
        this.kapasitasBagasi = kapasitasBagasi;
    }

    // Override untuk polimorfisme
    @Override
    public void menyalakanMesin() {
        System.out.println("Motor Matic " + merek + "(" + kapasitasBagasi + " liter) + dinyalakan.");
    }
}