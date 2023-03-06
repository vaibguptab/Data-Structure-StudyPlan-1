package Data_structure_StudyPlan;

import java.util.LinkedList;

public class Day6 {
    public static void main(String[] args) {

    }
    public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> L1, LinkedList<Integer> L2) {
        if(L1 == null){
            return L2;
        }
        if(L2 == null){
            return L1;
        }
        LinkedList<Integer> t1 =L1 , t2 = L2;
        LinkedList<Integer> head =null,tail=null;
        if(t1.data<=t2.data){
            head = t1;
            tail =t1;
            t1 = t1.next;
        } else if(t1.val>t2.val){
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while(t1!= null && t2!=null){
            if(t1.val<=t2.val){
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }else{
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null){
            tail.next = t1;
        }else{
            tail.next = t2;
        }
        return head;
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        while(head.val==val){
            head = head.next;
            if(head==null) return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null){
            if(curr.val == val)  prev.next = curr.next ;
            else prev = curr;
            curr = curr.next;
        }
        return head;

    }
}
