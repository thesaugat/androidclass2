package com.thesaugat.androidclassjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.thesaugat.androidclassjava.data.DataSeeder;
import com.thesaugat.androidclassjava.data.ProductData;

import java.util.List;

public class EcommerceActivity extends AppCompatActivity {
    ImageView productIV;
    TextView nameTV, priceTv, discountPrice, discountPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecommerce);


        productIV = findViewById(R.id.productIV);
        nameTV = findViewById(R.id.productNameTV);
        priceTv = findViewById(R.id.oldPriceTV);
        discountPrice = findViewById(R.id.discountPriceTV);

        List<ProductData> productDataList = DataSeeder.getProductList();


        nameTV.setText(productDataList.get(0).name);
        priceTv.setText(productDataList.get(0).price + "");
        discountPrice.setText(productDataList.get(0).discountPrice + "");
        double discountP = (productDataList.get(0).discountPrice / productDataList.get(0).price) * 100;
//        discountPercent.setText("-" + discountP + "%");
        Picasso.get().load(productDataList.get(0).imageUrl).into(productIV);
    }
}