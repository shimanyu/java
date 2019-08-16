package day03.com.smy.kg;

public class dd16 {
    private String id;
    private String name;
    private String sex;
    private double high;
    private int age;

    public dd16(){}


    public dd16 (String id,String name,String sex,double high,int age) {
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.high=high;
        this.age=age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }
    public void setHigh(double high) {
        this.high = high;
    }
    public double getHigh() {
        return high;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }






}
