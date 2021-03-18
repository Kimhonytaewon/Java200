package Ch02;

import java.util.Scanner;

public class Ch02_10 {
    //구의 겉넓이와 부피를 구하는 프로그램을 작성하자.
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner scanf = new Scanner(System.in);
        //*추가 예외처리 실수가 아닐경우 경고문
        while (true) {
            try {
                System.out.println("반지름을 입력하세요");
                double r = scanf.nextDouble();

                //겉넓이
                double sa = 4 * pi * r * r;
                //부피
                double vol = (4 / 3.0) * pi * r * r * r;

                System.out.println("구의 겉넓이는 " + sa + "입니다.");
                System.out.println("구의 부피는 " + vol + "입니다.");
                break;
            } catch (Exception e) {
                scanf = new Scanner(System.in);
                System.out.println("!경고! 수만 입력하세요");
                System.out.println("-------------------");
            }
        }
    }
}
