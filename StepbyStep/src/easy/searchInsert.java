package easy;

public class searchInsert {

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid;
            }
            if (nums[mid] > target) {
                end = mid;
            }

        }
        // here we consider the  first and last position  smaller than first and larger than last  and then  between unfound first and last
        if (nums[start] >= target) {
            return start;
        } else if (nums[end] >= target) {
            return end;
        }
        return end + 1;


    }

    public static void main(String[] args) {
        int[] arr = {3, 5};
        System.out.println(searchInsert(arr, 5));

        System.out.println(searchInsert(arr, 2));


        System.out.println(searchInsert(arr, 7));

        System.out.println(searchInsert(arr, 0));
    }


}
