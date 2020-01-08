package easy;

public class SelectionSort {

    public static  void selectionSort(int[] arr){
        System.out.println("hello world");
        if(arr==null||arr.length==0) return;
        for (int i = 0; i <arr.length ; i++) {
            //locate the first
            int min=i;
            for (int j = 0; j <arr.length-1 ; j++) {
                // if first larger than the second then swap
                if(arr[min]<arr[j]){
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
    int[] arr={1,3,-3,5,0,2,10};
            selectionSort(arr);

    }


}
