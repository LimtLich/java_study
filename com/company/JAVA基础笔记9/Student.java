package com.company.JAVA基础笔记9;

//实现自然排序接口Comparable
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    //重写hashCode和equals，使得HashSet可以去除重复元素
    @Override
    public int hashCode() {
        //定义整数相乘用于区分值
        final int prime = 31;
        int result = 1;
        //如果是基本类型，就直接加值
        result = prime * result + age;
        //如果是引用类型，就加哈希值
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    //重写hashCode和equals，使得HashSet可以去除重复元素
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


    @Override
    public int compareTo(Student o) {
        //对比规则
        //按照年龄排序，主要条件
        int num = this.age - o.age;
        //加入姓名长度排序
        int nameLength = this.name.length() - o.name.length();
        int numx = nameLength == 0 ? num : nameLength;
        //如果年龄相同，再比较姓名
        //年龄和姓名相同即为同一个元素
        int num2 = num == 0 ? this.name.compareTo(o.name) : numx;
        return num2;
    }

}
