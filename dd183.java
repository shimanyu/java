package day03.com.smy.kg;

public class dd183 {
    public static void main(String[] args) {
        dd181 teacher = new dd181();
        dd182 student = new dd182();
        teacher.setName("周志鹏");
        teacher.setAge(30);
        teacher.setContent("Java基础中面向对象的知识");
        teacher.eat();
        teacher.speak();
        student.setAge(18);
        student.setName("韩光");
        student.setContent("面向对象的知识");
        student.eat();
        student.study();
    }
}
