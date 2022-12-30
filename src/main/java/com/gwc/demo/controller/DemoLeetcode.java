package com.gwc.demo.controller;


import java.util.LinkedList;

/**
 * 反转链表 int数组输出
 */
public class DemoLeetcode {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);
//        listNode.next.next.next = new ListNode(4);
//        listNode.next.next.next.next = new ListNode(5);

        ListNode listNode2 = new ListNode(4);
        listNode2.next = new ListNode(5);
        listNode2.next.next = new ListNode(6);
        listNode2.next.next.next = new ListNode(7);
        listNode2.next.next.next.next = new ListNode(8);
        mergeTwoLists(listNode,listNode2);
        System.out.println(reversePrint(listNode));
    }

    public static int[] reversePrint(ListNode head){
        LinkedList<Integer> stack = new LinkedList<>();
        while(head!=null){
            stack.addFirst(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.removeFirst();
        }
        return res;
    }

    public static ListNode reverseP(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    /**
     * 合并两个有序链表
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0),res = dum;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                res.next = l1;
                l1 = l1.next;
            }
            else{
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        res.next =l1 != null?l1:l2;
        return dum.next;
    }static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
