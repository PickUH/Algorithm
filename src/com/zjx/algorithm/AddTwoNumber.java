package com.zjx.algorithm;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumber {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        List list2 = new ArrayList();
        list2.add(5);
        list2.add(7);
        list2.add(9);
        List l3 = addTwoNumbers(list1,list2);
        System.out.println(l3);
    }
    public static List addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        int sum = 0;
        int ten = 1;//
        int every = -1;
        List l3 = new ArrayList();
        //将最大数的list放在l1中
        if(l1.size() < l2.size()){
            l3 = l1;
            l1 = l2;
            l2 = l3;
        }
        l3 = new ArrayList();
        for (int i = 0; i < l1.size(); i++) {
            //求和
            sum += l1.get(i) * ten;
            //处理位数小的情况
            if(i <= l2.size() -1){
                sum += l2.get(i) * ten;
            }
            //处理进位得到每个位数
            every = (sum - ten * 10) < 0 ? (sum/ten) : (sum - ten * 10 )/ten;
            l3.add(every);
            ten = ten * 10;
            //处理最后一位的进位
            if(sum > ten && i == l1.size() -1){
                every = sum/ten;
                l3.add(every);
            }
        }
        System.out.println(sum);
        return l3;
    }
}
