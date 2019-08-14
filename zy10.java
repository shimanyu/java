package day02.som.smy;

import java.util.Random;

public class zy10 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr=new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(10);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
