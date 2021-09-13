package com.thesaugat.androidclassjava.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.thesaugat.androidclassjava.R;
import com.thesaugat.androidclassjava.data.DataSeeder;

public class HomeActivity extends AppCompatActivity {
    RecyclerView productListRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        productListRv = findViewById(R.id.productRV);
        productListRv.setHasFixedSize(true);
        productListRv.setLayoutManager(new LinearLayoutManager(this));
        ProductsAdapter productsAdapter = new ProductsAdapter(DataSeeder.getProductList(), this);
        productListRv.setAdapter(productsAdapter);

    }
}