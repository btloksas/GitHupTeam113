package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] isimler = {"Nurefsan", "Berke", "Mustafa"};

        int [] sayilar= {3,1,3,5,6,6,31,6,3,9};

        char[] karakterler={'ş','o','ğ'};
         String []  arr= new String[8];

        System.out.println(isimler);

        System.out.println(Arrays.toString(isimler));
        System.out.println(Arrays.toString(arr));

        int[] a=new int[7];

        System.out.println(Arrays.toString(a));

        a[0]=4;
        a[3]=7;
        System.out.println(Arrays.toString(a));
        // a[7]=8;
        System.out.println(sayilar[4]);
        System.out.println(isimler[1]);


    }
}
