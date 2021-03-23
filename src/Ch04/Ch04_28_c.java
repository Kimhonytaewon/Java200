package Ch04;

import java.util.Scanner;

public class Ch04_28_c {
    //정숫값을 연달아 읽어서 음수가 아닌 값의 합계와 평균을 구하자.
    // 음수의 개수는 평균을 구할 때 분모에서 제외할 것
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
            if(b < 0) {
                System.out.println("음수는 합하지 않습니다.");
                continue;
            }
            sum += b;
            cnt++;
        }
        double avg = sum / cnt;

        System.out.println("입력한 정수의 합은: " + sum + "입니다.");
        System.out.println("입력한 정수의 평균은: " + avg + "입니다.");
    }
}
