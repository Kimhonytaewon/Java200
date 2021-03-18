package Ch02;

import java.util.Random;

public class Ch02_13 {
    //다음과 같은 프로그램을 작성하자
    //1. 0.0이상 1.0미만의 실숫값을 랜덤으로 생성해서 표시
    //2. 0.0이상 10.0미만의 실숫값을 랜덤으로 생성해서 표시
    //3. -1.0이상 1.0미만의 실숫값을 랜덤으로 생성해서 표시

    public static void main(String[] args) {
        Random rnd = new Random();
        //1번
        double a = rnd.nextDouble();
        System.out.println("0.0이상 1.0미만의 실수인 난수를 생성했습니다.");
        System.out.println(a);
        System.out.println("---------------------------------");

        //2번
        double b = 10 * rnd.nextDouble();
        System.out.println("0.0이상 10.0미만의 실수인 난수를 생성했습니다.");
        System.out.println(b);
        System.out.println("---------------------------------");

        //3번
        double c = 2 * rnd.nextDouble() - 1;
        System.out.println("-1.0이상 1.0미만의 실수인 난수를 생성했습니다.");
        System.out.println(c);
        System.out.println("---------------------------------");
    }
}
