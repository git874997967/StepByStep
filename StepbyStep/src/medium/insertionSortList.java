package medium;

public class insertionSortList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }

    }
    public static ListNode insertionSortList(ListNode head){
        if( head==null||head.next==null) return  head;
        return head;
    }

    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        head.next=new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        //  head.next.next.next.next.next=new ListNode(6);
        head=insertionSortList(head);
     while( head!=null){
         System.out.println(head.val);
         head=head.next;
     }

    }



}
