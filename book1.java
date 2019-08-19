package day04.com.smy;

public class book1 {
    private String id;
    private String name;
    private String price;

    public book1(){
    }
    public void book1(String id,String name,String price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    public void setId(String id){
        this.id=id;
    }

    public String getId() {
        return id;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void setPrice(String price){
        this.price=price;
    }

    public String getPrice() {
        return price;
    }

}
