package logic.home.model;

import java.util.Scanner;
import java.util.SortedMap;

public class PrimitiveTypeSample {
    Scanner scanner = new Scanner(System.in);
    public static void subPTypeMenu() {
        PrimitiveTypeSample primitiveTypeSample = new PrimitiveTypeSample();


        do {

            System.out.println("\t*** �⺻�ڷ��� �׽�Ʈ �θ޴� ***\n");
            System.out.println("\t1. �⺻�ڷ��� �޸� �Ҵ�ũ�� Ȯ���ϱ�");
            System.out.println("\t2. �⺻�ڷ��� ���� �ּҰ�, �ִ밪 ����ϱ�");
            System.out.println("\t3. �⺻�ڷ��� ��Ʈ���� Ȯ���ϱ�");
            System.out.println("\t4. ���� �޴��� ����");
            System.out.print("\t�޴� ���� : ");

            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1 : primitiveTypeSample.typeSize();break;
                case 2 : primitiveTypeSample.minMaxValue();break;
                case 3 : primitiveTypeSample.bitSize();break;
                case 4 :{
                    System.out.println("���� �޴��� ���ư��ϴ�.");
                    return;
                }
                default:{
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
                }
            }
        } while(true);
    }

    public void typeSize(){
        System.out.println("(byte)");
        System.out.println("Byte : " +Byte.SIZE /8);
        System.out.println("short : " +Short.SIZE/8);
        System.out.println("Int : " +Integer.SIZE/8);
        System.out.println("Char : " +Character.SIZE/8);
        System.out.println("Float : " +Float.SIZE/8);
        System.out.println("Double : " +Double.SIZE/8);
    }

    public void minMaxValue(){
        System.out.println("Byte : " +Byte.MIN_VALUE+ " ~ "+Byte.MAX_VALUE);
        System.out.println("Short : " +Short.MIN_VALUE+ " ~ "+Short.MAX_VALUE);
        System.out.println("Int : " +Integer.MIN_VALUE+ " ~ "+Integer.MAX_VALUE);
        System.out.println("Char : " +Character.MIN_VALUE+ " ~ "+Character.MAX_VALUE);
        System.out.println("Float : " +Float.MIN_VALUE+ " ~ "+Float.MAX_VALUE);
        System.out.println("Double : " +Double.MIN_VALUE+ " ~ "+Double.MAX_VALUE);
    }

    public void bitSize() {
        System.out.println("(bit)");
        System.out.println("Byte : " +Byte.SIZE );
        System.out.println("short : " +Short.SIZE);
        System.out.println("Int : " +Integer.SIZE);
        System.out.println("Char : " +Character.SIZE);
        System.out.println("Float : " +Float.SIZE);
        System.out.println("Double : " +Double.SIZE);

    }


}
