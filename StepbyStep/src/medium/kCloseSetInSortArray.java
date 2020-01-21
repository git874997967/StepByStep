package medium;

import java.util.ArrayList;

public class kCloseSetInSortArray {
    public static ArrayList kCloseSetInSortArray(int[] arr, int k, int t) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0, end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= t) {
                end = mid;
            } else {
                start = mid;
            }
        }

        System.out.println(" the mid is" + end);
        int right = end;
        int left = end - 1;
        int num = 0;
        while (num < k) {
            int l_delta = Integer.MAX_VALUE;
            int r_delta = Integer.MAX_VALUE;
            if (left >= 0) {
                l_delta = Math.abs(arr[left] - t);

            }
            if (right < arr.length) {
                r_delta = Math.abs(arr[right] - t);
            }
            if (l_delta <= r_delta) {
                left--;
            } else {
                right++;
            }
            num++;
        }

        for (int i = left + 1; i < right; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -2, 1, 2, 3, 4, 5};
        ArrayList<Integer> resutlt = kCloseSetInSortArray(arr, 4, -1);
        for (int i = 0; i < resutlt.size(); i++) {
            System.out.print(resutlt.get(i));
        }
    }
}
