// Subclass Motor (Sport)
public class MotorSport extends Motor {
    private int kapasitasMesin; // cc

    public MotorSport(String merek, int tahun, int kapasitasMesin) {
        super(merek, tahun, "Sport");
        this.kapasitasMesin = kapasitasMesin;
    }

    // Override untuk polimorfisme
    @Override
    public void menyalakanMesin() {
        System.out.println(
                "Motor Sport " + merek + " (" + kapasitasMesin + "cc) dinyalakan");
    }
}