package com.mtx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StuDB {
    public static HashMap<Long,Student> stuHashMap = new HashMap<Long, Student>();

    public static void addStu(String name,Long phone){

        if(stuHashMap.containsKey(phone)){
            System.out.println(phone+"手机号已存在不能添加");
        }else {
            Student stu = new Student(name,phone);
            stuHashMap.put(phone,stu);
        }
    }

    public static ArrayList<Student> selectStu(Object object){
        ArrayList<Student> stuList = new ArrayList<Student>();
        if(object instanceof Long){//通过手机号查找
            try{
                Student stu = stuHashMap.get(object);
                System.out.println(stu.getName());
                stuList.add(stu);
            }catch (Exception e){
                System.out.println(object+"手机号不存在");
            }
        }else if(object instanceof String){
            Set<HashMap.Entry<Long,Student>> entrySet = stuHashMap.entrySet();
            for(HashMap.Entry<Long,Student> entry:entrySet){
                Long k = entry.getKey();
                Student v = entry.getValue();
                if(v.getName().equals(object)){
                    System.out.println(v.getName());
                    stuList.add(v);
                }
            }
            if(stuList.size() == 0){
                System.out.println(object+"学员姓名不存在");
            }
        }
        return stuList;
    }

    //增加学员成绩，计算平均分，获取最高分的学员
    public static void setStuScore(Object object,float score){
        ArrayList<Student> stuList = selectStu(object);
        if(stuList.size() == 1){
            stuList.get(0).setScore(score);
        }else if(stuList.size() ==0){
            System.out.println(object+"未找到学员无法设置分数");
        }else {
            System.out.println(object+"找到大于一人，无法设置分数");
        }
    }

    public static float getAvgScore(){
        float avgScore = 0;
        float sumScore = 0;
        Set<HashMap.Entry<Long,Student>> entrySet = stuHashMap.entrySet();
        for(HashMap.Entry<Long,Student> entry:entrySet){
            Long k = entry.getKey();
            Student v = entry.getValue();
            sumScore+=v.getScore();
        }
        avgScore = sumScore/stuHashMap.size();
        return avgScore;
    }

    public static void getHighScore(){
        float highScore = 0;
        String highName = "";
        Set<Map.Entry<Long, Student>> entries = stuHashMap.entrySet();
        for(HashMap.Entry<Long,Student> entry:entries){
            Long k = entry.getKey();
            Student v = entry.getValue();
            if(v.getScore()>highScore){
                highScore= v.getScore();
                highName = v.getName();
            }
        }
        System.out.println("成绩最好的学员是"+highName+"成绩是："+highScore);
    }

    public static void main(String[] args) {
        StuDB.addStu("yy1",15010000001L);
        StuDB.addStu("ll1",15010000002L);
        StuDB.addStu("ww1",15010000003L);
        System.out.println(StuDB.stuHashMap.size());
        StuDB.setStuScore(15010000001L,90f);
        StuDB.setStuScore("ll1",99.5f);
        StuDB.setStuScore(15010000003L,88f);
//        System.out.println(StuDB.selectStu("yy1").get(0).getScore());
//        System.out.println(StuDB.selectStu("ll1").get(0).getScore());
//        System.out.println(StuDB.selectStu("ww1").get(0).getScore());
        System.out.println(StuDB.getAvgScore());
        StuDB.getHighScore();
    }
}

