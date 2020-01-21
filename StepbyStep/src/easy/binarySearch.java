package easy;

public class binarySearch {
    public static void binarySearch(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= k) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (arr[start] == k) {
            System.out.println(" find the k " + k);
        }
        if (arr[end] == k) {
            System.out.println("find the k" + k);
        } else {
            System.out.println("cannot find the k");
            System.out.println(start + " " + end);
        }


    }

    public static int binarySearch1(int[] arr,int target){
        if(arr==null||arr.length==0){
            return -1;
        }
        int start=0,end=arr.length-1;
        while(start+1<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target){
                end=mid;
            }
            if(arr[mid]<target){
                start=mid;
            }
        }

        if(arr[start]==target){
            return start;
        }
        if(arr[end]==target){
            return  end;
        }
        return -1;
    }

    public static  int binarySearchII(int[] nums,int target){
        if(nums==null||nums.length==0){
            return -1;
        }
        int start=0,end=nums.length-1;
        while(start+1<end){
            int mid=start+(end-start)/2;
            System.out.println("mid is" +mid+" "+start+" "+end);
            System.out.println(nums[mid]+" "+ target);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){   /// -1 0 1(mid) 2 3 4

                start=mid;
                System.out.println(" move back the start is"+ start);
            }
            if(nums[mid]>target){
                end=mid;
                System.out.println("move forward the end is "+ end);
            }
        }

        if(nums[start]==target){
            return start;
        }
        if(nums[end]==target){
            return end;
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {3, 5};
       // binarySearch(arr, 4);
        int[] nums={-1,0,3,5,9,12};
        System.out.println(binarySearchII(nums,9));
    }

}
