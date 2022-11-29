package cozdugumuzSorular;

import java.util.ArrayList;
import java.util.List;

public class S3_ArraydeListedenElemanSilme {
    /*
Soru-3-Listede 15 veya 13 varsa, bu elemanları kaldırınız.
Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
 */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(54);
        list.add(15);
        list.add(31);
        list.add(13);
        list.add(54);
        list.add(15);
        list.add(15);
        list.add(13);
        list.add(15);
        list.add(10);
        list.add(54);
        list.add(54);

        System.out.println("ilk hali " + list);

        ArrayList<Integer> tekrarlariSilList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!tekrarlariSilList.contains(list.get(i))) {
                tekrarlariSilList.add(list.get(i));
            }
        }
        list = tekrarlariSilList;
        System.out.println("Tekrarlar silindikten sonraki hali : " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 13 ) {
                list.remove(i);
            } if (list.get(i) == 15) {
                list.remove(i);
            }
        }
        System.out.println("Son hali " + list);
    }
}

