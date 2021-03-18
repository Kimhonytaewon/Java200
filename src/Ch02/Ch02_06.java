package Ch02;

import java.util.Scanner;

public class Ch02_06 {
    //키보드에서 입력한 정숫값에 10을 더한 값과 10을 뺀 값을 출력하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a1 = scanf.nextInt();

        int x1 = a1 + 10;
        int y1 = a1 - 10;

        System.out.println("10을 더한 값은 " + x1 +"입니다.");
        System.out.println("10을 뺀 값은 " + y1 +"입니다.");
        System.out.println("------------------------");
        //*추가 예외처리 Scanner를 통해 입력받을 때 정수가 아니면 경고문
        //      x를 추가 입력 받아 a+x, a-x를 출력
        while (true) {
            try {
                System.out.println("정수 a를 입력하세요");
                int a2 = scanf.nextInt();
                System.out.println("x를 입력하세요");
                int x2 = scanf.nextInt();

                int sum = a2 + x2;
                int sub = a2 - x2;

                System.out.println("a+x 는 " + sum + "입니다.");
                System.out.println("a-x 는 " + sub + "입니다.");

                break;
            } catch (Exception e) {
                scanf = new Scanner(System.in);
                System.out.println("!경고! 입력 값을 확인하세요");
            }
        }

    }
}
