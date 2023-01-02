package logic.home.view;

import logic.home.model.*;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\t***** 프로그래밍 기본 기능 테스트 프로그램 *****\n");
            System.out.println("\t\t1. 변수 테스트");
            System.out.println("\t\t2. 기본 자료형 테스트");
            System.out.println("\t\t3. if문 테스트");
            System.out.println("\t\t4. switch문 테스트");
            System.out.println("\t\t5. for문 테스트");
            System.out.println("\t\t6. while문 테스트");
            System.out.println("\t\t7. do~while문 테스트");
            System.out.println("\t\t8. break문 테스트");
            System.out.println("\t\t9. continue문 테스트");
            System.out.println("\t\t10. static 메소드 사용 테스트");
            System.out.println("\t\t11. non-static 메소드 사용 테스트");
            System.out.println("\t\t12. 프로그램 종료");
            System.out.print("\t\t메뉴 번호 입력 : ");

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
                    System.out.print("정말로 종료하시겠습니까?(예:y/아니오:n)");
                    char quit =scanner.next().toLowerCase().charAt(0);
                    if(quit == 'y') return;
                default:
                    System.out.println("잘못 입력하셨습니다.");

            }





        } while(true);

    }
}
