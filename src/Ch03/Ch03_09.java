package Ch03;

import java.util.Scanner;

public class Ch03_09 {
    //입력한 정숫값이 10의 배수이면 "이 값은 10의 배수입니다."라고 표시하고, 그렇지 않으면 "이 값은 10의 배수가 아닙니다."라고 표시하는
    //프로그램을 작성하라 (음수를 읽은 경우 "음의 정숫값을 입력했습니다."라고 표시할 것)
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하시오");
        int a = scanf.nextInt();

        if(a > 0) {
            if (a % 10 == 0){
                System.out.println("이 값은 10의 배수입니다.");
            } else {
                System.out.println("이 값은 10의 배수가 아닙니다.");
            }
        } else if(a < 0) {
            System.out.println("음의 정숫값을 입력했습니다.");
        } else {
            System.out.println("0을 입력했습니다.");
        }
    }
}
