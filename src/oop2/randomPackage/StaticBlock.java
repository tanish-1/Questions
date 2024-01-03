package oop2.randomPackage;

public class StaticBlock {
        static int a = 4;
        static int b;
//        will only run once , when the first obj is created
        static {
            System.out.println("this is static block");
            b = a + 5;
        }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
