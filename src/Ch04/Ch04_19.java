package Ch04;

import java.util.Scanner;

public class Ch04_19 {
    //1부터 n까지의 정숫값에 각 값을 제곱해서 표시하는 프로그램을 작성하라(n값을 입력받을 것)
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();

        for(int i = 1; i <= a; i++) {
            int j = i * i;
            System.out.println(i +"의 제곱은 " + j + "입니다.");
        }
    }
}
