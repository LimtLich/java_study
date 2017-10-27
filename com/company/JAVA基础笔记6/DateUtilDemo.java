package com.company.JAVA基础笔记6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期操作
 *
 * @author mingtao.li
 * @version v1.0
 */

public class DateUtilDemo {
    private DateUtilDemo() {
    }

    /**
     * @param date 需要被解析的字符串
     * @param pattern 解析格式
     * @return 返回已完成解析的日期结构数据
     * */
    public static Date stringToDate(String date,String pattern) throws ParseException {
        return new SimpleDateFormat(pattern).parse(date);
    }

    /**
     * @param date 需要被格式化的日期
     * @param pattern 格式化模式
     * @return 返回已完成格式化的日期字符串
     * */

    public static String dateToString(Date date,String pattern){
        return new SimpleDateFormat(pattern).format(date);
    }
}
