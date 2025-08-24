package test.uzum.twosums;

public class TwoSums {

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 7, 8};

        twoSums(arr, 11);
    }

    public static void twoSums(int[] arr, int result) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (result - arr[i] == arr[j]) {
                    System.out.println(arr[i] + "+" + arr[j] + " = " + result);
                    return;
                }
            }
        }
    }
}