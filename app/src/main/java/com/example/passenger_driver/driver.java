package com.example.passenger_driver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class driver extends AppCompatActivity {

private Button homebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        homebutton=(Button) findViewById(R.id.homeButton1);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home();
            }
        });

    }

    public void home(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}