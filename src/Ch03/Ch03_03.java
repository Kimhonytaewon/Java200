package Ch03;

import java.util.Scanner;

public class Ch03_03 {
    //2개의 양의 정숫값을 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다."라고 표시하고, 그렇지 않으면 "B는 A의 약수가 아니다."
    //라고 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b= scanf.nextInt();

        if(a % b == 0) {
            System.out.println("b는 a의 약수이다.");
        } else {
            System.out.println("b는 a의 약수가 아니다.");
        }
    }
}
