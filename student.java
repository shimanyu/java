package day04.com.smy;

public class student extends person {
    private String name;
    private String age;
    public student() {
    }
    public void student(String name,String age){
        this.name=name;
        this.age=age;
    }
    //@Override
    public void study(){
        System.out.println("学生的工作是要好好学习");
    }
}

