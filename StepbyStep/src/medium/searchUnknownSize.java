package medium;

public class searchUnknownSize {
    public  static int searchUnknownSize(int[] arr,int num){
        if(arr==null||arr.length==0) return -1;

        if(arr[0]==num) return 0;

        else{

       int index=1;
       if(arr[index]<num){
           return -1;
       }
       if(arr[index]==num){
           return 1;
       }
       while(arr[index]<num){
           index=index*2;
       }

       int start=index/2;int end=index;
       while(start+1<end){
           int mid=start+(end-start)/2;
           if(arr[mid]==num){
               return  mid;
           }
           if(arr[mid]>num){
               end=mid;
           }
           if(arr[mid]<num){
               start=mid;
           }
       }
        if(arr[start]==num){
            return  start;
        }
        if(arr[end]==num){
            return  end;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,3,4};
        int[] arr2={-1,0,3,5,9,12};
        System.out.println(searchUnknownSize(arr,3));// 4
        System.out.println(searchUnknownSize(arr2,2));
    }
}
