package logic.home.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {

    Scanner scanner = new Scanner(System.in);
    public static void subNonStaticMethodMenu() {
        NonStaticMethodSample nonStaticMethodSample = new NonStaticMethodSample();
        do{
            System.out.print("\t*** non-static 메소드 사용 테스트 부메뉴 ***\n" +
                    "\n" +
                    "\t1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기\n" +
                    "\t2. Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기\n" +
                    "\t3. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기\n" +
                    "\t4. 이전 메뉴로 가기\n" +
                    "\t메뉴 선택 : ");
            int input = new Scanner(System.in).nextInt();
            switch(input)
            {
                case 1:	nonStaticMethodSample.testScanner(); break;
                case 2:	nonStaticMethodSample.testDate(); break;
                case 3:	nonStaticMethodSample.testRandom(); break;
                case 4:	System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }while (true);



    }

    public void testScanner(){
        System.out.print("boolean : ");
        boolean bol = scanner.nextBoolean();
        System.out.print("byte : ");
        byte byt = scanner.nextByte();
        System.out.print("short : ");
        short shty = scanner.nextShort();
        System.out.print("int : ");
        int in = scanner.nextInt();
        System.out.print("long : ");
        long lng = scanner.nextLong();
        System.out.print("float : ");
        float flt = scanner.nextFloat();
        System.out.print("double : ");
        double dbl = scanner.nextDouble();



        System.out.println("boolean : " + bol + "byte : " + byt + " short : "+ shty + " int : "+ in + " long : " + lng + " float : " + flt + " double : " + dbl);

    }
    public void testDate(){
        Date date = new Date();
        String st = date.toString();
        System.out.println(st);



    }
    public void testRandom(){
        int ranint = (int)(Math.random() * 100) +1;
        double randob = Math.random() * 100 + 1;
        System.out.println("정수 난수 : " + ranint + "\n실수 난수 : " + randob);
    }

}
