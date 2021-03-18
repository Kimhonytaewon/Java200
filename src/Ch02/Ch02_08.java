package Ch02;

import java.util.Scanner;

public class Ch02_08 {
    //2개의 실숫값을 입력받아 그 합과 평균을 구하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        //*추가 예외처리 실수가 아닐경우 경고문
        while (true) {
            try {
                System.out.println("실수 a를 입력하세요");
                double a = scanf.nextDouble();
                System.out.println("실수 b를 입력하세요");
                double b = scanf.nextDouble();

                double sum = a + b;
                double avg = sum / 2;

                System.out.println("두 수의 합은 " + sum + "입니다.");
                System.out.println("두 수의 평균은 " + avg + "입니다.");
                break;
            } catch (Exception e) {
                scanf = new Scanner(System.in);
                System.out.println("!경고! 수만 입력하세요");
                System.out.println("--------------------");
            }
        }



    }
}
