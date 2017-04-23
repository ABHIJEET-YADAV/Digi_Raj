package com.example.abhijeet.digi_raj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.signupbut);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,Category.class);
                startActivity(myIntent);
            }
        });

        button = (Button) findViewById(R.id.loginbut);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,Registration.class);
                startActivity(myIntent);
            }
        });
    }


}


