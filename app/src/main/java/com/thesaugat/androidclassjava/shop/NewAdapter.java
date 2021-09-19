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

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.MyViewHolder> {
    List<ProductData> productDataList;
    LayoutInflater layoutInflater;

    public NewAdapter(List<ProductData> productDataList, Context context) {
        this.productDataList = productDataList;
        layoutInflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(layoutInflater.inflate(R.layout.item_product, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameTV.setText(productDataList.get(position).name);

    }

    @Override
    public int getItemCount() {
        return productDataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView productIV;
        TextView nameTV, priceTv, discountPrice, discountPercent;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            productIV = itemView.findViewById(R.id.productIV);
            nameTV = itemView.findViewById(R.id.productNameTV);
            priceTv = itemView.findViewById(R.id.oldPriceTV);
            discountPrice = itemView.findViewById(R.id.discountPriceTV);
        }
    }
}
