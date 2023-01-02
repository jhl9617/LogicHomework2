package logic.home.model;

import java.util.Scanner;

public class ContinueSample {
    Scanner scanner = new Scanner(System.in);

    public static void subContinueMenu(){
        ContinueSample continueSample = new ContinueSample();

        do {
            System.out.print("\t*** continue문 테스트 부메뉴 ***\n" +
                    "\n" +
                    "\t1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기\n" +
                    "\t2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기\n" +
                    "\t3. 이전 메뉴로 가기\n" +
                    "\t메뉴 선택 : ");

            int input = new Scanner(System.in).nextInt();

            switch(input)
            {
                case 1:	continueSample.sumJumpThree(); break;
                case 2:	continueSample.rowColJump(); break;
                case 3:	System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
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
        System.out.println("\n총합 : "+tot);
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
