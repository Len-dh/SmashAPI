package com.example.smashapi.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.smashapi.R;
import com.squareup.picasso.Picasso;

public class DescriptionActivity extends Activity {

    public TextView tvname;
    public ImageView imageToUrlCh;
    public TextView tvserie; //image
    public TextView tvfirstApp;
    public TextView tvdescCharac;
    public TextView tvtiersRanking;
    public View layout;
    public ImageView imageGif;



    private static final String TAG = "DescriptionActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_layout);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String imUrl = intent.getStringExtra("imch");

        Log.d(TAG, "onCreate: started.");
        tvname = (TextView) findViewById(R.id.name);
        tvname.setText(intent.getStringExtra("namec"));
        imageToUrlCh = (ImageView) findViewById(R.id.imToUrlCh);
        Picasso.get().load(imUrl).resize(143,143).into(imageToUrlCh);
        tvserie = (TextView) findViewById(R.id.serie);
        tvserie.setText(intent.getStringExtra("serie"));
        tvfirstApp = (TextView) findViewById(R.id.firstApp);
        tvfirstApp.setText(intent.getStringExtra("firstApp"));
        tvdescCharac = (TextView) findViewById(R.id.descCharac);
        tvdescCharac.setText(intent.getStringExtra("descPer"));
        tvtiersRanking = (TextView) findViewById(R.id.tiersRanking);
        tvtiersRanking.setText(intent.getStringExtra("tranking"));



    }

    public void openActivity3(View view) {
        Intent intent = new Intent(this, ImageGif.class);
        imageGif = (ImageView) findViewById(R.id.imgif);

        startActivity(intent);
    }




}
