package com.example.qubeeoro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main4Activity extends AppCompatActivity {
    private RadioButton gaaffii1,gaaffii2,gaaffii3, gaaffii4,gaaffii5,gaaffii6,gaaffii7,gaaffii8, gaaffii9,gaaffii10;
    private ScrollView scrollView;

    Double Answ;
    int jwb7 = 0;
    int jBenar = 0;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main4 );
        SharedPreferences.Editor editor = getSharedPreferences("RESUME", MODE_PRIVATE).edit();
        editor.putString("back", "0");
        editor.apply();

        gaaffii1 = (RadioButton)findViewById(R.id.j1);
        gaaffii2 = (RadioButton)findViewById(R.id.j2);
        gaaffii3 = (RadioButton)findViewById(R.id.j3);
        gaaffii4 = (RadioButton) findViewById(R.id.j4);
        gaaffii5 = (RadioButton)findViewById(R.id.j5);
        gaaffii6 = (RadioButton)findViewById( R.id.j6 );
        gaaffii7 = (RadioButton)findViewById( R.id.j7 );
        gaaffii8 = (RadioButton)findViewById( R.id.j8 );
        gaaffii9 = (RadioButton)findViewById( R.id.j9 );
        gaaffii10 = (RadioButton)findViewById( R.id.j10 );

        scrollView = (ScrollView)findViewById(R.id.scroll);


        findViewById(R.id.bSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Questions();
            }
        });

        findViewById(R.id.bUlang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main4Activity.this, Main4Activity.class));
                overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out_from_view);
                finish();
            }
        });

    }

    private void Questions(){

        Answ = 0.0;

        if (gaaffii1.isChecked()){
            Answ++;
        }
        if (gaaffii2.isChecked()){
            Answ++;
        }
        if (gaaffii3.isChecked()){
            Answ++;
        }
        if (gaaffii4.isChecked()){
            Answ++;
        }
        if (gaaffii5.isChecked()){
            Answ++;
        }
        if (gaaffii6.isChecked()){
            Answ++;
        }
        if (gaaffii7.isChecked()){
            Answ++;
        }
        if (gaaffii8.isChecked()){
            Answ++;
        }
        if (gaaffii9.isChecked()){
            Answ++;
        }
        if (gaaffii10.isChecked()){
            Answ++;
        }

        String sAnsw = String.valueOf(Answ);

        Intent i = new Intent(Main4Activity.this, com.example.qubeeoro.Score.class);
        i.putExtra("Answer", sAnsw);
        startActivity(i);
        overridePendingTransition(R.anim.zoom_in_from_view, R.anim.zoom_out_from_view);

    }

    protected void onResume() {

        super.onResume();
        SharedPreferences spref = getSharedPreferences("RESUME", MODE_PRIVATE);
        String back = spref.getString("back", null);

        if (back.equals("1")) {
            Toast.makeText(Main4Activity.this, " Gaaffii fi Deebii ", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Main4Activity.this, Main4Activity.class));
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out_from_view);
            finish();
        } else if (back.equals("2")) {
            gaaffii1.setBackgroundColor( Color.YELLOW);
            gaaffii2.setBackgroundColor(Color.YELLOW);
            gaaffii3.setBackgroundColor(Color.YELLOW);
            gaaffii4.setBackgroundColor(Color.YELLOW);
            gaaffii5.setBackgroundColor( Color.YELLOW );
            gaaffii6.setBackgroundColor( Color.YELLOW );
            gaaffii7.setBackgroundColor( Color.YELLOW );
            gaaffii8.setBackgroundColor( Color.YELLOW );
            gaaffii9.setBackgroundColor( Color.YELLOW );
            gaaffii10.setBackgroundColor(Color.YELLOW);

            findViewById(R.id.bSubmit).setVisibility( View.GONE);
            findViewById(R.id.bUlang).setVisibility(View.VISIBLE);

            scrollView.fullScroll(View.FOCUS_UP);
            Toast.makeText(Main4Activity.this, "Debbii ilaaluf", Toast.LENGTH_SHORT).show();
        } else if (back.equals("3")) {
            Toast.makeText(Main4Activity.this,  " Gaaffii deebi'uuf!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Main4Activity.this, Main4Activity.class));
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out_from_view);
            finish();
        } else if (back.equals("4")) {
            startActivity(new Intent(Main4Activity.this, MainActivity.class));
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out_from_view);
            finish();
        } else {
            Toast.makeText(Main4Activity.this, "Gaaffii fi Deebii  ", Toast.LENGTH_SHORT).show();
            SharedPreferences.Editor editor = getSharedPreferences("RESUME", MODE_PRIVATE).edit();
            editor.putString("back", "0");
            editor.apply();
        }
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        return;

    }

}
