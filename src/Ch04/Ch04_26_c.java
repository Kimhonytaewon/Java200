package Ch04;

import java.util.Scanner;

public class Ch04_26_c {
    //정숫값을 연속해서 입력을 받아 합계와 평균을 구하는 프로그램을 작성하자 (0 입력시 프로그램 종료)
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수의 합계와 평균을 구합니다.");
        System.out.println("몇 개의 정수를 입력할까요?");
        int a = scanf.nextInt();
        int sum = 0;
        double cnt = 0;

        for(int i = 1; i <= a; i++) {
            System.out.println("정수를 입력하세요(종료: 0)");
            int b = scanf.nextInt();
            if(b == 0) {
                break;
            }
            sum += b;
            cnt++;
        }

        double avg = sum / cnt;

        System.out.println("입력한 정수의 합은 " + sum + "입니다.");
        System.out.println("입력한 정수의 평균은 " + avg + "입니다.");

    }
}
