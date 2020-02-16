package medium;

import java.util.List;

public class partitionList {
    public static  class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val=x;
        }
    }
    public  static  ListNode partitionList(ListNode head,int x){
            if(head==null) return  head;
            ListNode before_head=new ListNode (0);
            ListNode before= before_head;
            ListNode after_head=new ListNode(0);
            ListNode after =after_head;
            while(head!=null){
                    if(head.val<x){
                        before.next=head;
                        before=before.next;
                    }
                    else{
                        after.next=head;
                        after=after.next;
                    }
                    // move head to origin head;

                head=head.next;
            }
             //head=before_head.next;
             after.next=null;
             before.next=after_head.next;
            return  before_head.next;
    }
        public static ListNode partitionList2( ListNode  head,int val){
        ListNode firstHead=new ListNode(0);
        ListNode secondHead=new ListNode(0);
        firstHead.next=head;
        secondHead.next=head;
        ListNode first=firstHead;
        ListNode second =secondHead;
        while(head!=null){
         if(head.val<val){
             //append to first
            first.next=head;
            first=first.next;
         }

         else if(head.val>val){
             second.next=head;
             second=second.next;

         }
            else{
             System.out.println(head.val);
             second.next=head;
             second=second.next;
         }
         // append to second

            head=head.next;
        }
        second.next=null;
        first.next=secondHead.next;

        return  firstHead.next;
        }



    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(6);
        head.next.next.next=new ListNode(5);
        head.next.next.next.next=new ListNode(3);
        head.next.next.next.next.next=new ListNode(4);
        ListNode res=partitionList2(head,4);

        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }


}
