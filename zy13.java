package day02.som.smy;

import java.util.Scanner;

public class zy13 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入第一位评委的评分：");
        int a= scanner.nextInt();
        System.out.println("请输入第一位评委的评分：");
        int b= scanner.nextInt();
        System.out.println("请输入第一位评委的评分：");
        int c= scanner.nextInt();
        System.out.println("请输入第一位评委的评分：");
        int d= scanner.nextInt();
        System.out.println("请输入第一位评委的评分：");
        int e= scanner.nextInt();
        System.out.println("请输入第一位评委的评分：");
        int f= scanner.nextInt();
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;
        arr[5]=f;
        int min=arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (a>=arr[i]){
                min=arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (a<=arr[i]){
                max=arr[i];
            }
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        double pj=(sum-min-max)/(arr.length-2);
        System.out.println("去掉一个最高分和一个最低分后 的4个评委平均值为："+pj);
    }
}
