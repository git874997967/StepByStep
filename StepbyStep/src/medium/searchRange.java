package medium;

public class searchRange {
    public static int[] searchRange(int[] arr, int target) {
        if (arr == null && arr.length == 0) return new int[]{-1, -1};
        if (arr.length == 1 && arr[0] == target) return new int[]{0, 0};
        if (arr.length == 1 && arr[0] != target) return new int[]{-1, -1};
        int[] result = new int[2];
        int start = 0;
        int end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                end = mid;
            }
            if (arr[mid] < target) {
                start = mid;
            }
            if (arr[mid] > target) {
                end = mid;
            }
        }
        if (arr[start] == target) {
            result[0] = start;
        } else if (arr[end] == target) {
            result[0] = end;
        }
        start = 0;
        end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                start = mid;
            }
            if (arr[mid] < target) {
                start = mid;
            }
            if (arr[mid] > target) {
                end = mid;
            }

        }
        System.out.println(end + " " + start);
        if (arr[end] == target) {
            result[1] = end;
        } else if (arr[start] == target) {
            result[1] = start;
        } else {
            result[1] = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2};
        int[] result = searchRange(arr, 2);
        System.out.println(result[0] + " " + result[1]);
    }
}
