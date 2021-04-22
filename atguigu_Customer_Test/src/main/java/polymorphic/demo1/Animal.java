package polymorphic.demo1;

public class Animal {

    String id = "1001";

    public Animal() {
    }

    public Animal(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("动物吃东西");
    }

    public void show(){
        System.out.println("动物叫 ");
    }

}
