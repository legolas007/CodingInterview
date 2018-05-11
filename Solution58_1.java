package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * “student. a am I”
 * “I am a student.”
 */
public class Solution58_1 {
    public String ReverseSentence(String str) {
         StringBuffer sb = new StringBuffer("");
        if(str.length() <= 0 || str.trim().equals("")){
//要trim()，可能输入多个空格组成的字符串
            return str;
        }
        String[] strSet = str.split(" ");
        int length = strSet.length;
        for(int i = length-1; i > 0 ;i--){
            sb.append(strSet[i]+" ");
        }
        sb.append(strSet[0]);
        return sb.toString();
        //递归
        //return (str.lastIndexOf(" ")==-1)?str:str.substring(str.lastIndexOf(" ")+1) +" "+ReverseSentence(str.substring(0,str.lastIndexOf(" ")));
    }

}
