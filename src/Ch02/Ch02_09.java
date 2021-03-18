package Ch02;

import java.util.Scanner;

public class Ch02_09 {
    //삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        //*추가 예외처리 실수가 아닐경우 경고문
        while (true) {
            try {
                System.out.println("삼각형 밑변을 입력하세요");
                double a = scanf.nextDouble();
                System.out.println("삼각형 높이를 입력하세요");
                double b = scanf.nextDouble();

                double area = a * b / 2;
                System.out.println("삼각형의 넓이는 " + area + "입니다.");
                break;
            } catch (Exception e) {
                scanf = new Scanner(System.in);
                System.out.println("!경고! 수만 입력하세요");
                System.out.println("-------------------");
            }
        }
    }
}
