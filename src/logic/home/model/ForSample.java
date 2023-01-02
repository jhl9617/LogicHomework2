package logic.home.model;
//끝
import java.util.Scanner;

public class ForSample {

    Scanner scanner = new Scanner(System.in);

    public static void subForMenu() {
        ForSample forSample = new ForSample();
        do {
            System.out.println("\t*** for문 테스트 부메뉴 ***\n" +
                    "\n" +
                    "\t1. 1~10까지 정수들의 합계 구하기\n" +
                    "\t2. 1~100사이의 짝수들의 합게 구하기\n" +
                    "\t3. 정수 하나 입력받아, 그 수의 구구단 출력하기\n" +
                    "\t4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기\n" +
                    "\t5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기\n" +
                    "\t6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기\n" +
                    "\t7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)\n" +
                    "\t8. 구구단 2단부터 9단까지 출력하기\n" +
                    "\t9. 이전 메뉴로 가기");
            System.out.print("\t메뉴 선택 : ");

            int input = new Scanner(System.in).nextInt();
            switch (input){
                case 1: forSample.sum1To10();break;
                case 2: forSample.sumEven1To100();break;
                case 3 : forSample.oneGugudan();break;
                case 4 : forSample.sumMinToMax();break;
                case 5 : forSample.printStar();break;
                case 6 : forSample.printNumberStar();break;
                case 7 : forSample.printTriangleStar();break;
                case 8 : forSample.guguDan();break;
                case 9 :
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }


        }while(true);
    }


    public void sum1To10() {
        int tot = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            tot += i;
        }
        System.out.println("합계 : "+tot);
    }
    public void sumEven1To100() {
        int tot = 0;
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
            tot += i;
        }
        System.out.println("합계 : " + tot);
    }
    public void oneGugudan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int a = sc.nextInt();
        for(int i = 1; i < 10;i++){
            System.out.println(a + " * " + i + " = " + (i * a));
        }
    }

    public void sumMinToMax() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int second = sc.nextInt();

        int max, min;

        if(first > second) {
            max = first;
            min = second;
        }else {
            max = second;
            min = first;
        }

        int sum = 0;
        for(int k = min; k <= max; k++) {
            sum += k;
            if(k == max)
                System.out.print(k + "=");
            else
                System.out.print(k + "+");
        }

        System.out.println(sum);
    }
    public void printStar() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int b = sc.nextInt();
        for(int i = 0;i < a; i++){
            for (int j = 0; j < b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printNumberStar() {
        for(int i =0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if(i == j ) System.out.print(j+1);
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printTriangleStar() {
        System.out.print(" 줄수 입력 : ");
        int num = scanner.nextInt();
        if( num !=0){
            if(num > 0){
                for(int i = 1; i < num+2; i++){
                    for(int j = 1; j < num+1; j++){
                        if(i > j){
                            System.out.print("*");
                        }else {
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
            }else {
                for(int i = 1; i < -num+2; i++){
                    for(int j = 1; j < -num+1; j++){
                        if(i > j){
                            System.out.print("");
                        }else {
                            System.out.print("*");
                        }

                    }
                    System.out.println();
                }
            }

        }
    }
    public void guguDan() {
        int dan = 2;

        for(dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));

            }
            System.out.println("***********");
        }
    }

}
