package logic.home.model;

import java.util.Scanner;

public class BreakSample {

    Scanner scanner = new Scanner(System.in);

    public static void subBreakMenu() {
        BreakSample breakSample = new BreakSample();

        do {
            System.out.print("\t*** break문 테스트 부메뉴 ***\n" +
                    "\n" +
                    "\t1. 1~100까지 정수들의 합계 출력하기(break문 사용)\n" +
                    "\t2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)\n" +
                    "\t3. 이전 메뉴로 가기\n" +
                    "\t메뉴 선택 : ");
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1:
                    breakSample.sumBreak();
                    break;
                case 2:
                    breakSample.guguDanBreak();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
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

        System.out.println("1~100까지의 정수 합 : " + tot);

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
