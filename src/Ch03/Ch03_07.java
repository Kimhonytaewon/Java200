package Ch03;

import java.util.Scanner;

public class Ch03_07 {
    //2개의 변수 a,b에 값을 읽어서 a,b의 대소 관계를 다음과 같이 표시하는 프로그램을 작성하자.
    //"a가 크다.", "b가 크다", "a와 b가 같다."
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("변수 a를 입력하세요");
        double a = scanf.nextDouble();
        System.out.println("변수 b를 입력하세요");
        double b = scanf.nextDouble();
        
        if(a > b) {
            System.out.println("a가 크다.");
        } else if(a < b) {
            System.out.println("b가 크다.");
        } else {
            System.out.println("a와 b가 같다.");
        }
    }
}
