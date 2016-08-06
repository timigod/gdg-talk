package ng.helloworld.gdg_talk.open_closed;

/**
 * Created by timi on 05/08/2016.
 */

public class Circle implements Shape{
    private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * (22/7);
    }
}
