package day03.com.smy.kg;

import java.util.Scanner;

public class dd9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入长方形的长");
        int chang=sc.nextInt();
        System.out.println("请输入长方形的宽");
        int kuan=sc.nextInt();
        System.out.println("请输入圆的半径");
        int banjing=sc.nextInt();
        int zhouchang=zc(chang,kuan);
        int mianji=mj(chang,kuan);
        double yzc=Yzc(banjing);
        double ymj=Ymj(banjing);
        System.out.println("长方形周长"+zhouchang);
        System.out.println("长方形面积"+mianji);
        System.out.println("圆周长"+yzc);
        System.out.println("圆面积"+ymj);

    }
    private static int zc(int chang,int kuan){
        int a=2*(chang+kuan);
        return a;
    }
    private static int mj(int chang,int kuan) {
        int b = chang*kuan;
        return b;
    }
    private static double Yzc(int banjing){
        double c=2*3.14*banjing;
        return c;
    }
    private static double Ymj(int banjing){
        double d=3.14*banjing*banjing;
        return d;
    }
}
