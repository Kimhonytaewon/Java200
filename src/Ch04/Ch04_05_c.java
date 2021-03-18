package Ch04;

import java.util.Scanner;

public class Ch04_05_c {
    //입력받은 정숫값부터 0까지 카운트 다운하는 프로그램을 작성하라. 카운트다운 종료 후의 변숫값을 확인할 수 있게 할 것
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        //1.
        System.out.println("양의 정수 a를 입력하세요");
        int a = scanf.nextInt();

        System.out.println("카운트 다운을 시작합니다.");
        for(int i=a; a >=0; a--){
            System.out.println(a);
        }
        System.out.println("정수 a는 " + a + "가 됐습니다.");
        System.out.println("-----------------------------");

        //2.
        int b;
        do {
            System.out.println("양의 정수 b를 입력하세요");
            b = scanf.nextInt();
        } while (b <= 0);
        System.out.println("카운트다운을 시작합니다.");

        while (b >= 0) {
            System.out.println(b--);
        }
        System.out.println("정수 b는 " + b + "가 됐습니다.");
    }
}
