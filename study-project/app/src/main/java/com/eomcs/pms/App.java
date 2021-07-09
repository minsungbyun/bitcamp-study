package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

// 1) 배열 사용 전
// 2) 배열 사용 후
// 3) 반복문 적용 : while문
// 4) 반복문 적용 : for문
// 5) 여러 문장에서 반복적으로
// 6) 조회용으로만 사용할 변수라면 상수로 선언한다.
// 7) 특정 조건에 따라 반복을 멈춘다.
// 8) 날짜의 출력형식을 "yyyy-MM-dd"로 변경한다.
public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");
    // 7단계 : 인원수에 맞게 출력하고 싶다.

    final int MAX_SIZE = 3; // 중복되는 수를 상수로 뺀다.
    int size = 0; // 기본 0명

    int[] no = new int[MAX_SIZE];
    String[] name = new String[MAX_SIZE];
    String[] email = new String[MAX_SIZE];
    String[] password = new String[MAX_SIZE];
    String[] photo = new String[MAX_SIZE];
    String[] tel = new String[MAX_SIZE];
    Date[] registerdDate = new Date[MAX_SIZE];

    Scanner keyboardScan = new Scanner(System.in);

    for (int i = 0; i < MAX_SIZE; i = i + 1) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());
      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();
      System.out.print("이메일? ");
      email[i] = keyboardScan.nextLine();
      System.out.print("암호? ");
      password[i] = keyboardScan.nextLine();
      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();
      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();
      registerdDate[i] = new Date();
      size = size + 1; // 1명이 입력 완료하였다.
      System.out.println();

      System.out.println("계속 입력하시겠습니까? (y/N)");
      String input = keyboardScan.nextLine();
      if (input.equals("N") || input.equals("")) {
        break;
      }
    }

    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    System.out.println("--------------------------------");
    // 인원수에 맞게 출력하도록 설정한다.
    for (int i = 0; i < size; i = i + 1) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %tY-%7$tm-%7$td\n",
          no[i],
          name[i],
          email[i],
          password[i],
          photo[i],
          tel[i],
          registerdDate[i]);
    }

  }
}
