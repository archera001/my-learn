package com.mtx;

public class Lesson3 {
    int len;
    int weight;
    int mianji;
    public Lesson3(int len,int weight){
        this.len = len;
        this.weight = weight;
        this.mianji = len * weight;
    }

    public static void main(String[] args) {
        Lesson3 lesson3 = new Lesson3(3,6);
        System.out.println(lesson3.len);
        System.out.println(lesson3.weight);
        System.out.println(lesson3.mianji);
    }
}
