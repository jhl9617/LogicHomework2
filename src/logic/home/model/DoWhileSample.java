package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {
    Scanner scanner = new Scanner(System.in);

    int[] menu = {3500, 3200, 1000, 400, 2000, 700, 1200, 1000};
    int[] era = {0, 0, 0, 0, 0, 0, 0, 0};
    String[] name = {"불고기버거", "치킨버거", "감자튀김", "치즈스틱", "샐러드", "콜라", "에이드", "커피"};

    public static void subDoWhileMenu() {
        DoWhileSample doWhileSample = new DoWhileSample();


        do {

            System.out.print(
                    "\t*** do~while문 테스트 부메뉴 ***\n" +
                    "\n" +
                    "\t1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기\n" +
                    "\t2. 버거킹 메뉴 주문 테스트\n" +
                    "\t3. 문자열 입력받아, \"모든 글자 영문자다\"/\"영문자 아니다.\" 출력하기\n" +
                    "\t4. 이전 메뉴로 가기\n" +
                    "\t메뉴 선택 : ");
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
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                }
                default: {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
        } while (true);

    }

    public void addDashToken() {
        System.out.print("문자열 : ");
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
            System.out.println("\t*** 메뉴를 선택하세요 ***\n");
            System.out.println("\t햄버거 ***************");
            System.out.println("\t1. 불고기버거\t3500원");
            System.out.println("\t2. 치킨버거\t3200원");
            System.out.println("\t추가 ****************");
            System.out.println("\t3. 감자튀김\t1000원");
            System.out.println("\t4. 치즈스틱\t400원");
            System.out.println("\t5. 샐러드\t\t2000원");
            System.out.println("\t음료수 ***************");
            System.out.println("\t6. 콜라\t\t700원");
            System.out.println("\t7. 에이드\t\t1200원");
            System.out.println("\t8. 커피\t\t1000원");
            System.out.println("\t********************");
            System.out.print("메뉴 선택 : ");
            int input = scanner.nextInt();
            menunum(input - 1);
            System.out.print("추가 주문하시겠습니까?(n) : ");
            char brk = scanner.next().toUpperCase().charAt(0);
            if (brk == 'N') break;
        }
        System.out.println("\t주문하신 정보는 다음과 같습니다.\n\t------------------------");
        int tot = 0;
        for (int i = 0; i < 8; i++) {
            if (era[i] > 0) {
                System.out.println(name[i] + " : " + era[i] + "개 - " + menu[i] * era[i]);
                tot += menu[i] * era[i];
            }
        }
        System.out.println("총 가격 : " + tot + "원");


    }

    public boolean isStringAlphabet() {

        System.out.print("문자열 입력 : ");
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
                System.out.println("영문자가 아닙니다.");
            } else {
                System.out.println("영문자 입니다.");
            }
        }
        return false;
    }


    public void menunum(int num) {
        if (num < 8 && num > -1) {
            System.out.println(name[num] + "를(을) 선택하셨습니다\n수량은? :");
            era[num] = scanner.nextInt();
        }


    }


}
