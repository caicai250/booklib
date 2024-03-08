/*
 *
 *
 * @author caic
 * @since 1.0
 */
package com.cct.qslib.util;

import net.sourceforge.pinyin4j.PinyinHelper;

/**
 * <p> 汉字转拼音公共方法
 *
 * @author caic
 * @Date 2024/2/23
 * @since 1.0
 */
public class PingYinUtil {


    /**
     * 提取每个汉字的首字母(大写)
     *
     * @param str 汉字
     * @return 拼音首字母
     */
    public static String getPinYinHeadChar(String str) {
        if (isNull(str)) {
            return "";
        }
        String convert = "";
        for (int j = 0; j < str.length(); j++) {
            char word = str.charAt(j);
            // 提取汉字的首字母
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinyinArray != null) {
                convert += pinyinArray[0].charAt(0);
            } else {
                convert += word;
            }
        }

        convert = string2AllTrim(convert);
        return convert.toLowerCase();
    }

    /*
     * 判断字符串是否为空
     */

    public static boolean isNull(Object strData) {
        if (strData == null || String.valueOf(strData).trim().equals("")) {
            return true;
        }
        return false;
    }

    /**
     * 去掉字符串包含的所有空格
     *
     * @param value
     * @return
     */
    public static String string2AllTrim(String value) {
        if (isNull(value)) {
            return "";
        }
        return value.trim().replace(" ", "");
    }
}
