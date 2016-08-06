package ng.helloworld.gdg_talk.interface_segregation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ng.helloworld.gdg_talk.R;


public class RandomActivity extends AppCompatActivity {
    private TimiButton create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_layout);

        create = (TimiButton) findViewById(R.id.create);
        create.setOnClickListener(new TimiButton.OnClickListener() {

            @Override
            public void onClick(android.view.View v) {

            }

        });

        create.setOnLongClickListener(new TimiButton.OnLongClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
