package Ch02;

import java.util.Random;

public class Ch02_11_c {
    //다음과 같은 프로그램을 작성하자
    //1. 한 자리 양의 정숫값(즉, 1이상 9이하의 값)을 랜덤으로 생성해서 표시
    //2. 한 자리 음의 정숫값(즉, -9이상 -1이하의 값)을 랜덤으로 생성해서 표시
    //3. 두 자리 양의 정숫값(즉,10이상 99이하의 값)을 랜덤으로 생성해서 표시
    public static void main(String[] args) {
        Random rnd = new Random();

        //1번 rnd.nextInt(n);은 0 ~ n-1까지 랜덤으로 생성한다.
        int a = 1 + rnd.nextInt(9);
        System.out.println(a);

        //2번
        int b = -(1 + rnd.nextInt(9));
        System.out.println(b);

        //3번
        int c = 10 + rnd.nextInt(90);
        System.out.println(c);
    }
}
