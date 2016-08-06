package ng.helloworld.gdg_talk.single_responsibility;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by timi on 05/08/2016.
 */

public class Order {
    private int orderNumber;
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    private long total;


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


    public long getTotal(){
        for (LineItem item : lineItems) {
            total += item.getPrice();
        }
        return total;
    }

    public String getOrderNumberAsString(){
        return Integer.toString(orderNumber);
    }

    public String getFormattedTotal(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        return formatter.format(total);
    }

}
