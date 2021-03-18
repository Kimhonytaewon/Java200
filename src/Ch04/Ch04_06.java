package Ch04;

import java.util.Scanner;

public class Ch04_06 {
    //[문제4-5]에서 x--를 --x로 고치면 어떻게 출력이 바뀌는지 검증하자. 프로그램을 작성해서 실행 결과를 확인할 것
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int b;
        do {
            System.out.println("양의 정수 b를 입력하세요");
            b = scanf.nextInt();
        } while (b <= 0);

        System.out.println("카운트다운을 시작합니다.");

        while (b >= 0) {
            System.out.println(--b);
        }
        System.out.println("정수 b는 " + b + "가 됐습니다.");
    }
}
