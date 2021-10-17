package com.eomcs.lang.ex05;

//# 비트 연산자 : 응용 V - 사용자 권한 관리에 적용
//
public class Exam0481 {
  public static void main(String[] args) {

    // 1) 사용자 권한을 값으로 정의 

    final int LOGOUT = 0x01; // 0000 0001     - 로그아웃
    final int GENERAL = 0x02; // 0000 0010    - 일반 로그인
    final int ADMIN = 0x04; // 0000 0100    - 관리자 로그인


    // 2) 메뉴의 접근 범위 설정

    int menu1 = LOGOUT;  // 로그아웃 상태에서만 접근 가능한 메뉴 
    int menu2 = GENERAL; // 일반으로 로그인 된 접근 가능한 메뉴
    int menu3 = ADMIN; // 관리자로 로그인 된 사용자만 접근 가능한 메뉴
    int menu4 = LOGOUT | GENERAL | ADMIN; // 로그아웃 되었든, 일반으로 로그인 되었든, 관리자로 로그인 되었든 모두 접근 가능한 메뉴
    int menu5 = GENERAL | ADMIN; // 

    // 3) 접근 테스트 
    System.out.println("메뉴1에 접근 가능한 범위");
    System.out.println((menu1 & LOGOUT) > 0);
    System.out.println((menu1 & GENERAL) > 0);
    System.out.println((menu1 & ADMIN) > 0);

    System.out.println("------------------------------");
    System.out.println("메뉴2에 접근 가능한 범위");
    System.out.println((menu2 & LOGOUT) > 0);
    System.out.println((menu2 & GENERAL) > 0);
    System.out.println((menu2 & ADMIN) > 0);

    System.out.println("------------------------------");
    System.out.println("메뉴3에 접근 가능한 범위");
    System.out.println((menu3 & LOGOUT) > 0);
    System.out.println((menu3 & GENERAL) > 0);
    System.out.println((menu3 & ADMIN) > 0);

    System.out.println("------------------------------");
    System.out.println("메뉴4에 접근 가능한 범위");
    System.out.println((menu4 & LOGOUT) > 0);
    System.out.println((menu4 & GENERAL) > 0);
    System.out.println((menu4 & ADMIN) > 0);

    System.out.println("------------------------------");
    System.out.println("메뉴5에 접근 가능한 범위");
    System.out.println((menu5 & LOGOUT) > 0);
    System.out.println((menu5 & GENERAL) > 0);
    System.out.println((menu5 & ADMIN) > 0);



  }
}
