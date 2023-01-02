package logic.home.model;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class WhileSample {

    Scanner scanner = new Scanner(System.in);

    public static void subWhileMenu() {
        WhileSample whileSample = new WhileSample();

        do {
            System.out.println("\t*** while�� �׽�Ʈ �θ޴� ***\n" +
                    "\n" +
                    "\t1. ���� �ϳ� �Է¹޾�, �� ������ �����ڵ� ��� �ݺ�('0' �ԷµǸ� �ݺ�����)\n" +
                    "\t2. 1~100���� �������� �հ� ����ϱ�(while ������ �ۼ�)\n" +
                    "\t3. 1~100������ ������ ������ �߻�����, ���� �˾Ƹ��߱�\n" +
                    "\t4. ���ڿ��� �Է¹޾�, ���� ���� �˾Ƴ��� ����ϱ�\n" +
                    "\t5. ���ڿ����� ���� �ϳ��� �Է¹޾�, ���ڿ��� ���ڰ� �� �� �ִ��� Ȯ���ϱ�\n" +
                    "\t6. ���� �޴��� ����");
            System.out.print("\t�޴� ���� : ");
            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1 : whileSample.printUniCode();break;
                case 2 : whileSample.sum1To100();break;
                case 3 : whileSample.numberGame();break;
                case 4 : whileSample.countCharacter();break;
                case 5 : whileSample.countInChar();break;
                case 6 :
                    System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            }



        }while (true);
    }

    public void printUniCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է� : ");
        char ch = sc.next().charAt(0);

        while (ch != '0') {
            System.out.println(ch + " is unicode " + (int) ch);

            System.out.print("���� �Է� : ");
            ch = sc.next().charAt(0);

        }
        System.out.println("--- The End ---");
    }

    public void sum1To100() {

        int tot = 0;
        int ind = 1;
        while(ind < 101){
            tot += ind;
            ind++;
        }
        System.out.println("1 to 100 : "+ tot);
    }
    public void numberGame() {

        int ran = (int)(Math.random() * 100) + 1;
        while (true) {
            System.out.print("������?(0:����) : ");

            int input = scanner.nextInt();
            if(input == 0)break;
            if (input == ran) {
                System.out.println("�����Դϴ�.");
                return;
            } else {
                System.out.println("Ʋ�Ƚ��ϴ�.");
            }
        }
    }
    public void countCharacter() {
        System.out.print("���ڿ� :");
        String st = scanner.next();
        System.out.println("���ڿ� ���� : " + st.length());

    }
    public void countInChar() {

        int sum = 0, index = 0;
        System.out.println("���ڿ� �Է� : ");
        String str = scanner.next();
        char[] arrary = str.toCharArray();

        System.out.println("���� �Է� : ");
        char ch = scanner.next().charAt(0);

        while (index < arrary.length) {
            if (arrary[index] == ch) sum++;
            index++;
        }
        System.out.println(str + "�� ���Ե� " + ch + "�� ������ " + sum + "�� �Դϴ�.");
    }




}
