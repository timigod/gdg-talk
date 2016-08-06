package ng.helloworld.gdg_talk.single_responsibility;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import ng.helloworld.gdg_talk.R;

/**
 * Created by timi on 05/08/2016.
 */

public class OrderRecyclerAdapter extends RecyclerView.Adapter<OrderRecyclerAdapter.ViewHolder> {

    private List<Order> items;
    private int itemLayout;

    public OrderRecyclerAdapter(List<Order> items, int itemLayout) {
        this.items = items;
        this.itemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Order order = items.get(position);
        holder.orderNumber.setText(Integer.toString(order.getOrderNumber()));
        long total = 0;
        for (LineItem item : order.getLineItems()) {
            total += item.getPrice();
        }
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        String totalValue = formatter.format(total);
        holder.orderTotal.setText(totalValue);
        holder.itemView.setTag(order);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView orderNumber;
        public TextView orderTotal;

        public ViewHolder(View itemView) {
            super(itemView);
            orderNumber = (TextView) itemView.findViewById(R.id.order_number);
            orderTotal = (TextView) itemView.findViewById(R.id.order_total);
        }
    }
}
