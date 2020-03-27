package com.example.smartgarbagemanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button CollecterButton;
    private Button CustomerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome3);

        CollecterButton = (Button) findViewById(R.id.Collecter);
        CustomerButton = (Button) findViewById(R.id.Customer);

        CollecterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginRegisterCustomerIntent = new Intent(WelcomeActivity.this,Customer_Login_Register.class);
                startActivity(LoginRegisterCustomerIntent);
            }
        });

        CustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginRegisterCustomerIntent = new Intent(WelcomeActivity.this,Garbage_Collecter_Register.class);
                startActivity(LoginRegisterCustomerIntent);
            }
        });

    }
}
