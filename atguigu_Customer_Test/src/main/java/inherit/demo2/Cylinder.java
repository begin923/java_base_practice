package inherit.demo2;

public class Cylinder extends Cricle{
    double length;

    public Cylinder() {
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder(int radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findColume(){
        return findArea() * getLength();
    }
}
