package logic.home.model;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class WhileSample {

    Scanner scanner = new Scanner(System.in);

    public static void subWhileMenu() {
        WhileSample whileSample = new WhileSample();

        do {
            System.out.println("\t*** while문 테스트 부메뉴 ***\n" +
                    "\n" +
                    "\t1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)\n" +
                    "\t2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)\n" +
                    "\t3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기\n" +
                    "\t4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기\n" +
                    "\t5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기\n" +
                    "\t6. 이전 메뉴로 가기");
            System.out.print("\t메뉴 선택 : ");
            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1 : whileSample.printUniCode();break;
                case 2 : whileSample.sum1To100();break;
                case 3 : whileSample.numberGame();break;
                case 4 : whileSample.countCharacter();break;
                case 5 : whileSample.countInChar();break;
                case 6 :
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }



        }while (true);
    }

    public void printUniCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        char ch = sc.next().charAt(0);

        while (ch != '0') {
            System.out.println(ch + " is unicode " + (int) ch);

            System.out.print("문자 입력 : ");
            ch = sc.next().charAt(0);

        }
        System.out.println("--- The End ---");
    }

    public void sum1To100() {

        int tot = 0;
        int ind = 1;
        while(ind < 101){
            tot += ind;
            ind++;
        }
        System.out.println("1 to 100 : "+ tot);
    }
    public void numberGame() {

        int ran = (int)(Math.random() * 100) + 1;
        while (true) {
            System.out.print("정답은?(0:종료) : ");

            int input = scanner.nextInt();
            if(input == 0)break;
            if (input == ran) {
                System.out.println("정답입니다.");
                return;
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }
    public void countCharacter() {
        System.out.print("문자열 :");
        String st = scanner.next();
        System.out.println("문자열 개수 : " + st.length());

    }
    public void countInChar() {

        int sum = 0, index = 0;
        System.out.println("문자열 입력 : ");
        String str = scanner.next();
        char[] arrary = str.toCharArray();

        System.out.println("문자 입력 : ");
        char ch = scanner.next().charAt(0);

        while (index < arrary.length) {
            if (arrary[index] == ch) sum++;
            index++;
        }
        System.out.println(str + "에 포함된 " + ch + "의 갯수는 " + sum + "개 입니다.");
    }




}
