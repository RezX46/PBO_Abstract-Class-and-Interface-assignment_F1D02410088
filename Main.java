public class Main {
    public static void main(String[] args) {
        // Polimorfisme: objek subclass dalam tipe superclass
        Motor motor1 = new MotorSport("Kawasaki Ninja", 2023, 250);
        Motor motor2 = new MotorMatic("Honda Vario", 2022, 18);

        System.out.println("=== Pengujian Motor 1 (Sport) ===");
        motor1.infoKendaraan();
        motor1.menyalakanMesin();
        motor1.isiBahanBakar();

        System.out.println("\n=== Pengujian Motor 2 (Matic) ===");
        motor2.infoKendaraan();
        motor2.menyalakanMesin();
        motor2.isiBahanBakar();
    }
}