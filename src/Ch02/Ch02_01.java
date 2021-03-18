package Ch02;

import java.util.Scanner;

public class Ch02_01 {
    //정수 82와 17의 합과 차를 구하는 프로그램을 다양한 방법으로 작성해보자.
    public static void main(String[] args) {
        /*
        int x = 87;
        int y = 15;
        System.out.println("두 수의 합은 " + (x + y) + "입니다.");
        System.out.println("두 수의 차는 " + (x - y) + "입니다.");
        */

        //*추가 입력받은 정수의 합과 차를 구하는 프로그램 작성
        Scanner scanf = new Scanner(System.in);

        System.out.println("x를 입력하세요");
        int x = scanf.nextInt();
        System.out.println("y를 입력하세요");
        int y = scanf.nextInt();

        System.out.println("두 수의 합은 " + (x + y) + "입니다.");
        System.out.println("두 수의 차는 " + (x - y) + "입니다.");
    }
}
