package com.example.qubeeoro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mm extends AppCompatActivity {

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.mm );
        if (player == null){
            player = MediaPlayer.create(this,R.raw.m);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                }
            });
            player.start();
        }
    }
    public void M(View view) {
        Intent i = new Intent( Mm.this, Main3Activity.class );
        startActivity( i );
    }
}
