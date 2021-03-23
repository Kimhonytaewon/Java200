package Ch04;

import java.util.Scanner;

public class Ch04_29_c {
    //5개의 정수로 구성된 그룹의 전체 합계(그룹 별이 아닌 전체 그룹의 합)를 구하는 프로그램을 작성하자
    //전체 10개의 그룹이 있으며 각 정숫값은 키보드를 통해 입력한다.
    //단, 99999를 입력하면 전체 입력을 종료하고 88888을 입력하면 현재 읽고 있는 그룹의 입력을 종료할 것
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수의 합계를 구합니다.");
        int sum = 0;
        double cnt = 0;
        Outer :
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + "그룹");

            for(int j = 1; j <= 5; j++) {
                System.out.println("정수를 입력하세요");
                int a = scanf.nextInt();

                if(a == 88888) {
                    continue Outer;
                }
                if(a == 99999) {
                    break Outer;
                }

                sum += a;
                cnt++;
            }
        }
        double avg = sum / cnt;

        System.out.println("입력한 모든 그룹의 합은: " + sum + "입니다.");
        System.out.println("입력한 모든 그룹의 평균은: " + avg + "입니다.");
    }
}
