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
            System.out.print("\t*** non-static �޼ҵ� ��� �׽�Ʈ �θ޴� ***\n" +
                    "\n" +
                    "\t1. Scanner Ŭ���� ��� : �ڷ��� �������� �� �Է¹޾� ����ϱ�\n" +
                    "\t2. Date Ŭ���� ��� : ���� ��¥, ���� �ð� ���� ����ϱ�\n" +
                    "\t3. Random Ŭ���� ��� : ������ �Ǽ��� ���� ���� ����ϱ�\n" +
                    "\t4. ���� �޴��� ����\n" +
                    "\t�޴� ���� : ");
            int input = new Scanner(System.in).nextInt();
            switch(input)
            {
                case 1:	nonStaticMethodSample.testScanner(); break;
                case 2:	nonStaticMethodSample.testDate(); break;
                case 3:	nonStaticMethodSample.testRandom(); break;
                case 4:	System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
        System.out.println("���� ���� : " + ranint + "\n�Ǽ� ���� : " + randob);
    }

}
