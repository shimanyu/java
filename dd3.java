package day03.com.smy.kg;


public class dd3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int b=arr[0];
        min(arr,b);
        System.out.println(b);

    }

    private static void min(int[] arr,int b) {
        for (int i = 1; i < arr.length; i++) {
            if (b > arr[i]) {
                b = arr[i];
            }
        }
        System.out.println("最小值为："+b);
    }

}



