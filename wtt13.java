package day01.com.smy;
import java.util.Scanner;
public class wtt13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入月份:");
        int a = scanner.nextInt();
        if(a>=3&a<=5){
            System.out.println(a+"月份"+"是春季");
        }
        else if(a>=6&a<=8){
            System.out.println(a+"月份"+"是夏季");
        }
        else if(a>=9&a<=11){
            System.out.println(a+"月份"+"是秋季");
        }
        else{
            System.out.println(a+"月份"+"是冬季");
        }
    }
}
