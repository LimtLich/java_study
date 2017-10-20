package com.company.JAVA基础笔记3;

/*
* public int hashCode():返回該對象的哈希碼值
*       注：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值，可以理解为地址值。
* public final Class getClass():返回此Object的运行时类
*       Class类的方法：
*           public String getName()：以String的形式返回此Class对象所表示的实体（类、接口、数组类、基本类型或void）名称
* public boolean equals(Object boj){}:默认情况下比较地址值
*           重写：一般都是用来比较对象的成员变量值是否相同
* */

//实现Cloneable接口，才可以使用Object.clone()
class ObjectTester implements Cloneable{
    private String name;
    private int age;

    public ObjectTester(){

    }

    public ObjectTester(String name,int age){
        this.name = name;
        this.age = age;
    }

    //重写toString
    @Override
    public String toString() {
        return "ObjectTester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //重写equals
    @Override
    public boolean equals(Object o) {
        //提高效率，若是与自身比较，则无需继续下行
        if (this == o) return true;
        //判断o是否为目标类的对象，如果是则执行向下转型，如果不是则返回false
        if (o == null || getClass() != o.getClass()) return false;
        //判断该对象名是否是该类的一个对象
        if(o instanceof ObjectTester)return false;
        //使用的是ObjectTester的特有变量，所以要多态向下转型，访问子类具体成员变量
        ObjectTester that = (ObjectTester) o;
        //比较对象的成员变量
        if (age != that.age) return false;
        //name是Sting类型的，而String是引用类型的，所以，在这里不能直接用==比较，应该用equals（）作比较
        //String的equals（）方法是重写自Object类的，比较的是字符串的内容是否相同
        return name != null ? name.equals(that.name) : that.name == null;
    }
    //重写clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

public class Object类方法 {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectTester o = new ObjectTester();
        System.out.println("hash 1:"+o.hashCode());
        ObjectTester b = new ObjectTester();
        System.out.println("hash 2:"+b.hashCode());
        ObjectTester j = o;
        System.out.println("hash 3:"+j.hashCode());
        System.out.println("-----------------------------");
        ObjectTester e = new ObjectTester();
        String c = e.getClass().getName();
        System.out.println(c);//erro:此类已重命名
        System.out.println("-----------------------------");
        ObjectTester f = new ObjectTester("Jordan",29);
        System.out.println(f.toString());
        System.out.println("-----------------------------");
        ObjectTester s1 = new ObjectTester("Jordan",29);
        ObjectTester s2 = new ObjectTester("Jordan",29);
        ObjectTester s3 = new ObjectTester("Kobe",24);
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("-----------------------------");
        Object p = s3.clone();
        ObjectTester s4 = (ObjectTester)p;
        System.out.println(s4.toString());
    }
}
