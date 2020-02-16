package easy;

public class hasCycle {
public static class ListNode{
        int val;
        ListNode next ;
        ListNode(int x){
            val=x;
        }
    }

    public static boolean hasCycle(ListNode head){
        if(head==null||head.next==null) return  false;

        ListNode slow=head;
        ListNode fast =head;
        while(fast!=null||fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return  true;
            }
        }


    return  false;
    }


}
