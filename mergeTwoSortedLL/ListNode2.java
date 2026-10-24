class ListNode {
    int val;
    ListNode next;
    ListNode () {}
    ListNode (int val) {
        this.val = val;
    }
    ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode ListNode2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head;

        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        
        ListNode current = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1.next;
            } else {
                current.next = list2.next;
            }
        } 
        return head;
    }
    
    public static void main(String[] args) throws Exception {
        
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(8);
        list1.next.next.next = null;

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(5);
        list2.next.next = new ListNode(7);
        list2.next.next.next = null;

        Solution solution = new Solution(list1, list2);
        solution.ListNode2(list1, list2);
    }
}


