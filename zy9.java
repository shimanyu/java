package day02.som.smy;

public class zy9 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int a=arr[0];
        for(int i=1;i<arr.length;i++){
            if(a>=arr[i]){
                a=arr[i];
            }
        }
        System.out.println("最小值为："+a);
    }
}


