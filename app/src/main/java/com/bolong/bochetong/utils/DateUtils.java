package com.bolong.bochetong.utils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2017/4/14.
 */

public class DateUtils {
    private static SimpleDateFormat sf = null;
    /*获取系统时间 格式为："yyyy/MM/dd "*/

    public String getCurrentDate() {
        Date d = new Date();
        sf = new SimpleDateFormat("yyyy年MM月dd日");
        return sf.format(d);
    }

            /*时间戳转换成字符窜*/

    /*public static String getDateToString(long time) {
        Date d = new Date(time);
        sf = new SimpleDateFormat("yyyy-MM-dd-h:mm");
        return sf.format(d);
    }*/
    public static String getDateToString(long time) {
        Date d = new Date(time);
        sf = new SimpleDateFormat("yyyy.MM.dd h:mm");
        return sf.format(d);
    }

    public static String getDateToString2(long time) {
        Date d = new Date(time);
        sf = new SimpleDateFormat("yyyy.MM.dd hh:mm");
        return sf.format(d);
    }

    /*将字符串转为时间戳*/

    public static long getStringToDate(String time) {
        sf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        try {
            date = sf.parse(time);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date.getTime();
    }

    public static long getStringToDate2(String time) {
        sf = new SimpleDateFormat("yyyy.MM.dd hh:mm");
        Date date = new Date();
        try {
            date = sf.parse(time);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date.getTime();
    }



}
