package day04.com.smy;

public class kiko2 {
    private String name;
    private String age;
    private String content;

    public kiko2(){
    }
    public void kiko2(String name,String age,String content){
        this.name=name;
        this.age=age;
        this.content=content;
    }
    public void eat() {
        System.out.println("年龄为"+age+"的"+name+"老师正在吃饭");
    }
    public void speek() {
        System.out.println("年龄为"+age+"的"+name+"老师正在"+content);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getAge(){
        return age;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getContent(){
        return content;
    }
}
