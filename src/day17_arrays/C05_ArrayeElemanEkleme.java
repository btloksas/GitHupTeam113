package day17_arrays;

import java.util.Arrays;

public class C05_ArrayeElemanEkleme {
    public static void main(String[] args) {

        int[] a={4,5,6};
        int[] b= {4,5,6,10};
        a=b;
        System.out.println(Arrays.toString(a));


        int[]arr={4,5,6};
        int eklenecekElement=10;

        int[] yeniArr=new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i]=arr[i];
            yeniArr[yeniArr.length-1]=eklenecekElement;
            System.out.println(Arrays.toString(yeniArr));
            arr=yeniArr;
            System.out.println(Arrays.toString(arr));



        }



    }
}
