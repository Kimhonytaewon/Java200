package Ch03;

import java.util.Scanner;

public class Ch03_01 {
    //키보드로 입력한 정숫값이 음이면 "이 값은 음의 값입니다."라고 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();

        if(a < 0) {
            System.out.println("이 값은 음의 값입니다.");
        } else if(a > 0) {
            System.out.println("이 값은 양의 값입니다.");
        } else {
            System.out.println("이 값은 0입니다.");
        }
    }
}
