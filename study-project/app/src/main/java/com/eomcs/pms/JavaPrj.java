package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class JavaPrj {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    final int MAXLENGTH = 100;

    int[] num       = new int[MAXLENGTH];
    String[] name   = new String[MAXLENGTH];
    String[] email  = new String[MAXLENGTH];
    String[] pwd    = new String[MAXLENGTH];
    String[] photo  = new String[MAXLENGTH];
    String[] tel    = new String[MAXLENGTH];
    Date[] regDate  = new Date[MAXLENGTH];

    int size = 0;

    while (true) {
      System.out.println("[회원]");

      System.out.print("번호? ");
      num[size] = Integer.parseInt(scan.nextLine());


      System.out.print("이름? ");
      name[size] = scan.nextLine();


      System.out.print("이메일? ");
      email[size] = scan.nextLine();


      System.out.print("암호? ");
      pwd[size] = scan.nextLine();



      System.out.print("사진? ");
      photo[size] = scan.nextLine();


      System.out.print("전화? ");
      tel[size] = scan.nextLine();


      regDate[size] = new Date();


      System.out.println("계속 입력하시겠습니까? (y/N)");
      String input = scan.nextLine();
      if (input.equalsIgnoreCase("n") | input.equals("")) {
        break;
      } else if (input.equalsIgnoreCase("y")) {

        size++;

      } else {
        System.out.println("값을 잘 못 입력하였습니다.");
        continue;
      }


      System.out.println();
    }
    scan.close();


    for (int i=0; i<size+1; i++) {

      System.out.printf("%d, %s, %s %s, %s, %s, %tY-%7$tm-%7$td\n",
          num[i], 
          name[i], 
          email[i], 
          pwd[i], 
          photo[i], 
          tel[i], 
          regDate[i]);

    }










  }

}
