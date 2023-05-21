package day17_arrays;

import java.util.Arrays;

public class C06_ArrayElemanEklemeMethodu {
    public static void main(String[] args) {
        int[] arr={2,4,7,8};
       arr= arrayeElementEkle(arr, 5);
        arr= arrayeElementEkle(arr, 8);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] arrayeElementEkle(int[]arr, int eklenecekElement){

        int[] yeniArr= new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];

        }

        yeniArr[yeniArr.length-1]=eklenecekElement;
        return yeniArr;


    }
}
