package com.company.JAVA基础笔记10;

import com.company.JAVA基础笔记9.Student;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemp之键是String值未Student {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();

        Student s1 = new Student("mike", 20);
        Student s2 = new Student("jhonson", 18);
        Student s3 = new Student("sun", 20);

        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);

        Set<String> key = hm.keySet();

        for (String s : key) {
            Student value = hm.get(s);
            System.out.println("key:" + s + "---" + "name:" + value.getName() + "----" + "age:" + value.getAge());
        }
    }
}
