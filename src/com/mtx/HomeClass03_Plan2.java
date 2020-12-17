package com.mtx;

import java.util.*;

public class HomeClass03_Plan2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
//        String[] list = {"AA","BB","CC","AA","cc","DD","BB","ee","Bb","AA","Bb","bB","Bbb"};
//        Set<String> set = new HashSet<>(Arrays.asList(list));//Array转化成set
        List<String> list = Arrays.asList("AA","BB","CC","AA","cc","DD","BB","ee","Bb","AA","Bb","bB","Bbb");
        Set<String> set = new HashSet<>(list);//List转化成Set
        for(String s:set){
            int count =0;//每遍历一个set的值重置一次计数器
            for(String l:list){
                if(s.equals(l)){//用set中的元素s和list中的每一个元素比较，相同，计数器+1
                    count++;
                }
            }
            if(count>1){//遍历完一次list后，计数器大于1，说明当前s重复出现，输出s和count
                System.out.println("元素{"+s+"}的出现次数是："+count);
            }
        }
    }
}
