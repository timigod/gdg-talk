package ng.helloworld.gdg_talk.single_responsibility;

/**
 * Created by timi on 05/08/2016.
 */

public class LineItem {
    private String description;
    private int quantity;
    private long price;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
