package cozdugumuzSorular;

import java.util.Scanner;

public class S4_BiletFiyatiHesaplama {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        BiletFiyati();

    }

    public static void BiletFiyati() {
        System.out.println("Hangi sehre gitmek istersiniz?(B C D)");
        String gidilecekYer = scan.nextLine();
        System.out.println("Ucak biletini gidis donus mu istiyorsunuz? (Evet yada Hayir secin ve Enter`a basin");
        String gidisDonus = scan.nextLine();
        String bosKod = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();


        if (gidilecekYer.equalsIgnoreCase("b")) {
            if (gidisDonus.equalsIgnoreCase("evet")) {
                if (yas <= 12) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 500 * 0.5 * 0.80);
                } else if (yas > 12 && yas < 24) {
                    System.out.println("Toplam yol Ucreti: $" + 0.10 * 500 * 0.9 * .80);
                } else if (yas > 65) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 500 * 0.70 * 0.80);
                } else {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 500 * 0.80);
                }

            } else {
                if (yas <= 12) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 500 * 0.5);
                } else if (yas > 12 && yas < 24) {
                    System.out.println("Toplam yol Ucreti: $" + 0.10 * 500 * 0.9);
                } else if (yas > 65) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 500 * 0.70);
                } else {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 500);
                }
            }
        } else if (gidilecekYer.equalsIgnoreCase("c")) {
            if (gidisDonus.equalsIgnoreCase("evet")) {
                if (yas <= 12) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 700 * 0.5 * 0.80);
                } else if (yas > 12 && yas < 24) {
                    System.out.println("Toplam yol Ucreti: $" + 0.10 * 700 * 0.9 * .80);
                } else if (yas > 65) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 700 * 0.70 * 0.80);
                } else {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 500 * 0.80);
                }

            } else {
                if (yas <= 12) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 700 * 0.5);
                } else if (yas > 12 && yas < 24) {
                    System.out.println("Toplam yol Ucreti: $" + 0.10 * 700 * 0.9);
                } else if (yas > 65) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 700 * 0.70);
                } else {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 700);
                }
            }

        } else if (gidilecekYer.equalsIgnoreCase("d")) {
            if (gidisDonus.equalsIgnoreCase("evet")) {
                if (yas <= 12) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 900 * 0.5 * 0.80);
                } else if (yas > 12 && yas < 24) {
                    System.out.println("Toplam yol Ucreti: $" + 0.10 * 900 * 0.9 * .80);
                } else if (yas > 65) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 900 * 0.70 * 0.80);
                } else {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 900 * 0.80);
                }

            } else {
                if (yas <= 12) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 900 * 0.5);
                } else if (yas > 12 && yas < 24) {
                    System.out.println("Toplam yol Ucreti: $" + 0.10 * 900 * 0.9);
                } else if (yas > 65) {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 900 * 0.70);
                } else {
                    System.out.println("Toplam yol ucreti: $" + 0.10 * 900);
                }
            }


        }
    }
}