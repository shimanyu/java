package day04.com.smy;

public class Teacher extends person {
    private String name;
    private String age;
    public Teacher() {
    }
    public void Teacher(String name,String age){
        this.name=name;
        this.age=age;
    }
    public void speak(){
        System.out.println("老师的工作是要好好讲课");
    }
}
