package com.company.JAVA基础笔记7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class CollectionDemo自定义对象遍历 {
    public static void main(String[] args) {
        //创建Student对象
        Student s1 = new Student("mike", 20);
        Student s2 = new Student("kate", 18);
        Student s3 = new Student("jason", 24);

        Collection c = new ArrayList();
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //非专用遍历
        /*Object[] ss = c.toArray();

        for (int x = 0; x < ss.length; x++) {
            Student s = (Student) ss[x];//向下转型
            System.out.println(s.getName() + "------------" + s.getAge());
        }*/

        //集合专用遍历
        Iterator i = c.iterator();
        while (i.hasNext()) {
            Student s = (Student) i.next();
            System.out.println((s.getName()) + "-------" + s.getAge());
            //System.out.println((((Student) i.next()).getName())+"------------"+((Student) i.next()).getAge());此类写法多次调用i.next（），因为每次使用都是访问一个对象
        }

    }
}
