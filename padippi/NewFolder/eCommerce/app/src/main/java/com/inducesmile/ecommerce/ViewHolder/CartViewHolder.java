package com.inducesmile.ecommerce.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.inducesmile.ecommerce.Interface.ItemClickListener;
import com.inducesmile.ecommerce.R;

public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{

    public TextView txtProductName , txtProductPrice, txtProductQuantity;
    private ItemClickListener itemClickListener;




    public CartViewHolder(@NonNull View itemView)
    {
        super(itemView);

        txtProductName  = itemView.findViewById(R.id.cart_product_name);
        txtProductPrice  = itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity  = itemView.findViewById(R.id.cart_product_quantity);
    }


    @Override
    public void onClick(View v) {

        itemClickListener.onClick(v, getAdapterPosition(),false);

    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener = itemClickListener;
    }
}
