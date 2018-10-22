package com.example.maxime.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MAIN_ACTIVITY_INTENT_RESULT_CODE = 1;
    Cellar mainCellar;
    AdapterBottles adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainCellar = new Cellar();

        RecyclerView recyclerView = findViewById(R.id.rv);
        adapter = new AdapterBottles(mainCellar.getList());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        Button btn = findViewById(R.id.btnCreate);
        btn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateBottleActivity.class);
                startActivityForResult(intent, MAIN_ACTIVITY_INTENT_RESULT_CODE);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast toast = Toast.makeText(getApplicationContext(), data.getSerializableExtra("bottle").toString(), Toast.LENGTH_SHORT);
        toast.show();
        if (requestCode == MAIN_ACTIVITY_INTENT_RESULT_CODE) {
            mainCellar.addBottle((Bottle) data.getSerializableExtra("bottle"));
            adapter.notifyDataSetChanged();
        }
    }


}
