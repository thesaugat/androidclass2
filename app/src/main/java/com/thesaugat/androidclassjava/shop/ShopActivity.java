package com.thesaugat.androidclassjava.shop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.thesaugat.androidclassjava.R;
import com.thesaugat.androidclassjava.data.DataSeeder;

public class ShopActivity extends AppCompatActivity {
    RecyclerView shopRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        shopRV = findViewById(R.id.shopRV);
        shopRV.setLayoutManager(new LinearLayoutManager(this));
        ShopAdapter shopAdapter = new ShopAdapter(DataSeeder.getProductList(), this);
        shopRV.setAdapter(shopAdapter);
    }
}