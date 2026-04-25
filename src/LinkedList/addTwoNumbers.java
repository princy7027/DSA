package LinkedList;


public class addTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }
    }

    public static ListNode addtwoNumbers(ListNode l1, ListNode l2) {
        ListNode store=new ListNode(0);
        ListNode curr=store;
        int carry=0;

        while(l1 != null || l2 != null || carry != 0){
            int v1=(l1 != null) ? l1.val : 0;
            int v2=(l2 != null) ? l2.val : 0;

            int sum=carry + v1+v2;

            carry=sum/10;
            int digit=sum % 10;

            curr.next=new ListNode(digit);
            curr=curr.next;

            if(l1 !=null) l1=l1.next;
            if(l2 !=null) l2=l2.next;
        }
        return store.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addtwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
