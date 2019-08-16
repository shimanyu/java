package day04.com.smy;
//作业3的19题
public class gg {
    private String color;
    private String breed;

    public  gg(){
    }
    public gg(String color,String breed){
        this.color=color;
        this.breed=breed;
    }
    public void eat(){
        System.out.println(color+"的"+breed+"在吃鱼");
    }

    public void catchmouse(){
        System.out.println(color+"的"+breed+"在吃鱼");
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
