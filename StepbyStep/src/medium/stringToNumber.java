package medium;

public class stringToNumber {
    public  static  String stringToNumber(String s1,String s2){


        StringBuffer sb=new StringBuffer();
        char[] num1=s1.toCharArray();
        char[] num2=s2.toCharArray();
        int length1= num1.length-1;
        int length2=num2.length-1;
        int offset=Math.max(length1,length2);
        int sum,carry=0;int i=1;
        while(length1>=0||length2>=0){
              int add1=length1>-1?Character.getNumericValue(num1[length1]):0;
              int add2=length2>-1?Character.getNumericValue(num2[length2]):0;

               sum=(add1+add2+carry)%10;
               carry=(add1+add2+carry)/10;


            System.out.println(" the sum is "+sum);
            length1--;
            length2--;
            sb.insert(0,sum);
            offset--;
        }
        if(carry>0){
            sb.insert(0,carry);

        }



        return  sb.toString();
    }


    public static void main(String[] args) {
        String s1="1230";
        String s2="99";
        System.out.println(stringToNumber(s1,s2));
    }
}
