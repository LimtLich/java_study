package com.company.JAVA基础笔记8;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ArrayList去除重复自定义对象 {
    public static void main(String[] args) {
        Person p1 = new Person("mike", 24);
        Person p2 = new Person("duke", 22);
        Person p3 = new Person("lisa", 18);

        ArrayList list = new ArrayList();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p2);
        list.add(p3);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p1);

        ArrayList newList = new ArrayList();
        for (int x = 0; x < list.size(); x++) {
            //contains底层由equals实现，自定义类中默认equals比对的是地址值，所以需要在类中重写equals方法才可以对自定义类进行比对
            if (!newList.contains(list.get(x))) {
                newList.add(list.get(x));

            }
        }
        System.out.println(newList);
    }
}
