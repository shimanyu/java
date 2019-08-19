package day04.com.smy;

public class person {
    private String name;
    private String age;
    public person() {
    }
    public void person(String name,String age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }
}
