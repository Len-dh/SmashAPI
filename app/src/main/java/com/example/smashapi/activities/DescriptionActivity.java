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

import com.example.smashapi.R;

public class DescriptionActivity extends Activity {

    public TextView tvname;
    public ImageView imageToUrlCh;
    public TextView tvserie; //image
    public TextView tvfirstApp;
    public TextView tvdescCharac;
    public TextView tvtiersRanking;
    public View layout;


    private static final String TAG = "DescriptionActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_layout);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        ImageView img = findViewById(R.id.imToUrlCh);

        Log.d(TAG, "onCreate: started.");
        tvname = (TextView) findViewById(R.id.name);
        //tvname.setText(tvname);
        imageToUrlCh = (ImageView) findViewById(R.id.imToUrlCh);
        tvserie = (TextView) findViewById(R.id.serie);
        //tvserie.setText(tvserie);
        tvfirstApp = (TextView) findViewById(R.id.firstApp);
        //tvfirstApp.setText();
        tvdescCharac = (TextView) findViewById(R.id.descCharac);
        tvtiersRanking = (TextView) findViewById(R.id.tiersRanking);






        
    }

}
