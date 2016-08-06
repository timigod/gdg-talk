package ng.helloworld.gdg_talk.interface_segregation;

import android.view.View;

/**
 * Created by timi on 05/08/2016.
 */

public interface OnClickListener {
    void onClick(View v);
    void onLongClick(View v);
    void onTouch(View v);
}
