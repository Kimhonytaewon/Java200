package Ch03;

import java.util.Scanner;

public class Ch03_18_c {
    //2개의 정숫값을 내림차순(큰 순)으로 정렬하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b = scanf.nextInt();

        System.out.println("정수 a는 " + a + "입니다.");
        System.out.println("정수 b는 " + b + "입니다.");
        System.out.println("-----------------------");

        int x;

        if(a < b) {
            x = a;
            a = b;
            b = x;
        }

        System.out.println("내림차순으로 정렬했습니다.");
        System.out.println("정수 a는 " + a + "입니다.");
        System.out.println("정수 b는 " + b + "입니다.");
    }
}
