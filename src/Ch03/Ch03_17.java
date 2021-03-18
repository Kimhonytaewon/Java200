package Ch03;

import java.util.Scanner;

public class Ch03_17 {
    //키보드에서 입력한 2개의 정숫값 중 작은 값과 큰 값을 표시하는 프로그램을 작성하자.
    // 두 정숫값이 같으면 "두 값이 같습니다."라고 표시한다.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b = scanf.nextInt();

        int big;
        int small;

        if(a > b){
            big = a;
            small = b;
            System.out.println("큰 값은 " + big + "입니다.");
            System.out.println("작은 값은 " + small + "입니다.");
        } else if(b > a) {
            big = b;
            small = a;
            System.out.println("큰 값은 " + big + "입니다.");
            System.out.println("작은 값은 " + small + "입니다.");
        } else {
            System.out.println("두 값이 같습니다.");
        }
    }
}
