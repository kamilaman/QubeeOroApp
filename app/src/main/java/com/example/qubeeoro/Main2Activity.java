package com.example.qubeeoro;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

//import com.google.android.gms.ads.AdListener;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdSize;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.MobileAds;

public class Main2Activity extends AppCompatActivity {

//    private AdView adView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );

//        adView = findViewById( R.id.Qubee_afaan_oromoo );
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice( AdRequest.DEVICE_ID_EMULATOR )
//                 Check the LogCat to get your test device ID
//                .addTestDevice( getString( R.string.admob_banner_unit_id ) ).build();
//        adView.loadAd( adRequest );
//        MobileAds.initialize( this.getApplicationContext(), getResources().getString(R.string.admob_app_id) );
//
//        final AdView adView = new AdView( this );
//        adView.setAdSize( AdSize.BANNER );
//        adView.setAdUnitId( getString( R.string.admob_banner_unit_id ) );
//        adView.setAdListener( new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                adView.setVisibility( View.VISIBLE );
//            }
//
//            @Override
//            public void onAdClosed() {
//
//            }
//
//            @Override
//            public void onAdFailedToLoad(int error) {
//                adView.setVisibility( View.GONE );
//            }
//
//            @Override
//            public void onAdLeftApplication() {
//
//            }
//
//            @Override
//            public void onAdOpened() {
//
//            }
//        } );
//
//        adView.loadAd( adRequest );
    }

    public void gaffii(View view) {
        Intent i1 = new Intent( Main2Activity.this,Main4Activity.class );
        startActivity( i1 );
    }

    public void about(View view) {
        Intent i1 = new Intent( Main2Activity.this,About.class );
        startActivity( i1 );
    }

    @Override
    public void onBackPressed() {

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(Main2Activity.this);
        alertDialog.setTitle("Qubee chufii");
        alertDialog.setMessage("Kessaa Bahi?");

        alertDialog.setNegativeButton((CharSequence) " Tole ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ActivityCompat.finishAffinity(Main2Activity.this);
                finish();
            }
        });

        alertDialog.setPositiveButton((CharSequence) "Lakkii", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });

        alertDialog.show();
    }


    public void Lakko(View view) {
        Intent i1 = new Intent( Main2Activity.this,Lakk.class );
        startActivity( i1 );
    }

    public void qube(View view) {
        Intent i = new Intent( Main2Activity.this,Main3Activity.class );
        startActivity( i );
    }

    public void Qaamoole(View view) {
        Intent i = new Intent( Main2Activity.this,Main3Activity.class );
        startActivity( i );
    }
}
