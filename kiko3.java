package day04.com.smy;

public class kiko3 {
    public static void main(String[] args) {
        kiko1 student=new kiko1();
        kiko2 teacher=new kiko2();
        teacher.setName("周志鹏");
        teacher.setAge("30");
        teacher.setContent("Java基础中面向对象的知识");
        teacher.eat();
        teacher.speek();
        student.setAge("18");
        student.setName("韩光");
        student.setContent("面向对象的知识");
        student.eat();
        student.study();

    }
}
