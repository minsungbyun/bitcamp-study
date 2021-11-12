package com.eomcs.algorithm.data_structure.array;

import java.util.Arrays;

public class MinArrayList<E> {

  private static final int MAX_LENGTH = 10;
  private Object[] elementData;
  private int size;


  public MinArrayList(int init) {
    if (init < MAX_LENGTH) {
      elementData = new Object[MAX_LENGTH];
    } else {
      elementData = new Object[init];
    }
  }

  public MinArrayList() {
    elementData = new Object[MAX_LENGTH];
  }

  public boolean add(E e) {
    if (size == elementData.length) { // 사이즈가 꽉 찼을 떄
      glow();
    }
    elementData[size++] = e;
    return true;
  }

  public void add(int index, E element) {
    if (size == elementData.length) {
      glow();
    }

    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

  private void glow() {
    System.out.println("오호라 배열을 늘리자.");
    int newEle = elementData.length + (elementData.length >> 1);
    elementData = Arrays.copyOf(elementData, newEle);


    //    Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
    //    for (int i = 0; i < elementData.length; i++) {
    //      newArray[i] = elementData[i];
    //    }
    //    elementData = newArray;
  }


  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return (E) elementData[index];
  }


  @SuppressWarnings("unchecked")
  public E set(int index, Object element) {
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object prevElement = elementData[index];
    elementData[index] = element;

    return (E) prevElement;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementData[index];

    System.arraycopy(elementData, index + 1, elementData, index, this.size - (index + 1));

    //    for (int i = index; i < size - 1; i++) {
    //      elementData[i] = elementData[i + 1];
    //    }
    size--;
    elementData[size] = null;
    return (E) old;
  }

  public int size() {
    return this.size;
  }

  public Object[] toArray() {

    Object[] arr = Arrays.copyOf(elementData, this.size);

    //    Object[] arr = new Object[this.size];
    //    for (int i = 0; i < arr.length; i++) {
    //      arr[i] = elementData[i];
    //    }
    //    return arr;

    return arr;
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.elementData, this.size, arr.getClass());
    }
    System.arraycopy(this.elementData, 0, arr, 0, this.size);
    return arr;
  }

}
