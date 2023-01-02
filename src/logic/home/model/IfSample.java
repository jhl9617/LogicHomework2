package logic.home.model;

import java.util.Scanner;
import java.util.SortedMap;

public class IfSample {
    Scanner scanner = new Scanner(System.in);

    public static void subIfMenu() {
        IfSample ifSample = new IfSample();
        do {
            System.out.println("\t*** if문 테스트 부메뉴 ***\n" +
                    "\n" +
                    "\t1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기\n" +
                    "\t2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기\n" +
                    "\t3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기\n" +
                    "\t4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기\n" +
                    "\t5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기\n" +
                    "\t6. 점수를 입력받아, 학점 확인하기\n" +
                    "\t7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기\n" +
                    "\t8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기\n" +
                    "\t9. 이전 메뉴로 가기");
            System.out.print("\t메뉴 선택 : ");

            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1:
                    ifSample.maxNumber();
                    break;
                case 2:
                    ifSample.minNumber();
                    break;
                case 3:
                    ifSample.threeMaxMin();
                    break;
                case 4:
                    ifSample.checkEven();
                    break;
                case 5:
                    ifSample.isPassFail();
                    break;
                case 6:
                    ifSample.scoreGrade();
                    break;
                case 7:
                    ifSample.checkPlusMinusZero();
                    break;
                case 8:
                    ifSample.whatCaracter();
                    break;
                case 9: {
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                }
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }while (true) ;


    }

    public void maxNumber() {
        System.out.print(" 첫번째 정수 : ");
        int first = scanner.nextInt();
        System.out.print(" 두번째 정수 : ");
        int second = scanner.nextInt();

        System.out.println(Math.max(first,second));

    }
    public void minNumber() {
        System.out.print(" 첫번째 정수 : ");
        int first = scanner.nextInt();
        System.out.print(" 두번째 정수 : ");
        int second = scanner.nextInt();

        System.out.println(Math.min(first,second));
    }
    public void threeMaxMin() {
        System.out.print(" 첫번째 정수 : ");
        int first = scanner.nextInt();
        System.out.print(" 두번째 정수 : ");
        int second = scanner.nextInt();
        System.out.print(" 세번째 정수 : ");
        int third = scanner.nextInt();

        System.out.println("최대 : " +Math.max(third,Math.max(first,second)));
        System.out.println("최소 : " +Math.min(third,Math.min(first,second)));
    }
    public void checkEven() {
        System.out.print("정수 : ");
        int first = scanner.nextInt();
        if (first == 0) {
            System.out.println("0입니다.");
            return;
        }
        if(first % 2 == 0){
            System.out.println("짝수입니다.");
        }else if (first % 2 == 1){
            System.out.println("홀수입니다.");
        }
    }
    public void isPassFail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int mat = sc.nextInt();
        int tot = kor + eng + mat;
        double avg = tot / 3.0;

        if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
            System.out.println("합격");
        }else {
            System.out.println("불합격");
        }
    }
    public void scoreGrade() {
        System.out.print("정수 : ");
        int a = scanner.nextInt();
        char ch;
        if (a > 0) {
            if( a >= 90) {
                ch = 'A';
            }else if(a >= 80) {
                ch = 'B';
            }else if(a >= 70) {
                ch = 'C';
            }else if(a >= 60) {
                ch = 'D';
            }else {
                ch = 'F';
            }
            System.out.println("점수 : " + a + " \n학점 : " + ch);
        }
    }
    public void checkPlusMinusZero() {
        System.out.print("정수 : ");
        int input = scanner.nextInt();
        if(input > 0){
            System.out.println("양수입니다.");
        }else if(input < 0){
            System.out.println("음수입니다.");
        }else System.out.println("0입니다.");
    }
    public void whatCaracter() {
        System.out.print("문자1개 : ");
        char ch = scanner.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("영어 대문자입니다.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("영어 소문자입니다.");
        }else if(Character.isDigit(ch)){
            System.out.println("숫자입니다.");
        }else System.out.println("기타 문자입니다.");

    }



}
