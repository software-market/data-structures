package com.data_structures.array;

/**
 * @author wu
 * @date 2019/3/31 18:31
 */
public class Array<E> {
	private E[] data;
	private int size;

	public Array() {
		this(10);
	}

	public Array(int capacity) {
		data = (E[]) new Object[capacity];
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
	public void addLast(E e) {
		add(size, e);
	}

	public void addFirst(E e) {
		add(0, e);
	}

	public void add(int index, E e) {
		if (index < 0 || index >= data.length)
			throw new IllegalArgumentException("Add failed. index < 0 || index >= data.length");
		if (size == data.length)
//			throw new IllegalArgumentException("Add failed. Array is full");
			resize(data.length * 2);
		int temp = size;
		if (size <= index)
			while (size != index) {
				data[size] = null;
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

	private void resize(int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		System.arraycopy(data, 0, newData, 0, data.length);
		data = newData;

	}

	public E get(int index) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Get failed. Index is illegal.");
		return data[index];
	}

	public void set(int index, E e) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Get failed. Index is illegal.");
		data[index] = e;
	}

	public boolean contains(E e) {
		for (int i = 0; i < size; i++) {
			if (data[i] != null && data[i].equals(e))
				return true;
		}
		return false;
	}

	public int firstIndexOf(E e) {
		for (int i = 0; i < size; i++) {
			if (e != null && e.equals(data[i]))
				return i;
		}
		return -1;
	}

	public E remove(int index) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Remove failed. Index is illegal.");

		E res = data[index];
		for (int i = index + 1; i < size; i++) {
			data[i - 1] = data[i];
		}
		if (size == data.length / 4 && data.length / 2 != 0)
			resize(data.length / 2);

		size--;
		return res;
	}

	public E removeFirst() {
		return remove(0);
	}

	public E removeLast() {
		return remove(size);
	}

	public void removeElement(E e) {
		int index = firstIndexOf(e);
		if (index != -1)
			remove(index);
	}

}
