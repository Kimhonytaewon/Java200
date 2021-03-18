package Ch03;

import java.util.Scanner;

public class Ch03_13 {
    //2개의 정숫값을 읽어서 두 값의 차를 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b = scanf.nextInt();

        int gap;
        if(a >= b) {
            gap = a -b;
            System.out.println("두 값의 차는 " + gap + "입니다.");
        } else {
            gap = b - a;
            System.out.println("두 값의 차는 " + gap + "입니다.");
        }
        
        /* 다른 방법
        int gap = a >= b ? a - b : b - a;
        System.out.println("두 값의 차는 " + gap + "입니다.");
        */

    }
}
