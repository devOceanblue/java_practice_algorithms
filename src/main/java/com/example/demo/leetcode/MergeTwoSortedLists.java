package com.example.demo.leetcode;


public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode result = head;
        while(true){
            if(list1!=null && list2!=null){
                if(list1.val >= list2.val){
                    result.next = list2;
                    list2 = list2.next;
                    result = result.next;
                }
                else{
                    result.next = list1;
                    list1 = list1.next;
                    result = result.next;
                }
            }
            else if(list1!=null && list2==null){
                result.next = list1;
                list1 = list1.next;
                result = result.next;
            }
            else if(list1==null && list2!=null){
                result.next = list2;
                list2 = list2.next;
                result = result.next;
            }else{
                break;
            }
        }
        return head.next;
    }
}
