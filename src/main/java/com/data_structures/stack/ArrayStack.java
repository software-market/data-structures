package com.data_structures.stack;


/**
 * @author wu
 * @date 2019/9/8 17:47
 */
public class ArrayStack<E> implements Stack<E> {
	MyStackArray<E> array;

	public ArrayStack(int capacity) {
		array = new MyStackArray<>(capacity);
	}

	public ArrayStack() {
		array = new MyStackArray<>();
	}


	@Override
	public int getSize() {
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	public int getCapacity() {
		return array.getCapacity();
	}

	@Override
	public void push(E e) {
		array.addLast(e);
	}

	@Override
	public E pop() {
		return array.removeLast();
	}

	@Override
	public E peek() {
		return array.getLast();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Stack:[");
		for (int i = 0; i < array.getSize(); i++) {
			sb.append(array.get(i)).append("，");
		}
		if (array.getSize() != 0) {
			sb.setLength(sb.length() - 1);
		}
		sb.append("] top");
		return sb.toString();
	}
}
