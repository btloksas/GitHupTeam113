package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_add {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        System.out.println(sayilar);

        sayilar.add(1,7);
        System.out.println(sayilar);

        List<Integer> ekler = new ArrayList<>();
        ekler.add(4);
        ekler.add(6);
        System.out.println(ekler); // [4, 6]
        sayilar.addAll(ekler);
        System.out.println(sayilar); // [3, 7, 5, 2, 4, 6]
        // 7 ile 5 arasina ekler'i ekleyin
        sayilar.addAll(2,ekler);
        System.out.println(sayilar); // [3, 7, 4, 6, 5, 2, 4, 6]
    }
}
