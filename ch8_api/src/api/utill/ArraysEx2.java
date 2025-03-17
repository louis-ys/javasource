package api.utill;

import java.util.Arrays;

public class ArraysEx2 {

    public static void main(String[] args) {

        Integer[] arr = { 33, 24, 15, 66, 7 };

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 15));

        // 배열 비교
        Integer[] arr1 = { 33, 24, 15, 66, 7 };
        Integer[] arr2 = { 33, 24, 15, 66, 8 };
        System.out.println(Arrays.equals(arr1, arr2));
    }

}
