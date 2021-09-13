package com.thesaugat.androidclassjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MyWalletActivity extends AppCompatActivity implements View.OnClickListener {

    TextView nameTV;
    LinearLayout sendLL;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wallet);
        nameTV = findViewById(R.id.nameTV);
        sendLL = findViewById(R.id.sendLL);

//        String email = getIntent().getStringExtra("email");
//        nameTV.setText(email);

        sendLL.setOnClickListener(this);
        nameTV.setOnClickListener(this);




    }

    public  void scanClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }


    @Override
    public void onClick(View v) {
        if(v==sendLL)
        Toast.makeText(this, "Send Clicked", Toast.LENGTH_SHORT).show();
        else if(v==nameTV){
            count++;
            nameTV.setText("Name clicked "+ count + " times" );
            nameTV.setTextColor(Color.parseColor("#FF3700B3"));

        }


    }
}