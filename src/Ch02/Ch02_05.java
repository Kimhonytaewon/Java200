package Ch02;

import java.util.Scanner;

public class Ch02_05 {
    //키보드에서 입력한 정숫값을 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        System.out.println("정수를 입력해주세요");
        Scanner scanf = new Scanner(System.in);

        int a = scanf.nextInt();

        System.out.println("입력한 정수는 " + a + "입니다.");
    }
}
