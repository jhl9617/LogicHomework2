package logic.home.model;
//��
import java.util.Scanner;

public class ForSample {

    Scanner scanner = new Scanner(System.in);

    public static void subForMenu() {
        ForSample forSample = new ForSample();
        do {
            System.out.println("\t*** for�� �׽�Ʈ �θ޴� ***\n" +
                    "\n" +
                    "\t1. 1~10���� �������� �հ� ���ϱ�\n" +
                    "\t2. 1~100������ ¦������ �հ� ���ϱ�\n" +
                    "\t3. ���� �ϳ� �Է¹޾�, �� ���� ������ ����ϱ�\n" +
                    "\t4. �� ���� ������ �Է¹޾�, �� ���� ���� ������ ū �������� �հ� ���ϱ�\n" +
                    "\t5. �ټ��� ĭ�� �Է¹޾�, �Էµ� �ټ�/ĭ����ŭ ��ǥ���� ����ϱ�\n" +
                    "\t6. 7�ٿ� 7ĭ�� ��ǥ���� ����ϵ�, �� �ٿ� �ٹ�ȣ�� ���� ĭ�� ���� ����ϱ�\n" +
                    "\t7. �ټ��� �Է¹޾�, �ﰢ�� ������� ��ǥ���� ����ϱ�(���:�����ﰢ��, ����:���ﰢ��)\n" +
                    "\t8. ������ 2�ܺ��� 9�ܱ��� ����ϱ�\n" +
                    "\t9. ���� �޴��� ����");
            System.out.print("\t�޴� ���� : ");

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
                    System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            }


        }while(true);
    }


    public void sum1To10() {
        int tot = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            tot += i;
        }
        System.out.println("�հ� : "+tot);
    }
    public void sumEven1To100() {
        int tot = 0;
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
            tot += i;
        }
        System.out.println("�հ� : " + tot);
    }
    public void oneGugudan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է� : ");
        int a = sc.nextInt();
        for(int i = 1; i < 10;i++){
            System.out.println(a + " * " + i + " = " + (i * a));
        }
    }

    public void sumMinToMax() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ù��° ���� : ");
        int first = sc.nextInt();
        System.out.print("�ι�° ���� : ");
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
        System.out.print("ù��° ���� : ");
        int a = sc.nextInt();
        System.out.print("�ι�° ���� : ");
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
        System.out.print(" �ټ� �Է� : ");
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
