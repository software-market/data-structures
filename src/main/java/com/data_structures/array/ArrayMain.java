package com.data_structures.array;

/**
 * @author wu
 * @date 2019/3/31 18:31
 */
public class ArrayMain {
	public static void main(String[] args) {
		Array array = new Array();
		array.addLast(3);
		array.addFirst(1);
		array.addLast(4);
		array.addLast(5);
		System.out.println(array.toString());
		array.add(1, 2);
		System.out.println(array.toString());
		array.add(6, 7);
		System.out.println(array.toString());
		array.add(9, 10);
		System.out.println(array.toString());
		try {
			array.add(9, 10);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(array.toString());
	}
}
