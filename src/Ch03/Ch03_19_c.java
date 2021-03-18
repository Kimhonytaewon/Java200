package Ch03;

import java.util.Scanner;

public class Ch03_19_c {
    //3개의 정숫값을 오름차순(작은 순)으로 정렬하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b = scanf.nextInt();
        System.out.println("정수 c를 입력하세요");
        int c = scanf.nextInt();

        System.out.println("정수 a: " + a);
        System.out.println("정수 b: " + b);
        System.out.println("정수 c: " + c);
        System.out.println("-----------------------");

        int x;

        if(a > b) {
            x = b;
            b = a;
            a = x;
        }
        if(b > c) {
            x = c;
            c = b;
            b = x;
        }
        if(a > b) {
            x = b;
            b = a;
            a = x;
        }

        System.out.println("오름차순으로 정렬했습니다");
        System.out.println("정수 a: " + a);
        System.out.println("정수 b: " + b);
        System.out.println("정수 c: " + c);
    }
}
