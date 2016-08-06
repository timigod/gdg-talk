package ng.helloworld.gdg_talk.dependency_inversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ng.helloworld.gdg_talk.R;

public class AnotherRandomActivity extends AppCompatActivity {
    private String name;
    private EditText nameEditText;
    private Button saveButton;
    private User user;
    private IBusinessLayer businessLayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeViews();
        setSaveClickListener();
    }

    private void setSaveClickListener(){
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractFormInputs();
                createUser();
                tryToPersistUser();
            }
        });
    }

    private void initializeViews() {
        saveButton = (Button) findViewById(R.id.save);
        nameEditText = (EditText) findViewById(R.id.name_edit_text);
    }


    private void createUser(){
        user = new User(name);
    }

    private void extractFormInputs(){
        name = nameEditText.getText().toString();
    }

    private void tryToPersistUser(){
        createBusinessLayer();
        if (businessLayer.isValid(user)) {
            businessLayer.save(user);
        } else {
            // Display error or whatever
        }
    }

    private void createBusinessLayer(){
        businessLayer = new BusinessLayer();
    }
}
