package com.thesaugat.androidclassjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText emailEt, passwordET;
    LinearLayout loginBtn;
    TextView registerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailEt = findViewById(R.id.emailET);
        passwordET = findViewById(R.id.passwordET);
        registerTV = findViewById(R.id.registerTV);
        loginBtn = findViewById(R.id.loginLL);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, password;
                email = emailEt.getText().toString();
                password = passwordET.getText().toString();
                if (email.isEmpty() && password.isEmpty())
                    Toast.makeText(MainActivity.this, "Email or Password is Empty!", Toast.LENGTH_LONG).show();
                else if (email.equals("thesaugatt@gmail.com") && password.equals("Pass123")) {
                    Intent intent = new Intent(MainActivity.this, MyWalletActivity.class);
                    intent.putExtra("email", email);
                    intent.putExtra("name", "email");
                    startActivity(intent);
                    finish();

                } else
                    Toast.makeText(MainActivity.this, "Wrong email or password", Toast.LENGTH_LONG).show();
            }

        });
    }


    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    public void onClick(View v) {
        if (v == loginBtn) {
            String email, password;
            email = emailEt.getText().toString();
            password = passwordET.getText().toString();
            if (email.isEmpty() && password.isEmpty())
                Toast.makeText(MainActivity.this, "Email or Password is Empty!", Toast.LENGTH_LONG).show();
            else if (email.equals("thesaugatt@gmail.com") && password.equals("Pass123"))
                Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(MainActivity.this, "Wrong email or password", Toast.LENGTH_LONG).show();
        } else if (registerTV == v) {
            Toast.makeText(this, "Register Clicked", Toast.LENGTH_LONG).show();
        }
    }
}