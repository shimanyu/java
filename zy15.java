package day02.som.smy;

import java.util.Random;
import java.util.Scanner;

public class zy15 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数");
        int a=sc.nextInt();
        int[] arr=new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(101);
        }
        int count=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if (arr[i]<60){
                count++;
            }
        }
        System.out.println("不及格人数："+count);
        System.out.println("班级平均分："+sum/arr.length);
    }
}
