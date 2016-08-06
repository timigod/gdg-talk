package ng.helloworld.gdg_talk.single_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timi on 05/08/2016.
 */

public class Order {
    private int orderNumber;
    private List<LineItem> lineItems = new ArrayList<LineItem>();


    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

}
