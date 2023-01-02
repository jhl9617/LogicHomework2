package logic.home.model;

import java.util.Date;
import java.util.Scanner;

public class SwitchSample {

    Scanner scanner = new Scanner(System.in);

    public static void subSwitchMenu() {
        SwitchSample switchSample = new SwitchSample();
        do {
            System.out.println("\t*** switch�� �׽�Ʈ �θ޴� ***\n" +
                    "\n" +
                    "\t1. �� ���� ������ �� ���� ���깮�ڸ� �Է¹޾� ����� ��� Ȯ���ϱ�\n" +
                    "\t2. �����̸��� ���ڿ��� �Է¹޾�, �� ������ ���� ����ϱ�\n" +
                    "\t3. ���� �޴��� ����");
            System.out.print("\t�޴� ���� : ");

            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1:
                    switchSample.calculator();
                    break;
                case 2:
                    switchSample.fruitPrice();
                    break;
                case 3:
                    System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");

            }
        }while (true);

    }

    public void calculator() {


        System.out.print("ù��° ���� : ");
        int first = scanner.nextInt();
        System.out.print("�ι�° ���� : ");
        int second = scanner.nextInt();
        System.out.print("���깮��(+,-,*,/,%) : ");
        char ch = scanner.next().charAt(0);
        int result = 0;
        switch (ch) {
            case '+': {
                result = first + second;
                break;
            }
            case '-': {
                result = first - second;
                break;
            }
            case '*': {
                result = first * second;
                break;
            }
            case '/': {
                if(second == 0){
                    System.out.println("������ ���ڴ� 0�� �� �� �����ϴ�.");
                    break;
                }else {
                    result = first / second;
                    break;
                }

            }
            case '%': {
                result = first % second;
                break;
            }
            default:
                System.out.println("���깮�ڰ� �߸� �Է� �Ǿ����ϴ�.\nȮ���ϰ� �ٽ� �����ϼ���.");
                return;
        }

        System.out.println(first+" " + ch+ " " + second + " = " + result);
    }

    public void fruitPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("���ϸ� : ");
        String fruitName = sc.next();
        System.out.print("���� ���� : ");
        int quantity = sc.nextInt();

        int price;
        if (fruitName.equals("���")) {
            price = 1200;
        } else if (fruitName.equals("��")) {
            price = 2500;
        } else if (fruitName.equals("����")) {
            price = 5000;
        } else if (fruitName.equals("������")) {
            price = 700;
        } else {
            if (!fruitName.equals("Ű��")) {
                System.out.println("ǰ���Ǿ����ϴ�.");
                return;
            }

            price = 500;
        }

        System.out.println(fruitName + " : " + price + "��, " + quantity + "�� => ���Ű��� : " + quantity * price + "��");
    }

}
