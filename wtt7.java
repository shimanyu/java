package day01.com.smy;
import java.util.Scanner;
public class wtt7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入小明左手中的牌:");
        int a = scanner.nextInt();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("请输入小明右手中的牌:");
        int b = scanner1.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("互换后小明左手中的牌为:"+a);
        System.out.println("互换后小明右手中的牌为:"+b);
    }
}
