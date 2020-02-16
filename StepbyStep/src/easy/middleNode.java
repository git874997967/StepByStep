package easy;

import java.util.List;

public class middleNode {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public static ListNode middleNode(ListNode head){
        if(head==null||head.next==null) return  head;
        int length=midd(head);
        while(length>0){
            head=head.next;
            length--;
        }
        return  head;
    }

    public static int midd(ListNode head){
        int length=0;
            while(head!=null){
                head=head.next;
                length++;
            }
        System.out.println(" the length is "+length);

        System.out.println(" the length is "+length);
        return  length/2;
    }

    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        head.next=new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
         head.next.next.next.next.next=new ListNode(6);
         System.out.println(middleNode(head).val);


    }


}
