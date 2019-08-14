package day02.som.smy;

import java.util.Random;
import java.util.Scanner;

public class zy16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10个整数");
        int a=sc.nextInt();
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                b++;
            }else if (arr[i]==2){
                c++;
            }else if (arr[i]==3){
                d++;
            }else{
                e++;
            }
        }
        System.out.println("数字1的个数："+b);
        System.out.println("数字2的个数："+c);
        System.out.println("数字3的个数："+d);
        System.out.println("非法数字的个数："+e);

    }
}
