package logic.home.model;

import java.util.Random;
import java.util.Scanner;

public class StaticMethodSample {
    static Scanner scanner = new Scanner(System.in);

    public static void subStaticMethodMenu() {
        StaticMethodSample staticMethodSample = new StaticMethodSample();

        do {
            System.out.print("\t*** static �޼ҵ� ��� �׽�Ʈ �θ޴� ***\n" +
                    "\n" +
                    "\t1. Math Ŭ������ ������ ���ϴ� �޼ҵ�\n" +
                    "\t2. Math Ŭ������ �Ǽ����� ���� ���밪 ���ϴ� �޼ҵ�\n" +
                    "\t3. Math Ŭ������ �� ������ ū�� ���ϴ� �޼ҵ�\n" +
                    "\t4. ���� �޴��� ����\n" +
                    "\t�޴� ���� : ");

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
                    System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");

            }
        }while (true);

    }

    public static void testMathRandom() {
        int a = (int)(Math.random() * 45) +1;
        System.out.println("1~45 ������ ������ : "+a);

    }

    public static void testMathAbs() {
        System.out.print("���밪�� ���� �Ǽ� :");
        double dob = scanner.nextDouble();
        System.out.println(Math.abs(dob));
    }

    public static void testMathMax() {
        System.out.print("ù��° ���� : ");
        int a = scanner.nextInt();
        System.out.print("�ι�° ���� : ");
        int b = scanner.nextInt();
        System.out.println("�� ū�� : " + Math.max(a, b));
    }
}
