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
		return Arrays.toString(data);
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
			throw new IllegalArgumentException("Add failed. Array is full");
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
}
