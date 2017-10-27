package com.company.JAVA基础笔记6;

class Person {
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + "，已终止");
        super.finalize();
    }

    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("name is:" + this.name + ",age is:" + this.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class System类之垃圾回收gc {
    public static void main(String[] args) {
        Person p = new Person("mike", 19);
        p.show();
        p = null;
        System.gc();
    }
}
