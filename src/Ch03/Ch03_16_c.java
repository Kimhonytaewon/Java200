package Ch03;

import java.util.Scanner;

public class Ch03_16_c {
    //키보드에서 입력한 3개의 정숫값 중 중앙값을 구해서 표시하는 프로그램을 작성하자.
    //예를 들어 2,3,1의 중앙값은 2이고 1,2,1의 중앙값은 1이고,
    //3,3,3의 중앙값은 3이다.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b = scanf.nextInt();
        System.out.println("정수 c를 입력하세요");
        int c = scanf.nextInt();
        int mid;

        if((b <= a && a <= c) || (c <= a && a <= b)) {
            mid = a;
            System.out.println("정수 a: " + a);
            System.out.println("정수 b: " + b);
            System.out.println("정수 c: " + c);
            System.out.println("중앙값은 " + mid + "입니다.");
        } else if((a<b && b<c) || (c<b && b<a)) {
            mid = b;
            System.out.println("정수 a: " + a);
            System.out.println("정수 b: " + b);
            System.out.println("정수 c: " + c);
            System.out.println("중앙값은 " + mid + "입니다.");
        } else {
            mid = c;
            System.out.println("정수 a: " + a);
            System.out.println("정수 b: " + b);
            System.out.println("정수 c: " + c);
            System.out.println("중앙값은 " + mid + "입니다.");
        }
    }
}
