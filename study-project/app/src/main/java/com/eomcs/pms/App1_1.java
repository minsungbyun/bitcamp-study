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
public class App1_1 {

  public static void main(String[] args) {
    System.out.println("[회원]");
    // 1단계 : 3명의 회원 정보를 입력받는다.
    // 1. 변수 선언 
    // 2. 3명 정보 입력
    // 3. 3명 정보 출력


    // 1. 변수선언 
    int no1, no2, no3;
    String name1, name2, name3;
    String email1, email2, email3;
    String password1, password2, password3;
    String photo1, photo2, photo3;
    String tel1, tel2, tel3;
    Date registerdDate1, registerdDate2, registerdDate3;


    // 2. 3명 정보 입력
    Scanner keyboardScan = new Scanner(System.in);

    System.out.print("번호? ");
    no1 = Integer.parseInt(keyboardScan.nextLine());
    System.out.print("이름? ");
    name1 = keyboardScan.nextLine();
    System.out.print("이메일? ");
    email1 = keyboardScan.nextLine();
    System.out.print("암호? ");
    password1 = keyboardScan.nextLine();
    System.out.print("사진? ");
    photo1 = keyboardScan.nextLine();
    System.out.print("전화? ");
    tel1 = keyboardScan.nextLine();
    registerdDate1 = new Date();
    System.out.println();

    System.out.print("번호? ");
    no2 = Integer.parseInt(keyboardScan.nextLine());
    System.out.print("이름? ");
    name2 = keyboardScan.nextLine();
    System.out.print("이메일? ");
    email2 = keyboardScan.nextLine();
    System.out.print("암호? ");
    password2 = keyboardScan.nextLine();
    System.out.print("사진? ");
    photo2 = keyboardScan.nextLine();
    System.out.print("전화? ");
    tel2 = keyboardScan.nextLine();
    registerdDate2 = new Date();
    System.out.println();


    System.out.print("번호? ");
    no3 = Integer.parseInt(keyboardScan.nextLine());
    System.out.print("이름? ");
    name3 = keyboardScan.nextLine();
    System.out.print("이메일? ");
    email3 = keyboardScan.nextLine();
    System.out.print("암호? ");
    password3 = keyboardScan.nextLine();
    System.out.print("사진? ");
    photo3 = keyboardScan.nextLine();
    System.out.print("전화? ");
    tel3 = keyboardScan.nextLine();
    registerdDate3 = new Date();
    System.out.println();



    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    // 3. 3명 정보 출력
    System.out.println("--------------------------------");

    System.out.println("번호: " + no1);
    System.out.println("이름: " + name1);
    System.out.println("이메일: " + email1);
    System.out.printf("암호: %s\n", password1);
    System.out.printf("사진: %s\n", photo1);
    System.out.printf("전화: %s\n", tel1);
    System.out.printf("가입일: %s\n", registerdDate1);

    System.out.println("번호: " + no2);
    System.out.println("이름: " + name2);
    System.out.println("이메일: " + email2);
    System.out.printf("암호: %s\n", password2);
    System.out.printf("사진: %s\n", photo2);
    System.out.printf("전화: %s\n", tel2);
    System.out.printf("가입일: %s\n", registerdDate2);


    System.out.println("번호: " + no3);
    System.out.println("이름: " + name3);
    System.out.println("이메일: " + email3);
    System.out.printf("암호: %s\n", password3);
    System.out.printf("사진: %s\n", photo3);
    System.out.printf("전화: %s\n", tel3);
    System.out.printf("가입일: %s\n", registerdDate3);

  }
}
