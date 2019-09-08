package com.data_structures.stack;

/**
 * @author wu
 * @date 2019/9/8 18:03
 */
public class StackMain {
	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<>();

		for (int i = 0; i < 5; i++) {
			stack.push(i);
			System.out.println(stack);
		}
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
	}
}
