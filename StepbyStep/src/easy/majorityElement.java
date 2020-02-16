package easy;

import java.util.HashMap;

public class majorityElement {
    public static int majorityElement(int[] nums){
        if(nums==null||nums.length==0) return 0;
        int threahold=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int times=map.get(nums[i]);
                times=times+1;
                if(times>threahold){
                    return nums[i];
                }
                else{
                    map.put(nums[i],times);
                }
            }
        }



        return  0;
    }
    public static boolean isMajorityElement(int[] nums,int target){
        if(nums==null||nums.length==0) return  false;
        int position=nums.length/2;
        if(nums[position]!=target){
            System.out.println(" not longer than half");
            return false;
        }
        int des=position,asc=position;
        int desCount=0,ascCount=0;

        while(des>0){
            System.out.println("move forward");
            des--;
            if(nums[des]==target){
                desCount++;
            }
        }
        while(asc<nums.length-1){
            asc++;
            System.out.println("move backward");
            if(nums[asc]==target){
                ascCount++;
            }
        }

        if((ascCount+desCount+1)>position){
            return true;
        }
        System.out.println(ascCount+desCount+1);

        return false;

    }


        public  static  void main(String[] args){
        int[] nums={2,2,1,1,1,2,2};
        //    System.out.println(majorityElement(nums));
        int[] nums2={2,4,5,5,5,5,5,6,6};
        int[] nums3={10,100,101,101};
        int[] nums4={438885258,438885258};
          //  System.out.println(isMajorityElement(nums2,5));
         //   System.out.println(isMajorityElement(nums2,101));
            System.out.println(isMajorityElement(nums4,438885258));
        }

}
