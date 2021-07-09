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
public class App1_3 {

  public static void main(String[] args) {
    System.out.println("[회원]");
    // 3단계 : while문 사용해서 반복을 줄이자.


    int[] no = new int[3];
    String[] name = new String[3];
    String[] email = new String[3];
    String[] password = new String[3];
    String[] photo = new String[3];
    String[] tel = new String[3];
    Date[] registerdDate = new Date[3];



    // 1. while문으로 3번 반복할 것을 1번으로 줄이자.
    Scanner keyboardScan = new Scanner(System.in);

    // index 역할을 할 변수 선언 -> 3번 반복
    int i = 0;
    while (i < 3) {
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

      i = i + 1; // while 반복을 위한 증가식
    }

    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    // 3. 3명 정보 출력 값 배열로 지정
    System.out.println("--------------------------------");
    i = 0; // 변수 초기화
    while (i < 3) {
      System.out.println("번호: " + no[i]);
      System.out.println("이름: " + name[i]);
      System.out.println("이메일: " + email[i]);
      System.out.printf("암호: %s\n", password[i]);
      System.out.printf("사진: %s\n", photo[i]);
      System.out.printf("전화: %s\n", tel[i]);
      System.out.printf("가입일: %s\n", registerdDate[i]);

      i = i + 1;
    }

  }
}
