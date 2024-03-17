class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode (0, null);
        ListNode travel = new ListNode(0,null);
        ListNode prev = ret;
        int val;
        int carry = 0;
        val = l1.val + l2.val;
        carry = val / 10;
        val = val % 10;
        ret.val = val;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null){
            val = l1.val;
            if(l2 != null){
                val += l2.val;
                l2 = l2.next;
            }
            val = val + carry;
            carry = val / 10;
            val = val % 10;
            travel.val = val;
            prev.next = travel;
            prev = travel;
            travel = new ListNode(0,null);
            l1 = l1.next;
        }
        while(l2 != null){
            val = l2.val + carry;
            carry = val / 10;
            val = val % 10;
            travel.val = val;
            prev.next = travel;
            prev = travel;
            travel = new ListNode(0,null);
            l2 = l2.next;
        }
        if (carry == 1){
            travel.val = 1;
            prev.next = travel;
        }
        return ret;
    }
}
