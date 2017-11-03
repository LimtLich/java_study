package com.company.JAVA基础笔记9;

import java.util.TreeSet;

public class TreeSet存储自定义对象并遍历 {
    public static void main(String[] args) {
        Student s1 = new Student("jhonson", 19);
        Student s2 = new Student("boomer", 19);
        Student s3 = new Student("jhon", 29);
        Student s4 = new Student("lucy", 23);
        Student s5 = new Student("lucy", 23);
        Student s6 = new Student("jhonson", 15);
        //类需实现接口Comparable
        TreeSet<Student> t = new TreeSet<Student>();
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);
        t.add(s5);
        t.add(s6);

        for (Student s : t) {
            System.out.println(s);
        }
    }
}
