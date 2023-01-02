package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {
    Scanner scanner = new Scanner(System.in);

    int[] menu = {3500, 3200, 1000, 400, 2000, 700, 1200, 1000};
    int[] era = {0, 0, 0, 0, 0, 0, 0, 0};
    String[] name = {"�Ұ�����", "ġŲ����", "����Ƣ��", "ġ�ƽ", "������", "�ݶ�", "���̵�", "Ŀ��"};

    public static void subDoWhileMenu() {
        DoWhileSample doWhileSample = new DoWhileSample();


        do {

            System.out.print(
                    "\t*** do~while�� �׽�Ʈ �θ޴� ***\n" +
                    "\n" +
                    "\t1. ���ڿ��� �Է¹޾�, ���� ���̿� '-' �����־� ����ϱ�\n" +
                    "\t2. ����ŷ �޴� �ֹ� �׽�Ʈ\n" +
                    "\t3. ���ڿ� �Է¹޾�, \"��� ���� �����ڴ�\"/\"������ �ƴϴ�.\" ����ϱ�\n" +
                    "\t4. ���� �޴��� ����\n" +
                    "\t�޴� ���� : ");
            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1:
                    doWhileSample.addDashToken();
                    break;
                case 2:
                    doWhileSample.burgerKingMenu();
                    break;
                case 3:
                    doWhileSample.isStringAlphabet();
                    break;
                case 4: {
                    System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                }
                default: {
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
                }
            }
        } while (true);

    }

    public void addDashToken() {
        System.out.print("���ڿ� : ");
        String st = scanner.next();
        char[] arr = st.toCharArray();
        int ind = 0;
        do {
            System.out.print(arr[ind]);
            if (ind++ != st.length() - 1) {
                System.out.print("-");

            } else {
                break;
            }


        } while (ind < arr.length);
        System.out.println();
    }

    public void burgerKingMenu() {
        while (true) {
            System.out.println("\t*** �޴��� �����ϼ��� ***\n");
            System.out.println("\t�ܹ��� ***************");
            System.out.println("\t1. �Ұ�����\t3500��");
            System.out.println("\t2. ġŲ����\t3200��");
            System.out.println("\t�߰� ****************");
            System.out.println("\t3. ����Ƣ��\t1000��");
            System.out.println("\t4. ġ�ƽ\t400��");
            System.out.println("\t5. ������\t\t2000��");
            System.out.println("\t����� ***************");
            System.out.println("\t6. �ݶ�\t\t700��");
            System.out.println("\t7. ���̵�\t\t1200��");
            System.out.println("\t8. Ŀ��\t\t1000��");
            System.out.println("\t********************");
            System.out.print("�޴� ���� : ");
            int input = scanner.nextInt();
            menunum(input - 1);
            System.out.print("�߰� �ֹ��Ͻðڽ��ϱ�?(n) : ");
            char brk = scanner.next().toUpperCase().charAt(0);
            if (brk == 'N') break;
        }
        System.out.println("\t�ֹ��Ͻ� ������ ������ �����ϴ�.\n\t------------------------");
        int tot = 0;
        for (int i = 0; i < 8; i++) {
            if (era[i] > 0) {
                System.out.println(name[i] + " : " + era[i] + "�� - " + menu[i] * era[i]);
                tot += menu[i] * era[i];
            }
        }
        System.out.println("�� ���� : " + tot + "��");


    }

    public boolean isStringAlphabet() {

        System.out.print("���ڿ� �Է� : ");
        String st = scanner.next();

        if (st.length() > 0) {
            char[] ch = st.toCharArray();
            boolean narp = false;
            int ind = 0;
            do {
                if (!Character.isAlphabetic(ch[ind])) {
                    narp = true;
                    break;
                }
                ind++;
            } while (ind <= ch.length);
            if (narp == true) {
                System.out.println("�����ڰ� �ƴմϴ�.");
            } else {
                System.out.println("������ �Դϴ�.");
            }
        }
        return false;
    }


    public void menunum(int num) {
        if (num < 8 && num > -1) {
            System.out.println(name[num] + "��(��) �����ϼ̽��ϴ�\n������? :");
            era[num] = scanner.nextInt();
        }


    }


}
