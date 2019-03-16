package com.kevin.androideat;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FoodDetail extends AppCompatActivity {

    TextView foodName, foodPrice, foodDescription;
    ImageView food_image;

    CollapsingToolbarLayout mCollapsingToolbarLayout;
    FloatingActionButton btnCart;
    Button numberButton;

    String foodId = "";

    FirebaseDatabase mDatabase;
    DatabaseReference foodDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        mDatabase = FirebaseDatabase.getInstance();
        foodDb = mDatabase.getReference("foods");

        foodName = (TextView) findViewById(R.id.food_name);
        foodPrice = (TextView) findViewById(R.id.food_price);
        foodDescription = (TextView) findViewById(R.id.food_description);
        food_image = (ImageView) findViewById(R.id.food_image);
        numberButton = (Button) findViewById(R.id.number_button);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing);

        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        mCollapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);

        if(getIntent() != null) {
            foodId = getIntent().getStringExtra("foodId");
        }
        if(!foodId.isEmpty()) {
            getDetailFood(foodId);
        }
    }

    private void getDetailFood(String foodId) {

    }
}
