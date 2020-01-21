package easy;

public class findPeak {
    public static int findPeakElement(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return  0;
        if(nums.length>=2&&nums[nums.length-1]>nums[nums.length-2]){
            return  nums.length-1;
        }
        int start=0,end=nums.length-1;
        while (start+1<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return  mid;
            if(nums[mid]<nums[mid+1]&&nums[mid]>nums[mid-1]) start=mid;
            if(nums[mid]>nums[mid+1]&&nums[mid]<nums[mid-1]) end=mid;
            else if(nums[mid]<nums[mid-1]&&nums[mid]<nums[mid+1]){
                end=mid;
            }
        }
            return 0;
    }
    public static  int findSmallest(int[] nums){
            if(nums==null||nums.length==0) return -1;
            if(nums.length==1) {return  0;}
            int start=0,end=nums.length-1;
            int target=nums[0];
            while(start+1<end){
                int mid=start+(end-start)/2;
                if(nums[mid]<target){
                //    start=mid;
                end=mid;
                }
               else {
                   start=mid;
                }
            }
            if(nums[start]<target){
                return  start;
            }
            else{
                return  end;
            }



    }

    public static  int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int target = nums[0];
            int start=0,end=nums.length-1;
            while(start+1<end){

                int mid=start+(end-start)/2;

                if(nums[mid]<target){
                    end=mid;
                }
                if(nums[mid]>=target){
                    start=mid;
                }
            }
                if(nums[start]<target){
                    return nums[start];
                }
                if(nums[end]<target){
                    return nums[end];
                }


            return  target;


    }

    public static void main(String[] args) {

        int[] nums={3,0,2};
        int[] nums1={1,2};
        int[] nums2={2,-1};
        int[] nums4={-3,2,3};
        int[] nums3={6,7,8,9,2,3,4};
        int[] nums5={-3,-4,-2};
        System.out.println(findMin(nums)); //0
        System.out.println(findMin(nums1)); //1
        System.out.println(findMin(nums2)); //-1
        System.out.println(findMin(nums3));// 2
        System.out.println(findMin(nums4));// -3
        System.out.println(findMin(nums5)); ///-4

    }

}
