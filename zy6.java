package day02.som.smy;

import java.util.Random;
import java.util.Scanner;

public class zy6 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int a=sc.nextInt();
        while(true){
        if(number<a){
            System.out.println("你猜的数据大了");
        }else if(number>a){
            System.out.println("你猜的数据小了");
        }else if(number==a){
            System.out.println("恭喜你猜中了");
        }
    }
    }
}
