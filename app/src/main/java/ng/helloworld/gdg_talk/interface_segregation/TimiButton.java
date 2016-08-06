package ng.helloworld.gdg_talk.interface_segregation;

import android.content.Context;
import android.view.View;

/**
 * Created by timi on 05/08/2016.
 */

public class TimiButton extends android.widget.Button {
    public TimiButton(Context context) {
        super(context);
    }

    public void setOnClickListener(OnClickListener onClickListener) {

    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {

    }


    public interface OnClickListener {
        void onClick(View v);
    }

    public interface OnLongClickListener{
        void onClick(View v);
    }

}
