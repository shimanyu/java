package day03.com.smy.kg;

import java.util.Random;

public class dd2 {
    public static void main(String[] args) {
        Random r = new Random();
        int a=r.nextInt(100)+1;
        int b=r.nextInt(100)+1;
        int c=sum(a,b);
        System.out.println(c);

    }
    private static int sum(int a,int b){
        System.out.println(a+"\t"+b);
        int c=a+b;
        return c;
    }
}
