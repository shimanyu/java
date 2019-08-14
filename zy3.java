package day02.som.smy;
import java.util.Scanner;
public class zy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数:");
        int s = scanner.nextInt();
        int a = 0;
        int b = s % 10;
        int c = (s / 10) % 10;
        int d = s / 100;
        for (int i = 100; i < 1000; i++) {
            if (b != 7 & c != 5 & d != 3) {
                a = a + i;
            }
        }
        System.out.println("满足条件的数字之和为："+a);
    }
}
