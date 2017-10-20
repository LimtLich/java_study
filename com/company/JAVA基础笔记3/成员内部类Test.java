package com.company.JAVA基础笔记3;

class outer1{
    public int num = 10;
    class inner{
        public int num =  20;
        public void show(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);//this表示当前类
            //System.out.println(new outer1().num);
            System.out.println(outer1.this.num);//通过外部类名限定this对象
        }
    }
}

public class 成员内部类Test {
    public static void main(String[] args){
        outer1.inner oi  = new outer1().new inner();
        oi.show();
    }
}
