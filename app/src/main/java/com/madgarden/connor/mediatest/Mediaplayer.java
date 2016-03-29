package com.madgarden.connor.mediatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.IOException;
import android.media.AudioManager;
import android.media.MediaPlayer;


public class Mediaplayer extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);




    }

    public static void main(String [] args)throws IOException {

        //hacking together a music playing function below

        String url = "http://soundbible.com/grab.php?id=1986&type=mp3";
        MediaPlayer mPlayer = new MediaPlayer();

        mPlayer.reset();
        System.out.println("Resetting");
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        System.out.println("Setting stream type");
        mPlayer.setDataSource(url);
        System.out.println("Grabbing from URL");
        mPlayer.prepare();
        System.out.println("Preparing");
        mPlayer.start();
        System.out.println("Playing");

    }
}
