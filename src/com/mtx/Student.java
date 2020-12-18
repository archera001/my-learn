package com.mtx;

public class Student {



    public String name;
    public Long phone;
    public String sex;
    public String wx;
    public Long qq;
    public float score;

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Student(String name, Long phone){
        this.setName(name);
        this.setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public Long getQq() {
        return qq;
    }

    public void setQq(Long qq) {
        this.qq = qq;
    }

    public static void main(String[] args) {
        Student student1 = new Student("杨小一",15010000001L);
        System.out.println(student1.getName());
        System.out.println(student1.getPhone());
        student1.setName("杨小二");
        System.out.println(student1.getName());
    }
}
