package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2_1 {

  public static void main(String[] args) {
    System.out.println("[프로젝트]");

    // 입력받을 배열을 선언한다.
    // 번호, 프로젝트명, 내용, 시작일 ,종료일, 만든이, 팀원

    // 배열의 총 길이를 고정시킨다.
    final int MAX_INPUT = 10;

    // 배열 선언
    int[] no = new int[MAX_INPUT];
    String[] title = new String[MAX_INPUT];
    String[] content = new String[MAX_INPUT];
    Date[] startDate = new Date[MAX_INPUT];
    Date[] endDate = new Date[MAX_INPUT];
    String[] owner = new String[MAX_INPUT];
    String[] members = new String[MAX_INPUT];

    // Scanner로 입력 받기
    Scanner keyboardScan = new Scanner(System.in);

    int size = 0;

    for (int i=0; i<MAX_INPUT; i=i+1) {

      System.out.print("번호? ");
      no[i] = keyboardScan.nextInt();
      keyboardScan.nextLine(); // 번호 뒤에 남아 있는 줄바꿈 코드를 제거한다.

      System.out.print("프로젝트명? ");
      title[i] = keyboardScan.nextLine();

      System.out.print("내용? ");
      content[i] = keyboardScan.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyboardScan.nextLine());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboardScan.nextLine());

      System.out.print("만든이? ");
      owner[i] = keyboardScan.nextLine();

      System.out.print("팀원? ");
      members[i] = keyboardScan.nextLine();

      size = size + 1;

      System.out.println("계속 입력하시겠습니까? (y/N)");
      String input = keyboardScan.nextLine();
      if (input.equalsIgnoreCase("N") || input.equals("")) {
        break;
      }


      keyboardScan.close();
    }


    System.out.println("--------------------------------");

    for (int i=0; i<size; i=i+1) {
      System.out.printf("번호: %d\n", no[i]);
      System.out.printf("프로젝트명: %s\n", title[i]);
      System.out.printf("내용: %s\n", content[i]);
      System.out.printf("시작일: %s\n", startDate[i]);
      System.out.printf("종료일: %s\n", endDate[i]);
      System.out.printf("만든이: %s\n", owner[i]);
      System.out.printf("팀원: %s\n", members[i]);

    }

  }
}
