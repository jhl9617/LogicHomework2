package logic.home.model;

import java.util.Scanner;

public class BreakSample {

    Scanner scanner = new Scanner(System.in);

    public static void subBreakMenu() {
        BreakSample breakSample = new BreakSample();

        do {
            System.out.print("\t*** break�� �׽�Ʈ �θ޴� ***\n" +
                    "\n" +
                    "\t1. 1~100���� �������� �հ� ����ϱ�(break�� ���)\n" +
                    "\t2. ������ 1��~9�ܱ��� ����ϵ�, * 5 ��꿡�� �ݺ��� ������(break �̸� ���)\n" +
                    "\t3. ���� �޴��� ����\n" +
                    "\t�޴� ���� : ");
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1:
                    breakSample.sumBreak();
                    break;
                case 2:
                    breakSample.guguDanBreak();
                    break;
                case 3:
                    System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            }
        } while (true);
    }

    public void sumBreak() {
        int ind = 1;
        int tot = 0;
        while (true) {
            tot += ind;
            ind++;
            if (ind > 100) break;
        }

        System.out.println("1~100������ ���� �� : " + tot);

    }

    public void guguDanBreak() {
        for(int i = 1; i < 10;i++){
            for(int j = 1; j < 10; j++){
                if(j == 5) break;
                System.out.println(i + " * " + j + " = "+ (i*j));
            }
            System.out.println();
        }
    }
}
