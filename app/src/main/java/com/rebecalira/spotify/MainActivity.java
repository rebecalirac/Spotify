package com.rebecalira.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.capa);

        Glide.with(this).load("https://img.youtube.com/vi/Wc5IbN4xw70/0.jpg").into(imageView);

        player= MediaPlayer.create(getApplicationContext(), R.raw.wap);
    }
    public void playMusic(View view) {
        player.start();
    }
}
