package com.example.burgerhouse.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.burgerhouse.Models.FoodCardModel;
import com.example.burgerhouse.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class FoodCardAdapter extends RecyclerView.Adapter<FoodCardAdapter.viewHolder> {

    ArrayList<FoodCardModel> list;
    Context context;

    public FoodCardAdapter(ArrayList<FoodCardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(context).inflate(R.layout.food_card, parent,false);
     return  new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        FoodCardModel model = list.get(position);

        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
