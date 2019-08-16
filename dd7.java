package day03.com.smy.kg;

public class dd7 {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        int[] arr = new int[4];
        arr = yunsuan(a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    private static int[] yunsuan(int a, int b){
        int[] arr = new int[4];
        arr[0]=a+b;
        arr[1]=a-b;
        arr[2]=a*b;
        arr[3]=a/b;
        return arr;
    }
}
