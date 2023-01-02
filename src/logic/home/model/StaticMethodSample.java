package logic.home.model;

import java.util.Random;
import java.util.Scanner;

public class StaticMethodSample {
    static Scanner scanner = new Scanner(System.in);

    public static void subStaticMethodMenu() {
        StaticMethodSample staticMethodSample = new StaticMethodSample();

        do {
            System.out.print("\t*** static 메소드 사용 테스트 부메뉴 ***\n" +
                    "\n" +
                    "\t1. Math 클래스의 랜덤값 구하는 메소드\n" +
                    "\t2. Math 클래스의 실수값에 대한 절대값 구하는 메소드\n" +
                    "\t3. Math 클래스의 두 정수중 큰값 구하는 메소드\n" +
                    "\t4. 이전 메뉴로 가기\n" +
                    "\t메뉴 선택 : ");

            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1:
                    testMathRandom();
                    break;
                case 2:
                    testMathAbs();
                    break;
                case 3:
                    testMathMax();
                    break;
                case 4:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");

            }
        }while (true);

    }

    public static void testMathRandom() {
        int a = (int)(Math.random() * 45) +1;
        System.out.println("1~45 사이의 랜덤값 : "+a);

    }

    public static void testMathAbs() {
        System.out.print("절대값을 얻을 실수 :");
        double dob = scanner.nextDouble();
        System.out.println(Math.abs(dob));
    }

    public static void testMathMax() {
        System.out.print("첫번째 정수 : ");
        int a = scanner.nextInt();
        System.out.print("두번째 정수 : ");
        int b = scanner.nextInt();
        System.out.println("더 큰값 : " + Math.max(a, b));
    }
}
