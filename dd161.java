package day03.com.smy.kg;

import java.util.Scanner;

public class dd161 {
    public static void main(String[] args) {
        /**dd16 qwe = new dd16();
        qwe.setId("123456");
        qwe.setName("张三");
        qwe.setAge(18);
        qwe.setHigh(179.23);
        qwe.setSex("男");
        System.out.println(qwe.getId()+" "+qwe.getName()+" "+qwe.getSex()+"  "+qwe.getHigh()+" "+qwe.getAge());
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学员编号");
        String id=scanner.next();
        System.out.println("请输入学员姓名");
        String name=scanner.next();
        System.out.println("请输入学员性别");
        String sex=scanner.next();
        System.out.println("请输入学员身高");
        double high=scanner.nextDouble();
        System.out.println("请输入学员年龄");
        int age=scanner.nextInt();

        dd16 dd161=new dd16(id,name,sex,high,age);
         System.out.println(dd161.getId()+" "+dd161.getName()+" "+dd161.getSex()+"  "+dd161.getHigh()+" "+dd161.getAge());


    }
}
