package day02.som.smy;

import java.util.Scanner;

public class zy4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入1-5：");
        int a=sc.nextInt();
        while(a==1){
            switch (a){
                case 1:
                    System.out.println("新建");
                    break;
                case 2:
                    System.out.println("打开文件");
                    break;
                case 3:
                    System.out.println("保存");
                    break;
                case 4:
                    System.out.println("刷新");
                    break;
                case 5:
                    System.out.println("退出");
                    return;



            }
        }

    }
}
