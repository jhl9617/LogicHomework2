package logic.home.model;

import java.util.Date;
import java.util.Scanner;

public class SwitchSample {

    Scanner scanner = new Scanner(System.in);

    public static void subSwitchMenu() {
        SwitchSample switchSample = new SwitchSample();
        do {
            System.out.println("\t*** switch문 테스트 부메뉴 ***\n" +
                    "\n" +
                    "\t1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기\n" +
                    "\t2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기\n" +
                    "\t3. 이전 메뉴로 가기");
            System.out.print("\t메뉴 선택 : ");

            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1:
                    switchSample.calculator();
                    break;
                case 2:
                    switchSample.fruitPrice();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");

            }
        }while (true);

    }

    public void calculator() {


        System.out.print("첫번째 정수 : ");
        int first = scanner.nextInt();
        System.out.print("두번째 정수 : ");
        int second = scanner.nextInt();
        System.out.print("연산문자(+,-,*,/,%) : ");
        char ch = scanner.next().charAt(0);
        int result = 0;
        switch (ch) {
            case '+': {
                result = first + second;
                break;
            }
            case '-': {
                result = first - second;
                break;
            }
            case '*': {
                result = first * second;
                break;
            }
            case '/': {
                if(second == 0){
                    System.out.println("나누는 문자는 0이 될 수 없습니다.");
                    break;
                }else {
                    result = first / second;
                    break;
                }

            }
            case '%': {
                result = first % second;
                break;
            }
            default:
                System.out.println("연산문자가 잘못 입력 되었습니다.\n확인하고 다시 진행하세요.");
                return;
        }

        System.out.println(first+" " + ch+ " " + second + " = " + result);
    }

    public void fruitPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("과일명 : ");
        String fruitName = sc.next();
        System.out.print("구매 수량 : ");
        int quantity = sc.nextInt();

        int price;
        if (fruitName.equals("사과")) {
            price = 1200;
        } else if (fruitName.equals("배")) {
            price = 2500;
        } else if (fruitName.equals("포도")) {
            price = 5000;
        } else if (fruitName.equals("오렌지")) {
            price = 700;
        } else {
            if (!fruitName.equals("키위")) {
                System.out.println("품절되었습니다.");
                return;
            }

            price = 500;
        }

        System.out.println(fruitName + " : " + price + "원, " + quantity + "개 => 구매가격 : " + quantity * price + "원");
    }

}
