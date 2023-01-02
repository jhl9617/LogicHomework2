package logic.home.model;

import java.util.Scanner;

public class VariableSample {
    Scanner scanner = new Scanner(System.in);
    public static void subVarMenu() {
        VariableSample variableSample = new VariableSample();

        do {
            System.out.println("\t*** ���� �׽�Ʈ �θ޴� ***\n");
            System.out.println("\t1. �� �Ż����� ������ ��� ����ϱ�");
            System.out.println("\t2. ��������� Ű����� �Է¹޾� ����ϱ�");
            System.out.println("\t3. �⺻ �ڷ��� ������ �ʱⰪ Ȯ���ϱ�");
            System.out.println("\t4. ���� �޴��� ����");
            System.out.print("\t�޴� ���� : ");

            int input = new Scanner(System.in).nextInt();
            switch (input){
                case 1: variableSample.myProfile();break;
                case 2: variableSample.empInformation();break;
                case 3: variableSample.defaultValue();break;
                case 4:{
                    System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                }
                default:{
                    System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
                }
            }
        } while(true);



    }

    public void myProfile() {
        String name;
        int age;
        double height;
        Scanner sc = new Scanner(System.in);
        System.out.print("�̸� : ");
        name = sc.next();
        System.out.print("���� : ");
        age = sc.nextInt();
        System.out.print("Ű : ");
        height = sc.nextDouble();

        if (!name.isEmpty() && name.length() > 0 && age > 0 && height > 0) {
            System.out.println(name + "�� ���̴� " + age + "�� �̰�, Ű�� " + height + "cm �̴�.");

        }
    }
    public void empInformation() {

        System.out.print("��� : ");
        String empId = scanner.next();

        System.out.print("�̸� : ");
        String name = scanner.next();
        System.out.print("���� : ");
        int age = scanner.nextInt();
        System.out.print("����(��/��) : ");
        char gender = scanner.next().charAt(0);
        System.out.print("���� : ");
        double salary = scanner.nextDouble();

        System.out.println("["+ empId+"��, "+age + "��, " + salary + "��, " + gender + "��, " + name + "��]");



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
