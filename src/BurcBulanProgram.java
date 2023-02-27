import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dogum ayınız : ");
        int month = input.nextInt();
        System.out.println("Dogum gununuz : ");
        int day = input.nextInt();

        //1.Yöntem
        String sign = "";//Burc ifadesi sign a atandı
        String errorMessage = "Hatalı giriş. Lütfen tekrar deneyiniz.";//Error mesajı atandı
        boolean isError = false;//hatalı giriş atandı
        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        sign = "Oglak";
                    } else sign = "Kova";
                } else {
                    isError = true;
                    errorMessage = "Girdiginiz gün degeri Ocak ayı içinde degildir";
                }
                break;

            case 2:
                if (day <= 1 && day <= 28) {
                    if (day <= 19) {
                        sign = "Kova";
                    } else sign = "Balık";
                } else isError = true;
                break;

            case 3:
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        sign = "Balık";
                    } else sign = "Kova";
                } else isError = true;
                break;


            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                isError = true;
        }
        if (isError) {
            System.out.println(errorMessage);
        } else {
            System.out.println("Burcunuz : " + sign);

        }


    }

    //2.Yöntem
        /*if (month > 0 && month <= 12) {
            System.out.println("Dogum gununuz : ");
            int day = input.nextInt();
            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Burcunuz : Oglak");
                    } else System.out.println("Burcunuz : Kova");
                } else System.out.println("Hatalı giriş. Lütfen tekrar deneyiniz.");
            } else if (month == 2) {
                if (day <= 1 && day <= 28) {
                    if (day <= 19) {
                        System.out.println("Burcunuz : Kova");
                    } else System.out.println("Burcunuz : Balık");
                } else System.out.println("Hatalı giriş. Lütfen tekrar deneyiniz.");
            } else if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        System.out.println("Burcunuz : Balık");
                    } else System.out.println("Burcunuz : Kova");
                } else System.out.println("Hatalı giriş. Lütfen tekrar deneyiniz.");
            } else System.out.println("Hatalı giriş. Lütfen tekrar deneyiniz.");

        } else System.out.println("Hatalı giriş. Lütfen tekrar deneyiniz.");*/
}



