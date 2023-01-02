package logic.home.view;

import logic.home.model.*;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\t***** ���α׷��� �⺻ ��� �׽�Ʈ ���α׷� *****\n");
            System.out.println("\t\t1. ���� �׽�Ʈ");
            System.out.println("\t\t2. �⺻ �ڷ��� �׽�Ʈ");
            System.out.println("\t\t3. if�� �׽�Ʈ");
            System.out.println("\t\t4. switch�� �׽�Ʈ");
            System.out.println("\t\t5. for�� �׽�Ʈ");
            System.out.println("\t\t6. while�� �׽�Ʈ");
            System.out.println("\t\t7. do~while�� �׽�Ʈ");
            System.out.println("\t\t8. break�� �׽�Ʈ");
            System.out.println("\t\t9. continue�� �׽�Ʈ");
            System.out.println("\t\t10. static �޼ҵ� ��� �׽�Ʈ");
            System.out.println("\t\t11. non-static �޼ҵ� ��� �׽�Ʈ");
            System.out.println("\t\t12. ���α׷� ����");
            System.out.print("\t\t�޴� ��ȣ �Է� : ");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    VariableSample.subVarMenu();
                    break;
                case 2:
                    PrimitiveTypeSample.subPTypeMenu();
                    break;
                case 3:
                    IfSample.subIfMenu();
                    break;
                case 4:
                    SwitchSample.subSwitchMenu();
                    break;
                case 5:
                    ForSample.subForMenu();
                    break;
                case 6:
                    WhileSample.subWhileMenu();
                    break;
                case 7:
                    DoWhileSample.subDoWhileMenu();
                    break;
                case 8:
                    BreakSample.subBreakMenu();
                    break;
                case 9:
                    ContinueSample.subContinueMenu();
                    break;
                case 10:
                    StaticMethodSample.subStaticMethodMenu();
                    break;
                case 11:
                    NonStaticMethodSample.subNonStaticMethodMenu();
                    break;
                case 12:
                    System.out.print("������ �����Ͻðڽ��ϱ�?(��:y/�ƴϿ�:n)");
                    char quit =scanner.next().toLowerCase().charAt(0);
                    if(quit == 'y') return;
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");

            }





        } while(true);

    }
}
