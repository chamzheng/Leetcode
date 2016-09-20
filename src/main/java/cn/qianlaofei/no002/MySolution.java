package cn.qianlaofei.no002;

/**
 * Created by chamz on 2016-09-20.
 */

public class MySolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode postion = head;
        boolean isCarry = false;//是否进位

        ListNode l1postion = l1;
        ListNode l2postion = l2;

        while (null != l1postion && null != l2postion) {
            int value = l1postion.val + l2postion.val;
            ListNode temp;
            if(isCarry) { // 前面有进位
               value++;
            }
            if(value >= 10) {
                temp = new ListNode(value%10);
                isCarry = true;
            } else {
                temp = new ListNode(value);
                isCarry = false;
            }
            postion.next = temp;
            postion = temp;
            l1postion = l1postion.next;
            l2postion = l2postion.next;
        }

        if(null != l1postion) {
            ListNode temp;
            while (null != l1postion) {
                int value = l1postion.val;
                if(isCarry) { // 前面有进位
                    value++;
                }
                if(value >= 10) {
                    temp = new ListNode(value%10);
                    isCarry = true;
                } else {
                    isCarry = false;
                    temp = new ListNode(value);
                }
                postion.next = temp;
                postion = temp;
                l1postion = l1postion.next;
            }
        }

        if(null != l2postion) {
            ListNode temp;
            while (null != l2postion) {
                int value = l2postion.val;
                if(isCarry) { // 前面有进位
                    value++;
                }
                if(value >= 10) {
                    temp = new ListNode(value%10);
                    isCarry = true;
                } else {
                    temp = new ListNode(value);
                    isCarry = false;
                }
                postion.next = temp;
                postion = temp;
                l2postion = l2postion.next;
            }
        }

        if(isCarry) {
            postion.next = new ListNode(1);
        }
        return head.next;
    }

    //AC
    //击败了11.57%的Java代码
}
