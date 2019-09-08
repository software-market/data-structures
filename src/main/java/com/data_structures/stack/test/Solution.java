package com.data_structures.stack.test;

import java.util.Stack;

/**
 * @author wu
 * @date 2019/9/8 18:34
 */
public class Solution {

	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '[' || c == '{')
				stack.push(c);
			else {
				if (stack.isEmpty())
					return false;
				char topChar = stack.pop();
				if(c == ')' && topChar != '(')
					return false;
				if(c == ']' && topChar != '[')
					return false;
				if(c == '}' && topChar != '{')
					return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args){
		System.out.println(isValid("(){{}}[][]"));
	}
}
