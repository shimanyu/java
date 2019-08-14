package day02.som.smy;

public class zy1 {
    public static void main(String[] args) {
        int a=0;
        for (int i=1;i<101;i++){
            if(i%2!=0){
                a=a+i;
                System.out.println("累加值为："+a);
            }
        }
        System.out.println("累加值为："+a);
    }
}
