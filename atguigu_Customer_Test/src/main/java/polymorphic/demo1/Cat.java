package polymorphic.demo1;

public class Cat extends Animal {

    String id = "1002";

    public Cat() {
    }

    public Cat(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("猫 吃鱼");
    }

    public void show(){
        System.out.println("猫 喵喵喵");
    }
}
