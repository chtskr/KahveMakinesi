import java.util.Scanner;

public class KahveMakinesi {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Kahve secim asamasi

        // Kullaniciya hangi kahveyi istedigi sorulur ve kahve secenekleri yazdirilir.
        menuyuYazdir();
        // Kullaniciya hangi kahveyi sectigi sorulur ve alinan cevap bir degiskende tutulur.

        String kahveSecim = kahveSecimiYap();

        // Kullanicinin sectigi kahveye gore konsola bilgilendirme mesaji yazdirilir.

        System.out.println(kahveSecim + " hazirlaniyor");

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

    private static String boySecimiYap() {
        System.out.println("*********\n\nHangi boyutta olsun? (buyuk boy-orta boy-kucuk boy)\n\n********");
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

    private static void sekerEkle() {
        System.out.println("*************\n\nseker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):\n\n*********");
        String sekerSecim = sc.nextLine();
        if (sekerSecim.equalsIgnoreCase("evet")) {
            System.out.println("kaç seker eklememizi istersiniz? ");
            int sekerSayisi = sc.nextInt();
            sc.nextLine();//Dumy
            if (sekerSayisi > 0) {
                System.out.println(sekerSayisi + " seker ekleniyor.");
            } else {
                System.out.println("yanlıs girdi yaptınız, lütfen dogru giris yapınız.");
                sekerEkle();
            }
        } else if (sekerSecim.equalsIgnoreCase("hayir")) {
            System.out.println("\nSeker eklenmiyor");
        } else {
            System.out.println("yanlıs girdi yaptınız, lütfen evet veya hayir olarak cevaplayınız.");
            sekerEkle();
        }
    }

    private static void sutEkle() {

        System.out.println("*************\n\nSüt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):\n\n*********");
        String sutSecim = sc.nextLine();

        if (sutSecim.equalsIgnoreCase("evet")) {
            System.out.println("\nSut ekleniyor.");
        } else if (sutSecim.equalsIgnoreCase("hayir")) {
            System.out.println("\nSut eklenmiyor");
        } else {
            sutEkle();
        }
    }

    private static String kahveSecimiYap() {

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
                menuyuYazdir();
            }
        }
    }

    private static void menuyuYazdir() {

        System.out.println("*******************************************\n");
        System.out.println("Hangi kahveyi istersiniz?");
        System.out.println("1. Turk Kahvesi");
        System.out.println("2. Filtre Kahve");
        System.out.println("3. Espresso");
        System.out.println("\n*******************************************\n\n");
    }

    private static void dekoratifYazdir(String text) {
        System.out.println("*******************************************\n");
        System.out.println(text);
        System.out.println("\n*******************************************\n\n");


    }
}