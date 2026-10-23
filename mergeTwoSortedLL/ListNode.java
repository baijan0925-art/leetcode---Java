public class ListNode {

    // singly linked lists 
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; 
        this.next = next;
    }
}

class mergeTwoL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode list3 = new ListNode();
        ListNode head = list3;

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list3.val = list1.val;
                list1 = list1.next;
                
            } else {
                list3.val = list2.val;
                list2 = list2.next;
            }

            list3 = new ListNode();
            list3 = list3.next;
        
            if (list1 == null) {
                list3 = new ListNode();
                list3 = list2.next;
            } else if (list2 == null) {
                list3 = new ListNode();
                list3 = list1.next;
            }
        }
        return head;
    }

    public static void main(String[] args) throws Exception {

        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(8);
        list1.next.next.next = null;

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(5);
        list2.next.next = new ListNode(7);
        list2.next.next.next = null;

        ListNode list3 = new ListNode();

        mergeTwoL solution = new mergeTwoL();

        System.out.println(solution.mergeTwoLists(list1, list2));
    }
}
