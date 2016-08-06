package ng.helloworld.gdg_talk.dependency_inversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ng.helloworld.gdg_talk.R;

public class AnotherRandomActivity extends AppCompatActivity {
    private String randomValue;
    private EditText editText;
    private Button save;
    private IBusinessLayer businessLayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = (EditText) findViewById(R.id.name_edit_text);
                User user = new User(randomValue);
                businessLayer = new BusinessLayer();
                if (businessLayer.isValid(user)) {
                    businessLayer.save(user);
                } else {
                    // Display error or whatever
                }
            }
        });
    }
}
