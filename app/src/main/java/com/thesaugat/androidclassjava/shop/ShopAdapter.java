package com.thesaugat.androidclassjava.shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thesaugat.androidclassjava.R;
import com.thesaugat.androidclassjava.data.ProductData;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopViewHolder> {
    List<ProductData> productDataList;
    LayoutInflater layoutInflater;


    ShopAdapter(List<ProductData> productDataList, Context context) {
        this.productDataList = productDataList;
        layoutInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ShopViewHolder(layoutInflater.inflate(R.layout.item_product, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
        holder.nameTV.setText(productDataList.get(position).name);
        holder.priceTv.setText(productDataList.get(position).price+"");
        holder.discountPrice.setText(productDataList.get(position).discountPrice+"");

    }

    @Override
    public int getItemCount() {
        return productDataList.size();
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder {
        ImageView productIV;
        TextView nameTV, priceTv, discountPrice, discountPercent;

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            productIV = itemView.findViewById(R.id.productIV);
            nameTV = itemView.findViewById(R.id.productNameTV);
            priceTv = itemView.findViewById(R.id.oldPriceTV);
            discountPrice = itemView.findViewById(R.id.discountPriceTV);
        }
    }
}
