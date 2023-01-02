package logic.home.model;

import java.util.Scanner;
import java.util.SortedMap;

public class PrimitiveTypeSample {
    Scanner scanner = new Scanner(System.in);
    public static void subPTypeMenu() {
        PrimitiveTypeSample primitiveTypeSample = new PrimitiveTypeSample();


        do {

            System.out.println("\t*** 기본자료형 테스트 부메뉴 ***\n");
            System.out.println("\t1. 기본자료형 메모리 할당크기 확인하기");
            System.out.println("\t2. 기본자료형 값의 최소값, 최대값 출력하기");
            System.out.println("\t3. 기본자료형 비트갯수 확인하기");
            System.out.println("\t4. 이전 메뉴로 가기");
            System.out.print("\t메뉴 선택 : ");

            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1 : primitiveTypeSample.typeSize();break;
                case 2 : primitiveTypeSample.minMaxValue();break;
                case 3 : primitiveTypeSample.bitSize();break;
                case 4 :{
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                }
                default:{
                    System.out.println("잘못 입력하셨습니다.");
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
