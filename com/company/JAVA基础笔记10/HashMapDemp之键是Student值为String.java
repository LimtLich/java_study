package com.company.JAVA基础笔记10;

import com.company.JAVA基础笔记9.Student;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemp之键是Student值为String {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("mike", 20);
        Student s2 = new Student("jhonson", 18);
        Student s3 = new Student("sun", 20);
        Student s4 = new Student("sun", 20);
        //HashMap验证键唯一性底层依赖hashCode 和 equals，需在在实际类中重写这两个方法，以内部类成员变量进行比较
        hm.put(s1, "001");
        hm.put(s2, "002");
        hm.put(s3, "003");
        hm.put(s4, "004");

        Set<Student> key = hm.keySet();
        for (Student s : key) {
            String value = hm.get(s);
            System.out.println("value:" + value + "---" + "name:" + s.getName() + "---" + "age:" + s.getAge());
        }
    }
}
