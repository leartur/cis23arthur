package com.example.helloworld; //activity brain

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewDisplay;
    EditText editFirstName;
    EditText editLastName;
    String firstName;
    String lastName;
    Button buttonDisplay;
    Button buttonClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {    //upon opening the app, display hello world screen right away
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        buttonDisplay = (Button) findViewById(R.id.buttonDisplay);
        buttonDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editFirstName) ;
                EditText editLast = findViewById(R.id.editLastName) ;
                TextView textDisplay = findViewById(R.id.textViewDisplay) ;
                Resources res = getResources();
                String nameToDisplay = editName.getText().toString() ;
                String lastNameToDisplay = editName.getText().toString() ;
                String displayString = res.getString(R.string.welcome_message, nameToDisplay , lastNameToDisplay) ; //
                textDisplay.setText(displayString) ;
            }
        };
    }
}