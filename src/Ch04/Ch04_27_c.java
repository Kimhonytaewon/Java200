package Ch04;

import java.util.Scanner;

public class Ch04_27_c {
    //정숫값을 읽어서 합계와 평균을 구하는 프로그램을 작성하자.
    // 단 정숫값의 입력은 합계가 1,000을 넘지않은 범위에서 이루어질 것
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수의 합계와 평균을 구합니다.");
        System.out.println("몇 개의 정수를 입력할까요?");
        int a = scanf.nextInt();
        int sum = 0;
        double cnt = 0;

        for(int i = 1; i <= a; i++) {
            System.out.println("정수를 입력하세요");
            int b = scanf.nextInt();
            if(sum + b > 1000) {
                System.out.println("합이 1000을 넘었습니다.");
                System.out.println("마지막 값은 무시합니다.");
                break;
            }
            sum += b;
            cnt++;
        }

        double avg = sum / cnt;

        System.out.println("입력한 정수의 합은 :" + sum + "입니다.");
        System.out.println("입력한 정수의 평균은 :" + avg + "입니다.");
    }
}
