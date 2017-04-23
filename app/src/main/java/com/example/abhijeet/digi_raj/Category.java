package com.example.abhijeet.digi_raj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_category);

        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.guidebut);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Category.this, SignUpGuide.class);
                startActivity(myIntent);
            }
        });




        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.touristbut);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Category.this, SignUp.class);
                startActivity(myIntent);
            }
        });

    }





}