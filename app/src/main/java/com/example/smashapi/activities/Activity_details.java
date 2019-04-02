package com.example.smashapi.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smashapi.R;
import com.example.smashapi.model.Fighters;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.Console;

public class Activity_details extends Activity {
    //AFFICHAGE
    //variables pour toutes les donnees
    public TextView name;
    public ImageView imToUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smash_row_item);


        //initial
        name = (TextView) findViewById(R.id.name);
        imToUrl = (ImageView) findViewById(R.id.imToUrl);


        //recupere le GSON passer en entree et le retransforme en objet console
        String jsonFighters = getIntent().getStringExtra("fighter_key");
        Gson gson = new Gson();
        Fighters fighter;
        fighter = (Fighters) getIntent().getSerializableExtra("Char");
        if(fighter!=null)
            Log.i("fighterswin", " " + fighter.getName() + " " + fighter.getSerie());


        //actualise la vue en fonction des parametres
        //name.setText(item.getName());//affiche le nom de la console
        //Picasso.get().load(item.getImToUrlCh()).into(imToUrlCh);

    }
}
