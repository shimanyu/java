package day04.com.smy;

public class gg1 {
    private String color;
    private String breed;

    public  gg1(){
    }
    public gg1(String color,String breed){
        this.color=color;
        this.breed=breed;
    }
    public void eat(){

        System.out.println(color+"的"+breed+"在啃骨头");
    }

    public void lookhome(){
        System.out.println(color+"的"+breed+"在看家");
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }

}
