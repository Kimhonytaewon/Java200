package Ch04;

import java.util.Scanner;

public class Ch04_13 {
    //앞 문제와 반대로 0부터 양의 정수까지 카운트업하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("양의 정수 a를 입력하세요");
                int a = scanf.nextInt();

                if (a > 0) {
                    System.out.println("카운트 업을 시작합니다.");
                    for(int i = 0; i <= a; i++) {
                        System.out.println(i);
                    }
                    break;
                } else {
                    System.out.println("양수만 입력하세요");
                    scanf = new Scanner(System.in);
                }
            } catch (Exception e) {
                System.out.println("!경고!숫자만 입력하세요");
                scanf = new Scanner(System.in);
            }
        }
    }
}
