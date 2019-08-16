package day03.com.smy.kg;

import java.util.Scanner;

public class dd12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a=sc.nextInt();
        ws(a);
    }
    private static int ws(int a){
        int b=0;
        while(a>=1){
            a/=10;
            b++;
        }
        System.out.println("该数是"+b+"位数");
        return b;
    }
}
