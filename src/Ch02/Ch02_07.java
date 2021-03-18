package Ch02;

import java.util.Scanner;

public class Ch02_07 {
    //키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a1 = scanf.nextInt();
        int x1 = a1 / 10;
        int y1 = a1 % 10;

        System.out.println("마지막 자릿수를 제외한 값은 " + x1 + "입니다.");
        System.out.println("마지막 자릿수 값은 " + y1 + "입니다.");
        System.out.println("--------------------------------");
        
        //*추가 예외처리 정수가 아닐경우 경고문

        while (true) {
            try {
                System.out.println("정수 a를 입력하세요");
                int a2 = scanf.nextInt();
                int x2 = a2 / 10;
                int y2 = a2 % 10;

                System.out.println("마지막 자릿수를 제외한 값은 " + x2 + "입니다.");
                System.out.println("마지막 자릿수 값은 " + y2 + "입니다.");

                break;
            } catch (Exception e) {
                scanf = new Scanner(System.in);
                System.out.println("!경고! 입력한 값을 확인하세요");
            }
        }
    }
}
