package Ch04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch04_12 {
    //양의 정숫값을 0까지 카운트다운하는 [문제4-5]를 for문으로 작성하라.
    //(단, 반복 종료 후의 x값은 표시하지 않아도 된다.)
    //[문제4-5]
    //입력받은 정숫값부터 0까지 카운트 다운하는 프로그램을 작성하라. 카운트다운 종료 후의 변숫값을 확인할 수 있게 할 것
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("양의 정수 a를 입력하세요");
                int a = scanf.nextInt();
                if (a > 0) {
                    System.out.println("카운트 다운을 시작합니다.");
                    for (int i = a; i >= 0; i--) {
                        System.out.println(i);
                    }
                    break;
                } else {
                    scanf = new Scanner(System.in);
                    System.out.println("양수가 아닙니다.");
                }
            } catch (Exception e) {
                scanf = new Scanner(System.in);
                System.out.println("!경고!숫자만 입력하세요");
            }
        }
    }

}
