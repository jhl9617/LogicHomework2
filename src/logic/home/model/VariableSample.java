package logic.home.model;

import java.util.Scanner;

public class VariableSample {
    Scanner scanner = new Scanner(System.in);
    public static void subVarMenu() {
        VariableSample variableSample = new VariableSample();

        do {
            System.out.println("\t*** 변수 테스트 부메뉴 ***\n");
            System.out.println("\t1. 내 신상정보 변수에 담아 출력하기");
            System.out.println("\t2. 사원정보를 키보드로 입력받아 출력하기");
            System.out.println("\t3. 기본 자료형 변수의 초기값 확인하기");
            System.out.println("\t4. 이전 메뉴로 가기");
            System.out.print("\t메뉴 선택 : ");

            int input = new Scanner(System.in).nextInt();
            switch (input){
                case 1: variableSample.myProfile();break;
                case 2: variableSample.empInformation();break;
                case 3: variableSample.defaultValue();break;
                case 4:{
                    System.out.println("이전 메뉴로 돌아갑니다.");
                    return;
                }
                default:{
                    System.out.println("잘못 입력 하셨습니다.");
                }
            }
        } while(true);



    }

    public void myProfile() {
        String name;
        int age;
        double height;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        name = sc.next();
        System.out.print("나이 : ");
        age = sc.nextInt();
        System.out.print("키 : ");
        height = sc.nextDouble();

        if (!name.isEmpty() && name.length() > 0 && age > 0 && height > 0) {
            System.out.println(name + "의 나이는 " + age + "세 이고, 키는 " + height + "cm 이다.");

        }
    }
    public void empInformation() {

        System.out.print("사번 : ");
        String empId = scanner.next();

        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("나이 : ");
        int age = scanner.nextInt();
        System.out.print("성별(남/여) : ");
        char gender = scanner.next().charAt(0);
        System.out.print("월급 : ");
        double salary = scanner.nextDouble();

        System.out.println("["+ empId+"번, "+age + "세, " + salary + "원, " + gender + "자, " + name + "님]");



    }
    public void defaultValue() {

        boolean bol = false;
        char ch = (int)0;
        byte bty = 0;
        short sht = 0;
        int in = 0;
        long lng = 0L;
        float flt = 0.0f;
        double dbl = 0.0;
        String st = null;


        System.out.println("boolean : " + bol);
        System.out.println("char : " + ch);
        System.out.println("byte : " + bty);
        System.out.println("short : " + sht);
        System.out.println("int : " + in);
        System.out.println("long : " + lng);
        System.out.println("float : " + flt);
        System.out.println("double : " + dbl);
        System.out.println("String : " + st);
    }




}
