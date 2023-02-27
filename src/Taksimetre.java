import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Km bilgisini giriniz:");
        int km = scanner.nextInt();
        double taksimetre = 20 + (km * 2.5);
        taksimetre = taksimetre < 20 ? 20 : taksimetre;
        //if (taksimetre <= 20) taksimetre = 20;
        System.out.println("taksimetre = " + taksimetre);

    }
}