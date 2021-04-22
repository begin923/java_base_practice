package objectDemo;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.age = 18;
        p1.addAge(2);
        p1.showAge();

        p2.addAge(10);
        p2.showAge();
    }
}

class Person{

    String name;
    int age;
    int sex;

    public void study(){
        System.out.println("Studying");
    }

    public void showAge(){
        System.out.println("age:" + age);
    }

    public int addAge(int i){
        age += i ;
        return age;
    }
}
