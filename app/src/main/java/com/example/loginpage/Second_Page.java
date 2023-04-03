package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second_Page extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        b=findViewById(R.id.Logout);
        abc();
    }
    public void abc()
    {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Second_Page.this,Front_Page.class);
                Toast.makeText(Second_Page.this,"Logout Successful",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

    }

}