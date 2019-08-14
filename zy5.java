package day02.som.smy;

import java.util.Scanner;

public class zy5 {
    public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            int b = i % 10;
            int c = (i / 10) % 10;
            int d = i / 100;
            int g=b*b*b+c*c*c+d*d*d;
            if (g==i&&g%2==0){

                System.out.println(i+"");
            }else if(g==i&&g%2==1){
                System.out.println(i+"");
            }


        }
    }
}
