package day03.com.smy.kg;

import java.util.Scanner;

public class dd5 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 20, 60};
        int key=20;
        count(arr,key);
    }
    private static void count(int[] arr,int key){
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                s++;
            }
        }
        System.out.println(key+"一共出现了"+s+"次");
    }
}
