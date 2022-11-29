package cozdugumuzSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S2_DoubleUrunFiyati {
    //String bir listede verilen tüm fiyatların toplamını bulunuz.
    //Örnek: List<String> myList = new List<String>{'$12.999', '$23.600', '$54.450'}; ==> 91.040
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ürün fiyatlarını giriniz");
        String fiyat1= scan.nextLine();
        String fiyat2= scan.nextLine();
        String fiyat3= scan.nextLine();
        double toplam=0;

        List<String> myList= new ArrayList<>();
        myList.add(fiyat1);
        myList.add(fiyat2);
        myList.add(fiyat3);

        for (String each:myList) {
            each=each.replaceAll("\\D","");
            each= each.substring(0,2)+"."+ each.substring(2);

            toplam+= Double.parseDouble(each);

        }
        System.out.printf("$ " + "%.2f", toplam);
    }


}
