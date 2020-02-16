package easy;

public class deleteNode {

    public static  class  ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            this.val=x;
        }
    }
    public static ListNode deleteNode(ListNode head,int val){
       if(head==null) return  head;
       ListNode sentinel= new ListNode(0);
        sentinel.next=head; //fake head;
        ListNode pre=sentinel;
        ListNode cur=head;  //pre.next=cur?
        while(cur!=null){
            if(cur.val==val)  pre.next=cur.next;  //pre.next=cur   ===  cur=cur.next
            else pre=cur;
            cur=cur.next;
        }
        return  sentinel.next;
    }



    public  static  ListNode deleteNode2(ListNode head, int val){
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        while(head!=null){
            if( head.val==val){
                pre.next=head.next;
            }
            else{
                pre=head;
            }
            head=head.next;
        }

            return  dummy.next;
    }

    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        head.next=new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
         head.next.next.next.next.next=new ListNode(6);
         head=deleteNode2(head,4);
         while (head!=null){
             System.out.println(head.val);
             head=head.next;
         }

    }


}
