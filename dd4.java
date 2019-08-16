package day03.com.smy.kg;

import java.util.Scanner;

public class dd4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n=sc.nextInt();
        out(n);
    }
    public static void out(int n){
        if(n>=90&&n<=100){
            System.out.println("A");
        }else if(n>=80&&n<90){
            System.out.println("B");
        }else if(n>=70&&n<80){
            System.out.println("C");
        }else if(n>=60&&n<70){
            System.out.println("D");
        }else if(n>=0&&n<60){
            System.out.println("E");
        }else{
            System.out.println("F");
        }
    }
}
