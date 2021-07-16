package com.eomcs.algorithm.quiz;

//출처: codefights.com
//
//숫자 배열에서 각 이웃하는 숫자간의 차가 가장 큰 것을 알아내기
//예)
//[2, 4, 1, 0] => 3
//
//한 줄에 버그가 있다. 고쳐라!


public class Test2 {
  // 1) for 문 반복
  // 2) length 마지막 번호보다 하나 작은거까지 비교  -1을뺀다? 부등호를 붙일 것인가 아닌가? < . <=
  // 3) 비교
  // 4) 찍어서 확인

  static int maxDiff(int[] values) {

    int result = 0;
    for (int i = 0; i < values.length - 1; i++) {
      int diff = Math.abs(values[i] - values[i+1]);
      System.out.println(diff);
      if (result < diff) {
        result = diff;
      }
    }
    return result;

  }

  public static void main(String[] args) {

    //    int[] arr = new int[] {2,4,1,0};
    //    int result = maxDiff(arr);
    //    System.out.println(result);

    System.out.println(maxDiff(new int[]{2, 4, 1, 0}));

  }

}
