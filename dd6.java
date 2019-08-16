package day03.com.smy.kg;

import java.util.Scanner;

public class dd6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 6};
        int key=2;
        suoyin(arr,key);
    }
    private static void suoyin(int[] arr,int key){
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == key) {
                System.out.println(i + " ");
                count++;
            }


        }
        if(count==0) {
            System.out.println("数组中没有这个数字");
        }
    }
}
