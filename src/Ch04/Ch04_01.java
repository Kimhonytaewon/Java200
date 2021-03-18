package Ch04;

import java.util.Scanner;

public class Ch04_01 {
    //정숫값의 부호를 판정해서 표시하는 Sign 프로그램인 [문제3-5]를 원하는 만큼 반복해서 입력 및 표시하도록 수정하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        //1.
        while (true) {
            System.out.println("정수 a를 입력하세요");
            int a = scanf.nextInt();

            if(a > 0) {
                System.out.println("정수 a는 양수입니다.");
            } else if(a < 0) {
                System.out.println("정수 a는 음수입니다.");
            } else {
                System.out.println("0입니다.");
            }

            System.out.println("계속 진행 : 1");
            System.out.println("종료 : 0");
            int b = scanf.nextInt();

            if(b == 0) {
                break;
            }
        }
        System.out.println("--------------------------");

        //2.
        int d;
        do {
            System.out.println("정수 c를 입력하세요");
            int c = scanf.nextInt();
            if(c > 0) {
                System.out.println("정수 c는 양수입니다.");
            } else if(c < 0) {
                System.out.println("정수 c는 음수입니다.");
            } else {
                System.out.println("0입니다.");
            }
            System.out.println("계속 진행 : 1");
            System.out.println("종료 : 0");
            d = scanf.nextInt();
        } while (d == 1);
    }
}
