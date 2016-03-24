package com.madgarden.connor.mediatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.IOException;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Mediaplayer extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);




    }

    public static void main(String [] args)throws IOException {

        //hacking together a music playing function below

        String url = "HTTP GOES HERE";
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.reset();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.setDataSource(url);
        mediaPlayer.prepare();
        mediaPlayer.start();

    }
}
