package inherit.demo1;

public class KidTest {
    public static void main(String[] args) {
        Kids kids = new Kids(12);
//        ManKind kids1 = new Kids();

        kids.printAge();
        kids.setSalary(1);
        kids.setSex(1);
//        kids.employeed();
        kids.manOrWoman();



    }
}
