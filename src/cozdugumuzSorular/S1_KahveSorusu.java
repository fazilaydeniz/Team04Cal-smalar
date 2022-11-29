package cozdugumuzSorular;

import java.util.Scanner;

public class S1_KahveSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hangi Kahveyi İstersiniz?\n" +
                "1.Turk kahvesi\n" +
                "2.Filtre Kahve\n" +
                "3.Espresso");
        String hangikahve="";

        System.out.println("Secmek istediginiz kahvenin adini yaziniz");
        hangikahve= scan.nextLine();

        if (hangikahve.equalsIgnoreCase("Turk Kahvesi")){
            System.out.println("Turk kahvesi hazirlaniyor...");
        } else if (hangikahve.equalsIgnoreCase("Filtre Kahve")) {
            System.out.println("Filtre kahve hazirlaniyor...");

        } else if (hangikahve.equalsIgnoreCase("Espresso")) {
            System.out.println("Espresso hazirlaniyor...");

        }else {
            System.out.println("hatali giris yaptiniz");
        }


        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String sut= scan.nextLine();

        if (sut.equalsIgnoreCase("Evet")){
            System.out.println("Süt ekleniyor");
        }else {
            System.out.println("Süt eklenmiyor");
        }

        System.out.println("Seker ister misiniz ? (Evet veya hayır cevabını veriniz) :");
        String seker= scan.nextLine();
        int kacSeker;

        if (seker.equalsIgnoreCase("Evet")){
            System.out.println("Kac tane seker istiyorsunuz");
            kacSeker= scan.nextInt();
            System.out.println(kacSeker+" seker ekleniyor");

        }else {
            System.out.println("Seker eklenmiyor, devam etmek icin Enter'e basiniz");
        }
        String bosKod = scan.nextLine();

        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :");
        String boyut= scan.nextLine();

        if (boyut.equalsIgnoreCase("Buyuk boy")){
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");

        } else if (boyut.equalsIgnoreCase("orta boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");

        }else if (boyut.equalsIgnoreCase("kucuk boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        }

        System.out.println(hangikahve+" "+boyut+" hazirdir. Afiyet olsun, saglikla....");


    }
}
