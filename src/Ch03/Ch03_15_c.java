package Ch03;

import java.util.Scanner;

public class Ch03_15_c {
    //키보드에서 입력한 3개의 정수 중 최솟값을 구하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b = scanf.nextInt();
        System.out.println("정수 c를 입력하세요");
        int c = scanf.nextInt();

        int min = a;
        if(min > b) {
            min = b;
        }
        if(min > c) {
            min = c;
        }

        System.out.println("최솟값은 " + min + "입니다.");
    }
}
