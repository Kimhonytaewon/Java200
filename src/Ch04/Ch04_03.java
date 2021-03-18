package Ch04;

import java.util.Random;
import java.util.Scanner;

public class Ch04_03 {
    //2자리의 정수값(10~99)을 맞추는 숫자 맞추기 게임을 만들자.
    //(난수 생성과 if문 그리고 do문을 사용할 것)
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("난수를 생성했습니다.(10~99)");
        int a = 10 + rnd.nextInt(90);

        //1.
        System.out.println("정수 a를 입력하세요");
        int b;
        do {
            b = scanf.nextInt();

            if(a > b) {
                System.out.println("더 큰 값을 입력하세요");
            } else {
                System.out.println("더 작은 값을 입력하세요");
            }
        } while (a != b);
        System.out.println("정답입니다.");
        System.out.println("생성된 난수는: " + a + "입니다.");
        System.out.println("------------------------------");

        //2.
        System.out.println("난수를 생성했습니다.(10~99)");
        int c = 10 + rnd.nextInt(90);
        System.out.println("정수 d를 입력하세요");

        while (true) {
            int d = scanf.nextInt();
            if(c > d) {
                System.out.println("더 큰 값을 입력하세요");
            } else if(c < d) {
                System.out.println("더 작은 값을 입력하세요");
            } else {
                System.out.println("정답입니다.");
                System.out.println("생성된 난수는: " + c + "입니다.");
                break;
            }
        }

    }
}
