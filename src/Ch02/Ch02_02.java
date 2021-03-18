package Ch02;

import java.util.Scanner;

public class Ch02_02 {
    //2개의 변수 x와 y의 합과 평균을 구하자. x와 y에는 적당한 값을 대입해서 사용한다.
    public static void main(String[] args) {
        /*
        double x = 15;
        double y = 22;

        double sum = x + y;
        double avg = sum / 2;

        System.out.println("x와 y의 합은 " + sum + "입니다.");
        System.out.println("x와 y의 평균은 " + avg + "입니다.");
        */
        //*추가 두 값을 받아서 합과 평균을 구하자.
        Scanner scanf = new Scanner(System.in);

        System.out.println("x를 입력하세요");
        double x = scanf.nextDouble();
        System.out.println("y를 입력하세요");
        double y = scanf.nextDouble();

        double sum = x + y;
        double avg = sum / 2;

        System.out.println("x와 y의 합은 " + sum + "입니다.");
        System.out.println("x와 y의 평균은 " + avg + "입니다.");
    }
}
