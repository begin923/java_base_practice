package polymorphic.demo1;

public class Dog extends Animal {

    String id = "1003";

    public Dog() {
    }

    public Dog(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("狗 吃 骨头");
    }

    public void show(){
        System.out.println("狗 汪汪汪");
    }
}
