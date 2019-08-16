package day03.com.smy.kg;

import java.util.Scanner;

public class dd1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个大于3的数");
        int n=sc.nextInt();
        out(n);
    }
    public static void out(int n){
        for (int i=0;i<=n;i++)
            if(i%2==0){
               System.out.println(i+" ");
        }
   }
}
