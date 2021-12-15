package com.example.qubeeoro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Score extends AppCompatActivity {

    private TextView mScore, mRasc, mScor, mTop;
    private RatingBar mRat;
    String Scor;
//            top, last, name;
//    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_score );

        SharedPreferences.Editor editor = getSharedPreferences( "RESUME", MODE_PRIVATE ).edit();
        editor.putString( "back", "0" );
        editor.apply();

        mScore = (TextView) findViewById( R.id.mScore );
        mRasc = (TextView) findViewById( R.id.txt1 );
        mScor = (TextView) findViewById( R.id.txtScore );
        mRat = (RatingBar) findViewById( R.id.rat );
//        mTop = (TextView) findViewById( R.id.txtTop );

        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        Scor = bundle.getString( "Answer" );

        mScore.setText( String.valueOf( Scor ) );

        sRating();
        Sscore();

        findViewById( R.id.review ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences( "RESUME", MODE_PRIVATE ).edit();
                editor.putString( "back", "2" );
                editor.apply();
                finish();
            }
        } );

        findViewById( R.id.Backto ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences( "RESUME", MODE_PRIVATE ).edit();
                editor.putString( "back", "3" );
                editor.apply();
                finish();
            }
        } );

//        sessionManager = new SessionManager( getApplicationContext() );
//        HashMap<String, String> user = sessionManager.getUserDetails();
//        top = user.get( SessionManager.KEY_TOP );
//        last = user.get( SessionManager.KEY_LAST );
//        name = user.get( SessionManager.KEY_NAME );

//        setSkor();
    }
    private void sRating(){
        Double intScore = Double.valueOf(Scor);
        if (intScore < 5.0){
            mRasc.setText("Not Bad!");
            mRat.setRating((float)1.5);
        } else if (intScore >= 5.0 && intScore < 6.5){
            mRasc.setText("Good do better!");
            mRat.setRating((float)2.5);
        }else if (intScore >= 6.5 && intScore < 8.0){
            mRasc.setText("Good!");
            mRat.setRating((float)4.0);
        }else if (intScore >= 8.0 && intScore < 10.0){
            mRasc.setText("V.Good!");
            mRat.setRating((float)4.5);
        }

        if (intScore == 0.0){
            mRasc.setText("No!");
            mRat.setRating((float)0.0);
        }

        if (intScore == 10.0){
            mRasc.setText("Excellent!");
            mRat.setRating((float)5.0);
        }
    }

    private void Sscore(){
        Double Score = Double.valueOf(Scor);
        Double Scores = Score / 10;

        Double Ans = Scores * 100;

        mScor.append(String.valueOf(Ans));
    }
}
