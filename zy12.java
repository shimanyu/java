package day02.som.smy;

import java.util.Random;
import java.util.Scanner;

public class zy12 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入数组长度");
        int a= scanner.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(11);
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]>5&&arr[i]%2==0){
                System.out.println("数组中所有大于5且为偶数色元素为："+arr[i]);
            }
        }
    }
}
