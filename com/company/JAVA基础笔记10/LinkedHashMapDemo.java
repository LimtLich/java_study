package com.company.JAVA基础笔记10;

/*
* LinkedHashMap：是Map接口的哈希表和链接列表实现，具有可预知的迭代顺序
*       由哈希表保证键的唯一性
*       有键表保证键的有序性（存储和去除的顺序一致）
* */

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lh = new LinkedHashMap<>();

        lh.put("123", "luo");
        lh.put("456", "huo");
        lh.put("789", "duo");
        lh.put("789", "duo");

        Set<String> key = lh.keySet();

        for (String s : key) {
            String value = lh.get(s);
            System.out.println("key:" + s + "-----" + "value:" + value);
        }
    }
}
