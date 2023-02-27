import java.util.Scanner;

public class MyCoffeMachine {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        menu();
        sutTercih();
        sekerTercih();
        boyTercih();
        System.out.println("sipariş kahveniz hazır buyrun. Afiyet olsun! Tekrar bekleriz.");
    }

    private static void dekoratifText() {
        System.out.println("********************************");
    }

    private static void boyTercih() throws InterruptedException {
        dekoratifText();
        System.out.println("boy tercihiniz lütfen :\n1->Buyuk\n2->Orta\n3->Kucuk");
        dekoratifText();
        int boysecim = sc.nextInt();
        if (boysecim == 1 || boysecim == 2 || boysecim == 3) {
            dekoratifText();
            System.out.println("kahveniz hazırlanıyor...");
            Thread.sleep(2000);
        } else {
            System.out.println("yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");
            boyTercih();
        }
    }

    private static void sekerTercih() throws InterruptedException {
        dekoratifText();
        System.out.println("Kahvenize seker ister misiniz :\n1->Evet\n2->Hayır");
        int sekerSecim = sc.nextInt();
        if (sekerSecim == 1) {
            System.out.println("Kac seker istersiniz?");
            int sekerAdet = sc.nextInt();
            System.out.println(sekerAdet + " şekerli kahveniz hazırlanıyor...");
            Thread.sleep(2000);
        } else if (sekerSecim == 2) {
            System.out.println("şeker eklenmiyor...");
            Thread.sleep(2000);
        } else {
            System.out.println("yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");
            Thread.sleep(2000);
            sekerTercih();
        }
    }

    private static void sutTercih() throws InterruptedException {
        dekoratifText();
        System.out.println("Kahvenize sut ister misiniz :\n1->Evet\n2->Hayır");
        int sutSecim = sc.nextInt();
        if (sutSecim == 1 || sutSecim == 2) {
            System.out.println("kahveniz hazırlanıyor...");
            Thread.sleep(2000);
        } else {
            System.out.println("yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");
            Thread.sleep(2000);
            sutTercih();
        }
    }

    private static void menu() throws InterruptedException {
        dekoratifText();
        System.out.println("tercihiniz lütfen :\n1->Turk kahvesi\n2->Filtre kahve\n3->Espresso");
        int kahveSecim = sc.nextInt();
        if (kahveSecim == 1 || kahveSecim == 2 || kahveSecim == 3) {
            System.out.println("kahveniz hazırlanıyor...");
            Thread.sleep(2000);
        } else {
            System.out.println("yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");
            menu();
        }
    }
}
