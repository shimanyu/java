package day01.com.smy;

public class wtt6 {
    public static void main(String[] args) {
        int a=85;
        if (a<60){
            System.out.println("不及格");
        }else if (a>=60&a<70){
            System.out.println("及格");
        }else if (a>=70&a<80){
            System.out.println("良");
        }else if (a>=80&a<90){
            System.out.println("好");
        }else{
            System.out.println("优秀");
        }
    }
}
