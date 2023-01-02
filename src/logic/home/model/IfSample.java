package logic.home.model;

import java.util.Scanner;
import java.util.SortedMap;

public class IfSample {
    Scanner scanner = new Scanner(System.in);

    public static void subIfMenu() {
        IfSample ifSample = new IfSample();
        do {
            System.out.println("\t*** if�� �׽�Ʈ �θ޴� ***\n" +
                    "\n" +
                    "\t1. �� ���� ������ �Է¹޾�, �� ���� ū �� ����ϱ�\n" +
                    "\t2. �� ���� ������ �Է¹޾�, �� ���� ���� �� ����ϱ�\n" +
                    "\t3. �� ���� ������ �Է¹޾�, �� ���� ���� ū���� ���� ������ ����ϱ�\n" +
                    "\t4. �� ���� ������ �Է¹޾�, ¦������ Ȧ������ ����ϱ�\n" +
                    "\t5. ��,��,�� �� ������ ������ �Է¹޾�, �հ�/���հ� Ȯ���ϱ�\n" +
                    "\t6. ������ �Է¹޾�, ���� Ȯ���ϱ�\n" +
                    "\t7. �� ���� ������ �Է¹޾�, ������� 0���� �������� Ȯ���ϱ�\n" +
                    "\t8. ���� �ϳ��� �Է¹޾�, ����빮������ �ҹ������� ���ڹ������� ��Ÿ�������� Ȯ���ϱ�\n" +
                    "\t9. ���� �޴��� ����");
            System.out.print("\t�޴� ���� : ");

            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1:
                    ifSample.maxNumber();
                    break;
                case 2:
                    ifSample.minNumber();
                    break;
                case 3:
                    ifSample.threeMaxMin();
                    break;
                case 4:
                    ifSample.checkEven();
                    break;
                case 5:
                    ifSample.isPassFail();
                    break;
                case 6:
                    ifSample.scoreGrade();
                    break;
                case 7:
                    ifSample.checkPlusMinusZero();
                    break;
                case 8:
                    ifSample.whatCaracter();
                    break;
                case 9: {
                    System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                }
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            }

        }while (true) ;


    }

    public void maxNumber() {
        System.out.print(" ù��° ���� : ");
        int first = scanner.nextInt();
        System.out.print(" �ι�° ���� : ");
        int second = scanner.nextInt();

        System.out.println(Math.max(first,second));

    }
    public void minNumber() {
        System.out.print(" ù��° ���� : ");
        int first = scanner.nextInt();
        System.out.print(" �ι�° ���� : ");
        int second = scanner.nextInt();

        System.out.println(Math.min(first,second));
    }
    public void threeMaxMin() {
        System.out.print(" ù��° ���� : ");
        int first = scanner.nextInt();
        System.out.print(" �ι�° ���� : ");
        int second = scanner.nextInt();
        System.out.print(" ����° ���� : ");
        int third = scanner.nextInt();

        System.out.println("�ִ� : " +Math.max(third,Math.max(first,second)));
        System.out.println("�ּ� : " +Math.min(third,Math.min(first,second)));
    }
    public void checkEven() {
        System.out.print("���� : ");
        int first = scanner.nextInt();
        if (first == 0) {
            System.out.println("0�Դϴ�.");
            return;
        }
        if(first % 2 == 0){
            System.out.println("¦���Դϴ�.");
        }else if (first % 2 == 1){
            System.out.println("Ȧ���Դϴ�.");
        }
    }
    public void isPassFail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("���� : ");
        int kor = sc.nextInt();
        System.out.print("���� : ");
        int eng = sc.nextInt();
        System.out.print("���� : ");
        int mat = sc.nextInt();
        int tot = kor + eng + mat;
        double avg = tot / 3.0;

        if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
            System.out.println("�հ�");
        }else {
            System.out.println("���հ�");
        }
    }
    public void scoreGrade() {
        System.out.print("���� : ");
        int a = scanner.nextInt();
        char ch;
        if (a > 0) {
            if( a >= 90) {
                ch = 'A';
            }else if(a >= 80) {
                ch = 'B';
            }else if(a >= 70) {
                ch = 'C';
            }else if(a >= 60) {
                ch = 'D';
            }else {
                ch = 'F';
            }
            System.out.println("���� : " + a + " \n���� : " + ch);
        }
    }
    public void checkPlusMinusZero() {
        System.out.print("���� : ");
        int input = scanner.nextInt();
        if(input > 0){
            System.out.println("����Դϴ�.");
        }else if(input < 0){
            System.out.println("�����Դϴ�.");
        }else System.out.println("0�Դϴ�.");
    }
    public void whatCaracter() {
        System.out.print("����1�� : ");
        char ch = scanner.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("���� �빮���Դϴ�.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("���� �ҹ����Դϴ�.");
        }else if(Character.isDigit(ch)){
            System.out.println("�����Դϴ�.");
        }else System.out.println("��Ÿ �����Դϴ�.");

    }



}
