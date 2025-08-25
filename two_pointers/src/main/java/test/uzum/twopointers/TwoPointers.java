package test.uzum.twopointers;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class TwoPointers {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 2, 3, 3, 3, 3};

        int[] unique = twoPointers(numbers);
        int[] uniqueWithLinked = removeDuplicates(numbers);

        System.out.println(Arrays.toString(unique));
        System.out.println(Arrays.toString(uniqueWithLinked));

    }

    public static int[] twoPointers(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[startIndex++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, startIndex);
    }

    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        int[] newArr = new int[set.size()];
        int index = 0;
        for (int x : set) {
            newArr[index++] = x;
        }
        return newArr;
    }
}
