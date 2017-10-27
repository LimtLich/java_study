package com.company.JAVA基础笔记8;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ArrayList的使用 {
    public static void main(String[] args) {
        //遍历字符串
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        for (int x = 0; x < arrayList.size(); x++) {
            System.out.println(arrayList.get(x));
        }

        //遍历自定义对象
        System.out.println("------------------");
        Student s1 = new Student("mike", 12);
        Student s2 = new Student("lucy", 18);
        Student s3 = new Student("france", 20);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(s1);
        arrayList1.add(s2);
        arrayList1.add(s3);

        for (int x = 0; x < arrayList1.size(); x++) {
            Student s = (Student) arrayList1.get(x);
            System.out.println(s.getName() + "------------" + s.getAge());
        }
    }
}
