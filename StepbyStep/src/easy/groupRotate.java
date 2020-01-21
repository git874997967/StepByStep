package easy;

public class groupRotate {
    public static void groupRotate(int[] arr, int k) {
        //basic case
        if (arr == null || arr.length == 0) {
            return;
        }
        int last = arr.length % k;  // last =2 length =11
        int lastStart = arr.length - last;  // lastPositon=;
        int lastEnd = arr.length - 1;
        for (int i = 0; i + k < arr.length; i = i + k) {
            int start = i;
            int end = i + k - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        while (lastStart < lastEnd) {
            int temp = arr[lastStart];
            arr[lastStart] = arr[lastEnd];
            arr[lastEnd] = temp;
            lastStart++;
            lastEnd--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        groupRotate(arr, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
