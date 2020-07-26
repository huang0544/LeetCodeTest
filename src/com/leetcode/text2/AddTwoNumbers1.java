package com.leetcode.text2;

public class AddTwoNumbers1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        //将当前结点初始化为返回列表的哑结点
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;
        //将进位 carry 初始化为 0
        int carry = 0;
        //将 p 和 q 分别初始化为列表 l1 和 l2 的头部
        //遍历列表 l1 和 l2 直至到达它们的尾端
        while (p != null || q != null) {
            //将 x 设为结点 p 的值。如果 p 已经到达 l1 的末尾，则将其值设置为 0
            int x = (p != null) ? p.val : 0;
            //将 y 设为结点 q 的值。如果 q 已经到达 l2 的末尾，则将其值设置为 0
            int y = (q != null) ? q.val : 0;
            //设定 sum = x + y + carry
            int sum = carry + x + y;
            //更新进位的值，carry = sum / 10
            carry = sum / 10;
            //创建一个数值为 (sum mod 10)的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点。
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            //同时，将 p 和 q 前进到下一个结点。
            if (p != null) {
                p = p.next;
            }

            if (q != null) {
                q = q.next;
            }
        }
        //检查 carry = 1 是否成立，如果成立，则向返回列表追加一个含有数字 1 的新结点。
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        //返回哑结点的下一个结点。
        return dummyHead.next;
    }
}
