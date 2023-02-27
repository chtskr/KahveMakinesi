import java.util.Scanner;

import static java.lang.Thread.sleep;

public class KahveMakinesi {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        // Kahve secim asamasi

        // Kullaniciya hangi kahveyi istedigi sorulur ve kahve secenekleri yazdirilir.
        menuyuYazdir();
        // Kullaniciya hangi kahveyi sectigi sorulur ve alinan cevap bir degiskende tutulur.

        String kahveSecim = kahveSecimiYap();

        // Kullanicinin sectigi kahveye gore konsola bilgilendirme mesaji yazdirilir.

        System.out.println(kahveSecim + " hazirlaniyor");
        Thread.sleep(2000);

        // Sut ekleme asamasi

        // Kullaniciya sut isteyip istemedigi sorulur ve cevap bir String degiskende saklanir.
        sutEkle();
        // Kullanici evet yaniti verdiyse 'Sut ekleniyor' yazdirilir, Hayir cevabi verdiyse 'sut eklenmiyor' yazdirilir

        // Seker ekleme asamasi

        // Kullaniciya seker isteyip istemedigi sorulur ve yanit evet ise kac seker istedigi sorularak konsola
        // '{sekerSayisi} seker ekleniyor'

        sekerEkle();

        // Kullanici seker istemiyorsa seker eklenmiyor mesaji yazdirilir

        // Boy secim asamasi

        // Kullaniciya secilebilecek boy bilgileri yazdirilir ve kullanicidan secim yapmasi beklenir
        // Secim buyuk boy ise Kahveniz buyuk boy hazirlaniyor
        String boySecim = boySecimiYap();

        // Secim orta boy ise Kahveniz orta boy hazirlaniyor

        // Secim kucuk boy ise Kahveniz kucuk boy hazirlaniyor

        // Sonuc asamasi
        System.out.println(kahveSecim + " " + boySecim + " kahveniz hazır. Afiyet olsun. Yeniden bekleriz.");

        //Kullaniciya istedigi kahve ve boy bilgileri yazdirilir.


    }

    private static String boySecimiYap() throws InterruptedException {
        dekoratifYazdir();
        System.out.println("Hangi boyutta olsun? (buyuk boy-orta boy-kucuk boy)");
        String boySecim = sc.nextLine();
        switch (boySecim.toLowerCase()) {
            case "buyuk boy", "orta boy", "kucuk boy" -> System.out.println("Kahveniz " + boySecim + " hazirlaniyor");

            default -> {
                System.out.println("yanlış giriş yaptınız, lütfen doğru boy seçiniz");
                boySecimiYap();
            }
        }
        return boySecim;
    }

    private static void sekerEkle() throws InterruptedException {
        dekoratifYazdir();
        System.out.println("seker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String sekerSecim = sc.nextLine();
        if (sekerSecim.equalsIgnoreCase("evet")) {
            System.out.println("kaç seker eklememizi istersiniz? ");
            Thread.sleep(2000);

            int sekerSayisi = sc.nextInt();
            sc.nextLine();//Dumy
            if (sekerSayisi > 0) {
                System.out.println(sekerSayisi + " seker ekleniyor.");
                Thread.sleep(2000);
            } else {
                System.out.println("yanlıs girdi yaptınız, lütfen dogru giris yapınız.");
                sekerEkle();
            }
        } else if (sekerSecim.equalsIgnoreCase("hayir")) {
            System.out.println("\nSeker eklenmiyor");
            Thread.sleep(2000);
        } else {
            System.out.println("yanlıs girdi yaptınız, lütfen evet veya hayir olarak cevaplayınız.");
            sekerEkle();
        }
    }

    private static void sutEkle() throws InterruptedException {
        dekoratifYazdir();

        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String sutSecim = sc.nextLine();

        if (sutSecim.equalsIgnoreCase("evet")) {
            System.out.println("\nSut ekleniyor.");
            Thread.sleep(2000);
        } else if (sutSecim.equalsIgnoreCase("hayir")) {
            System.out.println("\nSut eklenmiyor");
            Thread.sleep(2000);

        } else {
            sutEkle();
        }
    }

    private static String kahveSecimiYap() throws InterruptedException {

        // Oyle bir method gelistir ki kullanici dogru secim yapana kadar methoddan cikamasin

        while (true) {
            // kullanicidan bir girdi talep edilir  ve alinan girdi bir degiskende saklanir
            String secim = sc.nextLine();

            // Bu degiskenim eger kabul edilebilir bir girdi ise methoddan cikilir, degil ise menu tekrardan yazdirilarak dongunun basina donulur.
            if ((secim.equalsIgnoreCase("turk kahvesi")) ||
                    (secim.equalsIgnoreCase("filtre kahve")) ||
                    (secim.equalsIgnoreCase("espresso"))) {

                return secim;
            } else {
                System.out.println("Yanlis secim yaptiniz. Lutfen dogru bir giris yapiniz...");
                Thread.sleep(2000);

                menuyuYazdir();
            }
        }
    }

    private static void menuyuYazdir() {
        dekoratifYazdir();
        System.out.println("Hangi kahveyi istersiniz?");
        System.out.println("1. Turk Kahvesi");
        System.out.println("2. Filtre Kahve");
        System.out.println("3. Espresso");
        dekoratifYazdir();
    }

    private static void dekoratifYazdir() {
        System.out.println("*******************************************");


    }
}