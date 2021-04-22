package inherit.demo2;

public class Cricle{
    private int radius;

    public Cricle() {
    }

    public Cricle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * getRadius();
    }
}
