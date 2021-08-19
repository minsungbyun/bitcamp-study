package com.eomcs.pms.handler;

public abstract class AbstractList implements List {

  protected int size; // 같은 패키지 및 상속받은 서브 클래스에서 접근 가능

  @Override
  public int size() {
    return this.size;
  }


}
