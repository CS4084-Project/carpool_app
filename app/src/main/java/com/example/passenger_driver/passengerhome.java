package com.example.passenger_driver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class passengerhome extends AppCompatActivity {

private Button homeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passengerhome);


        homeb=(Button) findViewById(R.id.homep);
        homeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homep();
            }
        });



    }
    public void homep(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}