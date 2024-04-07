package com.example.burgerhouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.burgerhouse.Adapters.FoodCardAdapter;
import com.example.burgerhouse.Models.FoodCardModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<FoodCardModel> list = new ArrayList<FoodCardModel>();

        list.add(new FoodCardModel(R.drawable.b1, "Burger"));
        list.add(new FoodCardModel(R.drawable.chai, "Chai"));
        list.add(new FoodCardModel(R.drawable.fries, "French Fries"));
        list.add(new FoodCardModel(R.drawable.samosa, "Samosa"));
        list.add(new FoodCardModel(R.drawable.kabab, "Kawab"));
        list.add(new FoodCardModel(R.drawable.pizza, "Pizza"));
        list.add(new FoodCardModel(R.drawable.samosa1, "Chicken Samosa"));

        FoodCardAdapter adapter = new FoodCardAdapter(list,this);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager linearLayoutManager  = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);


//        LinearLayoutManager linearLayoutManager  = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerView.setLayoutManager(linearLayoutManager);

        GridLayoutManager gridlayout = new Grs

    }
}