// Subclass Kendaraan dan implementasi IsiBensin
public class Motor extends Kendaraan implements IsiBensin {
    private String jenisMotor;

    public Motor(String merek, int tahun, String jenisMotor) {
        super(merek, tahun);
        this.jenisMotor = jenisMotor;
    }

    // Implementasi method Kendaraan
    @Override
    public void menyalakanMesin() {
        System.out.println("Mesin motor " + merek + " dinyalakan.");
    }

    // Implementasi interface IsiBensin
    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bensin untuk motor " + merek + " di SPBU.");
    }

    public String getJenisMotor() {
        return jenisMotor;
    }
}
