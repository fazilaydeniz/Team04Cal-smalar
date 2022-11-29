package cozdugumuzSorular;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class S5_NotOrtalamasiAlma {
    //Ögrenci notlarini sisteme giriniz,
    //not girmeyi bitirmek icin Q ya basiniz
    //ögrenci sayisini, not listesini, not ortalamasini ve ortalama altinda kalan ogrenci sayisini yazdiriniz.

    static List<Double> ASinifiNotListesi=new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("A Sinifi Not Listesi");
        notlistesiOlustur();

        System.out.println("Ogrenci sayisi: "+ASinifiNotListesi.size());
        System.out.println("Not Listesi; "+ASinifiNotListesi);

        double toplam=0;
        double ort;

        for (double eachNot:ASinifiNotListesi
        ) {
            toplam+=eachNot;
        }
        ort=toplam/ASinifiNotListesi.size();
        System.out.println("Ortalama not: "+ort);

        int tembeller=0;
        for (double eachNot:ASinifiNotListesi
        ) {
            if (eachNot<ort){
                tembeller++;
            }

        }
        System.out.println("Ortalama altindakiler: "+tembeller);

    }
    public static void notlistesiOlustur(){
        Scanner scan=new Scanner(System.in);
        double not;
        boolean giris=true;

        while (giris){
            try {
                System.out.println("Notlari giriniz.\n Not girisini bitirmek icin Q'ya basiniz");
                not= scan.nextDouble();
                ASinifiNotListesi.add(not);
            } catch (Exception e) {
                String deger= scan.nextLine();
                if (deger.equalsIgnoreCase("Q")){
                    break;
                }else {
                    System.out.println("Bitirmek icin Q gereklidir, devam etmek icin sayi giriniz");
                }
            }
        }
   }

}
