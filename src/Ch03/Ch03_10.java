package Ch03;

import java.util.Scanner;

public class Ch03_10 {
    //입력한 정숫값을 3으로 나눈다. 그리고 그 결과에 따라 "이 값은 3으로 나누어집니다.", "이 값을 3으로 나눈 나머지는 1입니다.",
    //"이 값을 3으로 나눈 나머지는 2입니다." 중 하나를 표시하는 프로그램을 작성하자.
    //(단, 양수가 아닌 경우 "양수가 아닌 값을 입력했습니다."라고 표시할 것)
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();

        if(a > 0) {
            if(a % 3 == 0){
                System.out.println("이 값은 3으로 나누어집니다.");
            } else if(a % 3 == 1) {
                System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
            } else {
                System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
            }

        } else {
            System.out.println("양수가 아닌 값을 입력했습니다.");
        }
    }
}
