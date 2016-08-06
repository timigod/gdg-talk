package ng.helloworld.gdg_talk.open_closed;

import java.util.ArrayList;

/**
 * Created by timi on 05/08/2016.
 */

public class AreaManager {

    public double calculateArea(ArrayList<Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }
}
