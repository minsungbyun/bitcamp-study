package com.eomcs.pms.menu;

import com.eomcs.util.Prompt;

public class MenuGroup extends Menu {

  public static int MAX_LENGTH = 100;
  Menu[] childs = new Menu[MAX_LENGTH];
  int size;
  boolean disablePrevMenu;
  String prevMenuTitle = "이전 메뉴";


  public MenuGroup(String title) { 
    this(title, false);
  }

  public MenuGroup(String title, boolean disalbePrevMenu) {
    // 생성자 오버로딩을 통한 선택권 부여
    super(title);
    this.disablePrevMenu = disalbePrevMenu;
  }


  public void setPrevMenuTitle(String prevMenuTitle) {
    this.prevMenuTitle = prevMenuTitle;
  }

  public void add(Menu child) {
    if (size == childs.length) { // 배열이 꽉 찬다면?
      return; // 종료
    }
    childs[size++] = child; // 자리 있으면 채운다.
  }

  public Menu remove(Menu child) {

    int index = indexOf(child);

    if (index == -1) {
      return null;
    }

    for (int i = index + 1; i < size; i++) {
      childs[i - 1] = childs[i];
    }
    childs[--size] = null;

    return child;
  }

  public Menu getMenu(String title) {
    for (int i = 0; i < size; i++) {
      if (childs[i].title == title) {
        return childs[i];
      }
    }
    return null;
  }

  public int indexOf(Menu child) {
    // 배열 돌면서 해당하는 인덱스 찾는다.
    for (int i = 0; i < size; i++) {
      if (childs[i] == child) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public void execute() {

    while (true) {
      System.out.printf("\n[%s]\n", this.title);

      for (int i = 0; i < this.size; i++) {
        System.out.printf("%d. %s\n", i + 1, this.childs[i].title);
      }

      if (!disablePrevMenu) {
        System.out.printf("0. %d\n",this.prevMenuTitle);

      }

      int menuNo = Prompt.inputInt("선택> ");

      if (menuNo == 0 && !disablePrevMenu) {
        return;
      }

      if (menuNo < 0 || menuNo > this.size) {
        System.out.println("다시 입력해주세요");
        continue;
      }

      this.childs[menuNo - 1].execute();
    }



  }

}
