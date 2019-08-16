package day03.com.smy.kg;

import java.util.Scanner;

public class dd11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入起始年份");
        int a=sc.nextInt();
        System.out.println("请输入截止年份");
        int b=sc.nextInt();
        rn(a,b);
    }
    private static void rn(int a,int b){
        for (int i=a;i<b;i++){
            if(i%100==0&&i%400==0) {
                System.out.println(i+"是闰年");
            }else if(i%4==0){
                System.out.println(i+"是闰年");
            }
        }
    }
}
