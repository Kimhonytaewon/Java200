package Ch02;

import java.util.Random;
import java.util.Scanner;

public class Ch02_12_c {
    //키보드에서 입력한 정숫값을 +5 또는 -5범위의 랜덤 정숫값을 생성하자.
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanf = new Scanner(System.in);

        /*
        1 => -4 ~ 6
        2 => -3 ~ 7
        3 => -2 ~ 8
        4 => -1 ~ 9
        5 => 0 ~ 10
        6 => 1 ~ 11
        7 => 2 ~ 12
        8 => 3 ~ 13
        */

        //*추가 예외처리 정수가 아닐경우 경고문
        while (true) {
            try {
                System.out.println("정수 a를 입력하세요");
                int a = scanf.nextInt();

                int b = (a - 5) + rnd.nextInt(11);
                System.out.println("입력한 정수 a의 +-5범위의 난수를 생성했습니다.");
                System.out.println(b);
                break;
            } catch (Exception e) {
                scanf = new Scanner(System.in);
                System.out.println("!경고! 정수마 입력하세요");
                System.out.println("--------------------");
            }
        }
    }
}
