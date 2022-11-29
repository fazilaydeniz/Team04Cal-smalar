package cozdugumuzSorular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S5_ArrayinTekrarEdenElemanlariniSilme {
      /*
      Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
      elemanlardan sadece 1 tane olacak şekilde liste oluşturup sonrasında listedeki elemanları array'e yapip
      bize dondurecek bir method olusturun.
      int[] arr = {1,2,9,4,8,3,5,7,3,6,8,5,2,9,5,1,2,7,4,5,8,3,9,4,5};
      */
 public static void main(String[] args) {
     int[] arr = {1,2,9,4,8,3,5,7,3,6,8,5,2,9,5,1,2,7,4,5,8,3,9,4,5};
     System.out.println(tekrarEdenElemanleriSil(arr));

 }
    public static List<Integer>tekrarEdenElemanleriSil(int [] arr){

     List<Integer> tekrarsizListe=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
                Collections.sort(tekrarsizListe);
            }

        }
        arr=new int[tekrarsizListe.size()];
        for (int i = 0; i < arr.length; i++) {
         arr[i]= tekrarsizListe.get(i);
        }
        return tekrarsizListe;
    }
}

