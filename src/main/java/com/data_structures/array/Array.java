package com.data_structures.array;

import java.util.Arrays;

/**
 * @author wu
 * @date 2019/3/31 18:31
 */
public class Array {
	private int[] data;
	private int size;

	public Array() {
		this(10);
	}

	public Array(int capacity) {
		data = new int[capacity];
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return data.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("Array: size = %d  capacity = %d\n", size, data.length));
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(data[i]);
			if (i + 1 == size)
				return sb.append("]").toString();
			sb.append(", ");
		}
		return null;
	}

	// 增、删、改、查
	public void addLast(int e) {
		add(size, e);
	}

	public void addFirst(int e) {
		add(0, e);
	}

	public void add(int index, int e) {
		if (index < 0 || index >= data.length)
			throw new IllegalArgumentException("Add failed. index < 0 || index >= data.length");
		if (size == data.length)
			throw new IllegalArgumentException("Add failed. Array is full");
		int temp = size;
		if (size <= index)
			while (size != index) {
				data[size] = 0;
				size++;
				temp = size;
			}
		else
			while (temp != index) {
				data[temp] = data[temp - 1];
				temp--;
			}
		data[temp] = e;
		size++;
	}

	public int get(int index) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Get failed. Index is illegal.");
		return data[index];
	}

	public void set(int index, int e) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Get failed. Index is illegal.");
		data[index] = e;
	}

	public boolean contains(int e) {
		for (int i = 0; i < size; i++) {
			if (data[i] == e)
				return true;
		}
		return false;
	}

	public int firstIndexOf(int e) {
		for (int i = 0; i < size; i++) {
			if (data[i] == e)
				return i;
		}
		return -1;
	}

	public void remove(int index) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Remove failed. Index is illegal.");

		while (index + 1 != size) {
			data[index] = data[index + 1];
			index++;
		}
		data[index] = 0;
		size--;
	}
}
