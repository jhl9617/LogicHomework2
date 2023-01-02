package logic.home.model;

import java.util.Scanner;

public class ContinueSample {
    Scanner scanner = new Scanner(System.in);

    public static void subContinueMenu(){
        ContinueSample continueSample = new ContinueSample();

        do {
            System.out.print("\t*** continue�� �׽�Ʈ �θ޴� ***\n" +
                    "\n" +
                    "\t1. 1~100������ ���� �� 3�� ����� �� �������� �հ� ����ϱ�\n" +
                    "\t2. 3�� 5���� �࿭�� ����ϵ�, 1�� 3������ 1�� 5������ �����ϰ� ����ϱ�\n" +
                    "\t3. ���� �޴��� ����\n" +
                    "\t�޴� ���� : ");

            int input = new Scanner(System.in).nextInt();

            switch(input)
            {
                case 1:	continueSample.sumJumpThree(); break;
                case 2:	continueSample.rowColJump(); break;
                case 3:	System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            }
        }while (true);

    }

    public void sumJumpThree() {
        int ind = 1;
        int tot = 0;
        while (ind <= 100){
            if(ind % 3 == 0) {
                ind++;
                continue;
            }
            tot += ind;
            System.out.print(ind + " ");
            ind++;
        }
        System.out.println("\n���� : "+tot);
    }
    public void rowColJump() {

        int ind = 1;
        for(int i = 1; i < 4;i++){
            for(int j = 1; j < 6;j++){
                if(j >=3 && j <= 5 && i == 1){
                    ind++;
                    continue;
                }
                System.out.print(ind+"\t");
                ind++;
            }
            System.out.println();
        }

    }
}
