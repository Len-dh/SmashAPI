package com.example.smashapi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.smashapi.R;
import com.example.smashapi.adapters.MyAdapter;
import com.example.smashapi.model.Fighters;
import com.example.smashapi.model.MainController;
import com.example.smashapi.model.OnClickListener;
import com.google.gson.Gson;

import java.io.Console;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MainController controller;

    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter myRecyclerAdapter;
    private RecyclerView.LayoutManager myRecyclerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        controller = new MainController(this);
        controller.onCreate();


    }

    public void showList(List<Fighters> list) {
        //utilise un layout lineaire
        myRecyclerLayout = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myRecyclerLayout);

        //specifie notre adaptateur
        myRecyclerAdapter = new MyAdapter(list, new OnClickListener() {
            @Override
            public void onClickListener(Fighters fighters) {
                // Create an Intent to start the second activity
                Intent details = new Intent(MainActivity.this, Activity_details.class);
                Gson gson = new Gson();
                //passe en plus la console sur laquelle on se trouve
                details.putExtra("fighters_key", gson.toJson(fighters));
                // Start the new activity.
                startActivity(details);
            }

        });
        myRecyclerView.setAdapter(myRecyclerAdapter);
    }
}




