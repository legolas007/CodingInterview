package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 可以替换大部分空白字符， 不限于空格
\s 可以匹配空格、制表符、换页符等空白字符的其中任意一个
 */
public class Solution5 {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s","%20");
    }
}
