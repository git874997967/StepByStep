package easy;

import java.util.LinkedList;


public class moveZeroToEnd {
    public static void moveZeroToEnd_1(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            if (arr[start] == 0) {
                while (start < arr.length - 1) {
                    int temp = arr[start];
                    arr[start] = arr[start + 1];
                    arr[start + 1] = temp;
                    start++;
                }
            }

        }

    }

    public static void moveZeroToEnd_2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int[] result = arr;
        LinkedList<Integer> nums = new LinkedList();
        LinkedList<Integer> zeros = new LinkedList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros.add(arr[i]);

            } else {
                nums.add(arr[i]);
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            result[i] = nums.get(i);

        }
        int n = nums.size();
        for (int i = 0; i < zeros.size(); i++) {
            result[n + i] = zeros.get(i);

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }


    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 5, 0};
        moveZeroToEnd_2(arr);
        /*for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }*/
    }
}
