package day02.som.smy;

import jdk.internal.org.objectweb.asm.commons.RemappingAnnotationAdapter;

import java.util.Random;

public class zy14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr_={1,2,3,4,5,6,7,8,9,10};
        int[] arr=new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr_[random.nextInt(10)];
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("新数组所有元素的和为："+sum);
    }
}
