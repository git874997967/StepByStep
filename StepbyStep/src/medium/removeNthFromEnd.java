package medium;

import java.util.List;

public class removeNthFromEnd {
    public static  class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode slow=head, fast=head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=dummy,second=dummy;
        for (int i = 1; i <=n+1 ; i++) {
                first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        // skip Nth
        second.next=second.next.next;
        return dummy.next;

    }
public static ListNode removeFromNthEnd(ListNode head, int n){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=head;
        ListNode fast=head;
        while(n>=0){
            fast=fast.next;
            n--;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
            return  dummy.next;

}



    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        head.next=new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head=removeFromNthEnd(head,2);
         while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
         head= new ListNode(1);
        head.next=new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head=removeNthFromEnd(head,2);
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }

    }


}
