package com.example.qubeeoro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Ww extends AppCompatActivity {

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.ww );
        if (player == null){
            player = MediaPlayer.create(this,R.raw.w);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                }
            });
            player.start();
        }
    }
    public void W1(View view) {
        Intent i = new Intent( Ww.this, com.example.qubeeoro.Main3Activity.class );
        startActivity( i );

    }
}
