package com.company.JAVA基础笔记2;

class phone{
    //私有方法，子类无法继承！
    private void show(){
        System.out.println("showing");
    }
    public void call(String name){
        System.out.println("make a call to:"+name+"!");
    }
}

class newPhone extends phone{
    /*
     子类重写父类方法时，访问权限不能更低，最好声明一致
     void call(String name){
      访问权限过低，报错
     }
    */
    public void call(String name){
        //重写之后通过super访问父类功能/方法
        super.call("Mike");
        System.out.println(name+" "+"is listening the redio~~~");
    }
}

public class 继承之方法重写 {
    public static void main(String[] args){
        newPhone s = new newPhone();
        s.call("Susan");
        //无法访问父类的私有方法！
        //s.show();
    }
}
