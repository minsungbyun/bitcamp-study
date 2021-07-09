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
public class App1_2 {

  public static void main(String[] args) {
    System.out.println("[회원]");
    // 2단계 : 3명의 회원 정보에 대해 배열로 선언한다.

    // 1. 길이가 3인 배열 선언(3명이니까)
    int[] no = new int[3];
    String[] name = new String[3];
    String[] email = new String[3];
    String[] password = new String[3];
    String[] photo = new String[3];
    String[] tel = new String[3];
    Date[] registerdDate = new Date[3];

    // 2. 배열의 index 지정
    Scanner keyboardScan = new Scanner(System.in);

    System.out.print("번호? ");
    no[0] = Integer.parseInt(keyboardScan.nextLine());
    System.out.print("이름? ");
    name[0] = keyboardScan.nextLine();
    System.out.print("이메일? ");
    email[0] = keyboardScan.nextLine();
    System.out.print("암호? ");
    password[0] = keyboardScan.nextLine();
    System.out.print("사진? ");
    photo[0] = keyboardScan.nextLine();
    System.out.print("전화? ");
    tel[0] = keyboardScan.nextLine();
    registerdDate[0] = new Date();
    System.out.println();

    System.out.print("번호? ");
    no[1] = Integer.parseInt(keyboardScan.nextLine());
    System.out.print("이름? ");
    name[1] = keyboardScan.nextLine();
    System.out.print("이메일? ");
    email[1] = keyboardScan.nextLine();
    System.out.print("암호? ");
    password[1] = keyboardScan.nextLine();
    System.out.print("사진? ");
    photo[1] = keyboardScan.nextLine();
    System.out.print("전화? ");
    tel[1] = keyboardScan.nextLine();
    registerdDate[1] = new Date();
    System.out.println();


    System.out.print("번호? ");
    no[2] = Integer.parseInt(keyboardScan.nextLine());
    System.out.print("이름? ");
    name[2] = keyboardScan.nextLine();
    System.out.print("이메일? ");
    email[2] = keyboardScan.nextLine();
    System.out.print("암호? ");
    password[2] = keyboardScan.nextLine();
    System.out.print("사진? ");
    photo[2] = keyboardScan.nextLine();
    System.out.print("전화? ");
    tel[2] = keyboardScan.nextLine();
    registerdDate[2] = new Date();
    System.out.println();

    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    // 3. 3명 정보 출력 값 배열로 지정
    System.out.println("--------------------------------");

    System.out.println("번호: " + no[0]);
    System.out.println("이름: " + name[0]);
    System.out.println("이메일: " + email[0]);
    System.out.printf("암호: %s\n", password[0]);
    System.out.printf("사진: %s\n", photo[0]);
    System.out.printf("전화: %s\n", tel[0]);
    System.out.printf("가입일: %s\n", registerdDate[0]);

    System.out.println("번호: " + no[1]);
    System.out.println("이름: " + name[1]);
    System.out.println("이메일: " + email[1]);
    System.out.printf("암호: %s\n", password[1]);
    System.out.printf("사진: %s\n", photo[1]);
    System.out.printf("전화: %s\n", tel[1]);
    System.out.printf("가입일: %s\n", registerdDate[1]);


    System.out.println("번호: " + no[2]);
    System.out.println("이름: " + name[2]);
    System.out.println("이메일: " + email[2]);
    System.out.printf("암호: %s\n", password[2]);
    System.out.printf("사진: %s\n", photo[2]);
    System.out.printf("전화: %s\n", tel[2]);
    System.out.printf("가입일: %s\n", registerdDate[2]);

  }
}
