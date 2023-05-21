package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C01_binarySearch {

    public static void main(String[] args) {

        int[] arr= {4,9,1,5,11,3,7,4,6};
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr,11));
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr, 7));

        Arrays.sort(arr);  // [1, 3, 4, 4, 5, 6, 7, 9, 11]
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr,11));
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr,4));


    }
}
