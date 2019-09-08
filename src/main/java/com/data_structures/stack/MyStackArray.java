package com.data_structures.stack;

/**
 * 增加getLast 和 getFirst
 *
 * @author wu
 * @date 2019/3/31 18:31
 */
public class MyStackArray<E> extends com.data_structures.array.Array<E> {

	public MyStackArray(int capacity) {
		super(capacity);
	}

	public MyStackArray() {
		super();
	}

	E getLast() {
		return get(getSize() - 1);
	}

	E getFirst() {
		return get(0);
	}
}
