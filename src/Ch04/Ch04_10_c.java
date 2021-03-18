package Ch04;

import java.util.Scanner;

public class Ch04_10_c {
    //양의 정숫값 n을 읽어서 1부터 n까지의 곱을 구하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("양수 a를 입력하세요");
        int a = scanf.nextInt();
        int b = 1;
        int mul1 = 1;

        while (b < a) {
            mul1 = mul1 * a;
            a--;
        }
        System.out.println("1부터 a까지의 곱은 " + mul1 + "입니다.");
        System.out.println("-----------------------------------");

        System.out.println("양수 c를 입력하세요");
        int c = scanf.nextInt();
        int d = 1;
        int mul2 = 1;

        while (c >= d) {
            mul2 = mul2 * d;
            d++;
        }
        System.out.println("1부터 c까지의 곱은 " + mul2 + "입니다.");
    }
}
