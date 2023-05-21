package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDA {

    public static void main(String[] args) {

        int[][] arr= {{3,4,5},{2,3},{1}};

        System.out.println(arr[1][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[2].length);
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr[1])); //  [2, 3]
        System.out.println(Arrays.toString(arr)); // [[I@1e643faf, [I@3b6eb2ec, [I@6e8dacdf]
        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [2, 3], [1]]
        System.out.println(arr.length); // 3





    }
}
