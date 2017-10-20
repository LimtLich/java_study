package com.company.JAVA基础笔记5;

public class StringBuffer判断字符串是否对称 {
    public static void main(String[] args) {
        String s = "abDba";
        String s2 = "abc";
        String s3 = "cac";
        System.out.println(checkString(s));

        System.out.println("灵性！"+isSame(s));

        System.out.println(checkString(s2));

        System.out.println("灵性！"+isSame(s2));

        System.out.println(checkString(s3));

        System.out.println("灵性！"+isSame(s3));

    }

    //无灵性之做法
    public static boolean checkString(String s) {
//        for (int num = 0; num < s.length() / 2; num++) {
//            if (s.charAt(num) != s.charAt(s.length() - num - 1)) {
//                return false;
//            }
//        }
//        return true;
        boolean flag = true;
        char[] ch = s.toCharArray();
        for (int start = 0, end = ch.length - 1; start < end; start++, end--) {
            if (ch[start] != ch[end]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    //灵性做法之:使用StringBuffer反转功能比较即可
    public static boolean isSame(String s){
        //注！！！：字符串引用类型比对时不可直接使用 == ，引用类型的 == 默认比对的是地址值，equals是对值进行比对
        return new StringBuffer(s).reverse().toString().equals(s);
    }

}
