package easy;

public class selectionSort {

    public static  void selectionSort(int[] arr){

        if(arr==null||arr.length==0) return;
        for (int i = 0; i <arr.length ; i++) {
            //locate the first
            int min=i;
            for (int j = 0; j <arr.length-1 ; j++) {
                // if first larger than the second then swap
                System.out.println(" inside the loop " + arr[min]+" and "+arr[j]);
                if(arr[min]<arr[j]){
                    System.out.println(" inside the swap  will swap " + arr[min]+" and "+arr[j]);
                    int temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
    int[] arr={2,1};
            selectionSort(arr);

    }


}
