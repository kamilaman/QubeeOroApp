package com.example.qubeeoro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Tt extends AppCompatActivity {

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.tt );
        if (player == null){
            player = MediaPlayer.create(this,R.raw.t);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                }
            });
            player.start();
        }
    }
    public void T1(View view) {
        Intent i = new Intent( Tt.this, Main3Activity.class );
        startActivity( i );


    }
}
