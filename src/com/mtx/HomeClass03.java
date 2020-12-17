package com.mtx;
import java.util.*;

public class HomeClass03 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        String[] list = {"AA","BB","CC","AA","cc","DD","BB","ee","Bb","AA","Bb","bB","Bbb"};
        for(String l:list){
            if(hashMap.containsKey(l)){//key在map中已存在，value+1
                hashMap.put(l,hashMap.get(l)+1);
            }else{//key不在map中，存入新的键值对，key=l，value默认为1，作为计数器
                hashMap.put(l,1);
            }
        }
        Set<Map.Entry<String,Integer>> entrySet = hashMap.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet){
            String key = entry.getKey();
            int value = entry.getValue();
            if(value>1){//遍历map，如果value值大于1说明重复出现，打印相应key-value
                System.out.println("元素{"+key+"}的出现次数是："+value);
            }
        }
        //        Set<String> keySet = hashMap.keySet();
        //        for(String key:keySet){
        //            if(hashMap.get(key)>1){
        //                System.out.println("元素{"+key+"}的出现次数是："+hashMap.get(key));
        //            }
        //        }
    }
}
