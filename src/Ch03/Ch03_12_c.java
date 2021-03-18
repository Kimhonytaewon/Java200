package Ch03;

import java.util.Scanner;

public class Ch03_12_c {
    //2개의 실숫값 중 큰 값을 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("실수 a를 입력하세요");
        double a = scanf.nextDouble();
        System.out.println("실수 b를 입력하세요");
        double b = scanf.nextDouble();

        double max1;

        if(a > b) {
            max1 = a;
            System.out.println("큰 값은 " + max1 + "입니다.");
        } else if(a < b){
            max1 = b;
            System.out.println("큰 값은 " + max1 + "입니다.");
        } else {
            System.out.println("두 값은 같습니다.");
        }

        System.out.println("-------------------------");

        double max2 = a > b ? a : b;
        System.out.println("큰 값은 " + max2 + "입니다.");

    }
}
