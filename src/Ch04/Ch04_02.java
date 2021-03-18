package Ch04;

import java.util.Scanner;

public class Ch04_02 {
    //3자리의 양의 정숫값(100~999)을 읽는 프로그램을 작성하라 (입력한 값이 3자리 양의 정숫값이 아니면 다시 입력하게 할 것)
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        //1.
        int a;
        do {
            System.out.println("3자리 양수 a를 입력하세요");
            a = scanf.nextInt();
        } while (a < 100 || a >= 1000);
        System.out.println("입력하신 정수는: " + a + "입니다.");
        System.out.println("-------------------------------");

        //2.
        int b;
        while (true) {
            System.out.println("3자리 양수 b를 입력하세요");
            b = scanf.nextInt();
            if(100 <= b && b <= 999) {
                System.out.println("입력하신 정수는: " + b + "입니다.");
                break;
            } else {
                System.out.println("!경고! 다시 입력하세요");
            }
        }
    }
}
