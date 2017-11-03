package com.company.JAVA基础笔记4;

class MathTools {
    //int数组拼接成字符串(性能较差，后续通过StringBuffer改善)
    public static String arrayToString(int[] arr) {
        String result = "";
        result += "[";
        for (int num = 0; num < arr.length; num++) {
            if (num == arr.length - 1) {
                result += arr[num] + "]";
            } else {
                result += arr[num] + ",";
            }
        }
        return result;
    }

    //字符串反转A
    public static String reverse1(String str) {
        String newStr = "";
        for (int num = 0; num < str.length(); num++) {
            newStr += str.charAt(str.length() - num - 1);
        }
        return newStr;
    }

    //字符串反转B
    public static String reverse2(String str) {
        String newStr = "";
        char[] ch = str.toCharArray();
        for (int num = ch.length - 1; num >= 0; num--) {
            newStr += ch[num];
        }
        return newStr;
    }

    //在大串中查找小串出现的次数A
    public static int getCount(String target, String world) {
        int count = 0;
        while (target.indexOf(world) != -1) {
            count++;
            target = target.substring(target.indexOf(world) + world.length());
        }
        return count;
    }

    //在大串中查找小串出现的次数B
//    public static int getCount2(String target, String world) {
//        int count = 0;
//        int index = target.indexOf(world);
//        while(index!=-1){
//            count++;
//            target = target.substring(index+world.length());
//            index = target.indexOf(world);
//        }
//        return count;
//    }
}

public class String类练习 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println(MathTools.arrayToString(arr));
        System.out.println(MathTools.arrayToString(arr2));
        System.out.println("---------------------------------");
        String a = "ABN";
        String b = "!OGNIM";
        System.out.println(MathTools.reverse1(a));
        System.out.println(MathTools.reverse2(b));
        System.out.println("---------------------------------");
        String s1 = "abcJAVAcbaJAVAaaaJAVA";
        String s2 = "afadfadfanbasasfafnbaasdasfnbaasdasdasdnbanbanbaqeqerqernba";
        System.out.println(MathTools.getCount(s1, "JAVA"));
        System.out.println(MathTools.getCount(s2,"nba"));
    }
}
