package com.eomcs.pms.handler;

public class ArrayList implements List { // 각 클래스들의 공통점을 묶어서 새로은 클래스를 만든다.

  static final int MAX_LENGTH = 5;
  Object[] list = new Object[MAX_LENGTH];
  int size = 0;

  public void add(Object obj) {
    if (size == list.length) { // 배열이 꽉 찼다면 
      // 배열의 길이가 50% 증가된 새 배열을 만들고 주소를 바꾼다.
      Object[] arr = new Object[list.length + (list.length >> 1)]; 
      for (int i = 0; i < size; i++) {
        arr[i] = list[i];
      }
      list = arr; // boards에 저장된 옛날 배열 주소를 버리고 새 배열 주소를 저장한다.
    }
    this.list[this.size++] = obj;
  }

  public Object[] toArray() {
    Object[] arr = new Object[this.size]; // 배열에 저장된 값을 담을 정도의 크기를 가진 새 배열을 만든다.
    for (int i = 0; i < this.size; i++) { // 배열에 저장된 값을 새 배열에 복사한다.
      arr[i] = list[i];
    }
    return arr; // 새 배열을 리턴한다.
  }

  public boolean remove(Object obj) {
    int index = indexOf(obj);
    if (index == -1) {
      return false;
    }

    for (int i = index + 1; i < this.size; i++) {
      this.list[i - 1] = this.list[i];
    }
    this.list[--this.size] = null;

    return true;
  }

  private int indexOf(Object obj) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i] == obj) {
        return i;
      }
    }
    return -1;
  }



}
