package Ch03;

import java.util.Random;

public class Ch03_20 {
    //0, 1, 2 중 하나의 난수를 생성해서 0이면 "가위", 1이면 "바위", 2이면 "보"를 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Random rnd = new Random();

        //if문
        int a = rnd.nextInt(3);
        if (a == 0) {
            System.out.println("GH : 가위");
        } else if (a == 1) {
            System.out.println("GH : 바위");
        } else {
            System.out.println("GH : 보");
        }
        System.out.println("----------------------");

        //switch문
        int b = rnd.nextInt(3);
        switch (b) {
            case 0:
                System.out.println("TW : 가위");
                break;
            case 1:
                System.out.println("TW : 바위");
                break;
            case 2:
                System.out.println("TW : 보");
                break;
        }
    }
}
