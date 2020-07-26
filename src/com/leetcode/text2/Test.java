package com.leetcode.text2;

import java.util.Arrays;

public class Test {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(243);
        ListNode l2 = new ListNode(243);
        AddTwoNumbers1 s = new AddTwoNumbers1();
//        ListNode result = s.addTwoNumbers(l1,l2);
        System.out.println(l1.equals(l2));
    }
}
