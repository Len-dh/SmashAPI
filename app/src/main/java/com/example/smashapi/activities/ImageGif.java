package com.example.smashapi.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.smashapi.R;

public class ImageGif extends Activity {

    private ImageView imageGif;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gif_activity);

        imageGif = (ImageView) findViewById(R.id.imgif);
        Glide.with(this).asGif().load("https://thumbs.gfycat.com/PepperyAnxiousAustralianfurseal-small.gif")
                .into(imageGif);


    }

}
