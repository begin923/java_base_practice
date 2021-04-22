package objectDemo;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.findArea(2));
    }
}

class Circle{
//    double radius;

    // 求圆面积
    public double findArea(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }
}
