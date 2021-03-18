package Ch02;

import java.util.Scanner;

public class Ch02_04 {
    //3개의 int형 변수에 각각 값을 대입해서 합계와 평균을 구하는 프로그램을 작성하자.
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int sum1 = a + b + c;
        int avg1 = sum1 / 3;

        System.out.println("합은 " + sum1 + "입니다.");
        System.out.println("평균은 " + avg1 + "입니다.");
        System.out.println();
        
        //*추가 3개의 수를 입력 받아 합과 평균을 구하는 프로그램을 작성
        Scanner scanf = new Scanner(System.in);
        System.out.println("x를 입력하세요");
        double x = scanf.nextDouble();
        System.out.println("y를 입력하세요");
        double y = scanf.nextDouble();
        System.out.println("z를 입력하세요");
        double z = scanf.nextDouble();

        double sum2 = x + y + z;
        double avg2 = sum2 / 3;

        System.out.println("합은 " + sum2 + "입니다.");
        System.out.println("평균은 " + avg2 + "입니다.");
    }
}
