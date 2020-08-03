package com.usts.algorithm;


import org.junit.Test;

/**
 * @author Miao Li
 * @data 2020-07-07
 * @description: 反转字符串中的单词|||
 *
 */

public class Solution557 {

    @Test
    public void reverseWords() {
        String myString="abcd";

        char myChar[]=myString.toCharArray();

        System.out.println("myChar[1]="+myChar[1]);
        String s= "Let's take LeetCode contest";
        String[] strs=s.split(" ");
        StringBuffer StringBuffer=new StringBuffer();
        for(int i=0;i<strs.length;i++){
            StringBuffer.append(new StringBuffer(strs[i]).reverse().toString());
            StringBuffer.append(" ");
        }
        System.out.println(StringBuffer.toString().trim());
//        return StringBuffer.toString().trim();
    }


}
