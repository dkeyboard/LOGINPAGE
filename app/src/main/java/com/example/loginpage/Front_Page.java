package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Front_Page extends AppCompatActivity {

    EditText e,p;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        //Toast.makeText(Front_Page.this, "Login Successful", Toast.LENGTH_SHORT).show();
        e=findViewById(R.id.User);
        p=findViewById(R.id.Passw);
        b=findViewById(R.id.button);

        Login();

    }
    public void Login()
    {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(e.getText().toString().equals("admin") && p.getText().toString().equals("abc"))
                {
                    Toast.makeText(Front_Page.this,"Login Successful",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Front_Page.this,Second_Page.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(Front_Page.this,"Login Failed!\nWrong Username",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}