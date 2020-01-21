package medium;

public class sortColor {
      public static void sortColor(int[] arr){
          if(arr==null||arr.length==0){
              return;
          }
          for (int i = 0; i <arr.length ; i++) {
              int min=i;
              for (int j = 0; j <arr.length-1 ; j++) {

                  if(arr[min]<arr[j]){
                      System.out.println(" start to swap"+ min+" and " +j + " before are"+ arr[min]+ " "+ arr[j]);
                   int temp=arr[min];
                      arr[min]=arr[j];
                   arr[j]=temp;
                      System.out.println(" after are "+ arr[min]+" "+arr[j]);
                  }
              }
          }

      }

      public static void sortColor2(int[] arr) {
          if (arr == null || arr.length == 0) {
              return;
          }
          int temp;
          int p0 = 0, p2 = arr.length - 1, curr = 0;
            while(p2>=curr){
                if(arr[curr]==2){
                    temp=arr[curr];
                    arr[curr]=arr[p2];
                    arr[p2]=temp;
                    p2--;
                }
                 if(arr[curr]==0){
                      temp=arr[curr];
                    arr[curr]=arr[p0];
                    arr[p0]=temp;
                    curr++;
                    p0++;
                }
                else{
                     curr++;
                 }
            }


      }
    public static void main(String[] args) {
        int[] color={0,2,1,1};
        sortColor2(color);
        for(int i:color){
            System.out.print(i+" ");
        }
    }
}
