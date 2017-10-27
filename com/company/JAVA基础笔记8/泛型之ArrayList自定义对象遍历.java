package com.company.JAVA基础笔记8;

import java.util.ArrayList;

public class 泛型之ArrayList自定义对象遍历 {
    public static void main(String[] args) {
        Student s1 = new Student("mike", 20);
        Student s2 = new Student("lycy", 22);
        Student s3 = new Student("pato", 30);
        //ArrayList<Student> student = new ArrayList<Student>();//原始写法
        ArrayList<Student> student = new ArrayList<>();//JDK7新特性：泛型推断，根据前面的推断
        student.add(s1);
        student.add(s2);
        student.add(s3);
        for (int x = 0; x < student.size(); x++) {
            System.out.println(student.get(x));
        }
    }
}
