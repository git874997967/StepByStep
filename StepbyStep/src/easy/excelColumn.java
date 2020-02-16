package easy;

public class excelColumn {
    public static int titleToNumber(String s){
///
        int n=s.length();
        int res=0;
        int temp=1;

        for (int i=n;i>0;i--){
        res=res+(s.charAt(i-1)-64)*temp;
        temp=temp*26;
        }
        System.out.println(res);
        return res;

    }

    public static String numberToTitle(int n){
        if(n<1) return  "";
        StringBuffer sb= new StringBuffer();
        while(n>0)
        {
            if(n%26==0){
                sb.append('Z');
                n=n-26;
            }
            else{
                sb.append((char)(n%26+64));
                n=n-(n%26);
            }
            n=n/26;
        }

        return  sb.reverse().toString();
    }


    public static void main(String[] args) {

        titleToNumber("A");
        titleToNumber("AAB");
        titleToNumber("ZY");
        System.out.println(numberToTitle(704));
        System.out.println(numberToTitle(701));
    }


}
