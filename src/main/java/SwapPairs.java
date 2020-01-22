public class SwapPairs {

    public static ListNode swapPairs(ListNode nodes) {
        swap(nodes);
        return nodes;
    }

    public static void swap(ListNode nodes){
        if(nodes == null)
            return;

        ListNode head = nodes;
        ListNode next = nodes.next;
        head.next = nodes.next.next;
        next.next = head;

        swap(next.next.next);
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        head.next = two;
        two.next = three;
        three.next = four;

        head = swapPairs(head);

        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);
    }
}
