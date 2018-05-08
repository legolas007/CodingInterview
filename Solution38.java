package com.usher.algorithm.offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 字符串全排列
 * 1、所有可能出现在第一个位置的字符，把第一个字符和后面所有的字符交换
 * 2、固定第一个字符，求后面所有字符的排列，
 * 把后面所有字符再分成两部分：
 * 后面字符的第一个字符，以及之后的所有字符，重复步骤1
 * 
 * @author usher
 *
 */
public class Solution38 {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> reStrings = new ArrayList<>();
		if (str != null && str.length() > 0) {
			PermutationHelper(str.toCharArray(), 0, reStrings);
			Collections.sort(reStrings);
		}
		return reStrings;
	}

	private static void PermutationHelper(char[] charArray, int i, ArrayList<String> reStrings) {

		// i号位置作为交换点，向后交换
		// 递归出口：只剩一个字符，即无法交换
		if (charArray.length - 1 == i) {
			reStrings.add(String.valueOf(charArray));
		} else {
			for (int j = i; j < charArray.length; ++j) {
				// 依次交换i与它后边的每一个字符
				if (j == i || charArray[j] != charArray[i]) {// 去重复值，除了i位置与自己交换的情况
					swap(charArray, i, j);
					PermutationHelper(charArray, i + 1, reStrings);// 对后面所有的字符进行全排列
					swap(charArray, i, j);// 再将之前交换的字符交换回来，以便第一个字符再与其他字符交换
				}
			}
		}

	}

	private static void swap(char[] cs, int i, int j) {
		char temp = cs[i];
		cs[i] = cs[j];
		cs[j] = temp;
	}

}
