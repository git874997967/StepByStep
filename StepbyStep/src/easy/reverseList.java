package easy;

public class reverseList {
public static class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        }

    }
    public static ListNode reverseList(ListNode head){
            if(head==null||head.next==null) return head;
            ListNode pre=null;
            ListNode cur=head;
            while(cur!=null){
                ListNode temp=cur.next;
                cur.next=pre;
                pre=cur;
                cur=temp;
            }

            return pre;
    }
    public static ListNode reverseList2(ListNode head){
    if(head==null||head.next==null) return  head;  // basic case
        ListNode newHead=reverseList2(head.next);
        head.next.next=head;// reverse the next to pre  2_>3  to  3_>2
        head.next=null; //  free the 2_>3
        return newHead;
    }
}
