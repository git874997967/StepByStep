package easy;

public class binarySearchIn2D {
        public static int[] binarySearchIn2D(int[][] arr,int target){
           int[] result={-1,-1};
           if(arr==null||arr.length==0) return  result;

           int row=arr.length;
           int col=arr[0].length;
            for (int i = 0; i <row ; i++) {
                if(arr[i][0]<=target&&arr[i][col-1]>=target){
                            result[0]=i+1;
                    int start=0,end=col=1;
                    while(start+1<end){
                        int mid=start+(end-start)/2;
                        if(arr[i][mid]==target){
                            result[1]=mid;
                            return result;
                        }
                        if(arr[i][mid]>target){
                            end=mid;
                        }
                        if(arr[i][mid]<target){
                            start=mid;
                        }
                    }

                    if(arr[i][start]==target){
                        result[1]=start;
                    }
                    if(arr[i][end]==target){
                        result[1]=end;
                    }
                    return  result;
                }
            }

            return  result;
        }
        public static int findRow(int[][] arr,int target){
               // int[] result={-1,-1};
                if(arr==null||arr.length==0) return  -1;
                int row=arr.length;
                int col=arr[0].length;
                if(arr[0][0]>target|| arr[row-1][col-1]<target){
                    return  -1;
                }
                int start =0,end=row-1;
                while(start+1<end){
                    int mid=start+(end-start)/2;
                    if(arr[mid][0]==target){
                        return mid;
                    }
                   if(arr[mid][0]<target){
                      // System.out.println(" move down to "+ mid);
                       start=mid;
                   }
                   if(arr[mid][0]>target){
                      // System.out.println("move up to " +mid);
                       end=mid;
                   }
                  //  System.out.println( start+ " "+ end);
                }
                if(arr[end][0]>target){
                    return  start;
                }
                if(arr[end][col-1]>=target){
                    return end;
                }
          return  -1;

        }
        public static int[]binarySearchIn2D_2(int[][] arr,int target){
            int[] result={-1,-1};
            if(arr==null||arr.length==0){
                return  result;
            }
            int row=findRow(arr,target);

            if(row==-1){
                return  result;
            }
            else{
                result[0]=row;
                int start=0, end=arr[0].length-1;
                while (start+1<end){
                    int mid=start+(end-start)/2;
                    if(arr[row][mid]==target){
                        result[1]=mid;
                        return  result;
                    }
                    if(arr[row][mid]>target){
                        end=mid;
                    }
                    else if(arr[row][mid]<target){
                        start=mid;
                    }

                }

                if(arr[row][start]==target){
                    result[1]=start;
                }
                if(arr[row][end]==target){
                    result[1]=end;
                }
                    return result;

            }
          //  return  result;
        }
        public static  boolean binarySearch2D(int[][]arr,int target){
            if(arr==null||arr.length==0) return  false;
            int M=arr.length; /// rows; m=3
            int N=arr[0].length; // cols n=4
            // 0 1 2 3 4 5 6 7 8 9 9 10 11  12 nums  target =8  location is 7 as well as [1][3]
            //7--》 1，3  ?

            int start=0,end=M*N-1;
            while(start+1<end){
                int mid=start+(end-start)/2;
                if(arr[mid/N][mid%N]==target){
                        return true;

                }
                if(arr[mid/N][mid%N]>target){
                    end=mid;
                }
                if(arr[mid/N][mid%N]<target){
                    start=mid;
                }
            }
            if(arr[start/N][start%N]==target||arr[end/N][end%N]==target){
                return  true;
            }
            return  false;

        }



    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3, 4},
                                {5,6,7,8},
                                {9,10,11,12},
                                {13,14,15,16}
                                };
        int[] result=binarySearchIn2D_2(arr,13);
        //System.out.println(findRow(arr,12));
        System.out.println("the location is row "+ result[0]+"  col "+ result[1]);
        System.out.println(binarySearch2D(arr,5));
     }



}
