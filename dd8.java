package day03.com.smy.kg;

public class dd8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int b = max(arr);
        System.out.println("这个数组中最大元素的索引值为："+b);
    }

    private static int max(int[] arr) {
        int a=arr[0];
        int b=0;
        for (int i = 1; i < arr.length; i++) {
            if (a < arr[i]) {
                 b= i;

            }

        }
        return b;
    }
}
