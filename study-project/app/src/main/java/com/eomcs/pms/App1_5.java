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
public class App1_5 {

  public static void main(String[] args) {
    System.out.println("[회원]");
    // 6단계 : 상수선언하기

    final int MAX_SIZE = 3; // 중복되는 수를 상수로 뺀다.

    int[] no = new int[MAX_SIZE];
    String[] name = new String[MAX_SIZE];
    String[] email = new String[MAX_SIZE];
    String[] password = new String[MAX_SIZE];
    String[] photo = new String[MAX_SIZE];
    String[] tel = new String[MAX_SIZE];
    Date[] registerdDate = new Date[MAX_SIZE];




    // 1. for문으로 3번 반복할 것을 1번으로 줄이자.
    Scanner keyboardScan = new Scanner(System.in);
    String input = "";


    // index 역할을 할 변수 선언 -> 3번 반복
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
      System.out.println();

      System.out.println("계속 입력하시겠습니까? (y/N)");
      input = keyboardScan.nextLine();
      if (input.equals("N") || input.equals("")) {
        break;
      }
    }

    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    System.out.println("--------------------------------");
    for (int i = 0; i < MAX_SIZE; i = i + 1) {
      System.out.println("번호: " + no[i]);
      System.out.println("이름: " + name[i]);
      System.out.println("이메일: " + email[i]);
      System.out.printf("암호: %s\n", password[i]);
      System.out.printf("사진: %s\n", photo[i]);
      System.out.printf("전화: %s\n", tel[i]);
      System.out.printf("가입일: %s\n", registerdDate[i]);
    }

  }
}
