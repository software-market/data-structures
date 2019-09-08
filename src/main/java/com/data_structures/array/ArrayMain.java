package com.data_structures.array;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wu
 * @date 2019/3/31 18:31
 */
public class ArrayMain {
	public static void main(String[] args) {
		Array<Integer> array = new Array<>();
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
		System.out.println(array.get(0));
		array.set(0, 111);
		System.out.println(array.get(0));

		System.out.println(array.contains(10));
		System.out.println(array.firstIndexOf(10));

		array.remove(9);
		System.out.println(array);
		array.set(0, 1);
		System.out.println(array);
		array.set(5, 6);
		array.remove(0);
		System.out.println(array);

//		List<Integer> list = new ArrayList<>();
//
//		list.add(10,123);
//		System.out.println(list.size());// ex
	}
}
