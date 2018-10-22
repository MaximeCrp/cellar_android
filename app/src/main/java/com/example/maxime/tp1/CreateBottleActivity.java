package com.example.maxime.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateBottleActivity extends AppCompatActivity {

    public static String BOTTLE_CREATED_KEY = "BOTTLE_CREATED_KEY";
    Bottle newBottle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_bottle);


        Button btnValidBottle = findViewById(R.id.btnValidBottle);

        btnValidBottle.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                EditText bottleName = findViewById(R.id.bottleName);
                EditText bottlePrice = findViewById(R.id.bottlePrice);
                String name;
                float price;
                name = bottleName.getText().toString();
                price = Float.parseFloat(bottlePrice.getText().toString());
                newBottle = new Bottle(name, price);
                Intent returnIntent = new Intent();
                returnIntent.putExtra("bottle", newBottle);
                setResult(RESULT_OK, returnIntent);
                finish();
                //endActivity();
            }
        });
    }

    public void endActivity() {
        //setResult(RESULT_OK);
        Intent returnIntent = new Intent();
        returnIntent.putExtra("bottle", newBottle);
        finish();
    }

}
