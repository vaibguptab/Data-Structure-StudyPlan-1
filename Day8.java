//package Data_structure_StudyPlan;
//
public class Day8 {
    public static void main(String[] args) {
        System.out.println("Day8");
    }
}
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next==null){
//            return head;
//        }
//        ListNode curr= head,prev=null;
//        while (curr!=null){
//            ListNode temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        return prev;
//    }
//
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head==null || head.next==null){
//            return head;
//        }
//
//        ListNode current = head;
//        while(current !=null){
//            ListNode nextnode = current.next;
//            if(nextnode==null || nextnode.val != current.val){
//                current = nextnode;
//            }else{
//                current.next = nextnode.next;
//            }
//        }
//        return head;
//    }
//}
