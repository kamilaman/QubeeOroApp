package com.example.qubeeoro;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

//import com.google.android.gms.ads.AdListener;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdSize;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.InterstitialAd;
//import com.google.android.gms.ads.MobileAds;

public class Lakk extends AppCompatActivity {

    private ViewPager viewPager;
//    private AdView mAdview;
    private ImageView Back;
//    private InterstitialAd mInterstitialAd;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lakk );

        viewPager = findViewById( R.id.viewpager );
//        mAdview = findViewById( R.id.adView);
        Back = (ImageView) findViewById(R.id.back);
//        mInterstitialAd = new InterstitialAd( this );

        // set the ad unit ID
//        mInterstitialAd.setAdUnitId(getString( R.string.admob_interstitial_unit_id ) );
//
//        AdRequest adRequest = new AdRequest.Builder()
//                .build();

        // Load ads into Interstitial Ads
//        mInterstitialAd.loadAd( adRequest );
//        mInterstitialAd.setAdListener( new AdListener() {
//            @Override
//            public void onAdClosed() {
//                mInterstitialAd.loadAd( new AdRequest.Builder().build() );
//            }
//
//            @Override
//            public void onAdLoaded() {
//                showInterstitial();
//            }
//        } );
//
//        AdRequest adRequests = new AdRequest.Builder().addTestDevice( AdRequest.DEVICE_ID_EMULATOR )
//                 Check the LogCat to get your test device ID
//                .addTestDevice( getString( R.string.admob_banner_unit_id ) ).build();
//        mAdview.loadAd( adRequests );
//        MobileAds.initialize( this.getApplicationContext(), getResources().getString(R.string.admob_app_id) );
//        final AdView mAdview = new AdView( this );
//        mAdview.setAdSize( AdSize.BANNER );
//        mAdview.setAdUnitId( getString( R.string.admob_banner_unit_id ));
//
        //setting adapter in viewpager
        viewPager.setAdapter( new MyPagerAdapter() );
//        mAdview.setAdListener( new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                showToast("Ad loaded.");
//                if (mAdview.getVisibility() == View.GONE) {
//                    mAdview.setVisibility(View.VISIBLE);
//                }
//            }
//
//            @Override
//            public void onAdClosed() {
//
//            }
//
//            @Override
//            public void onAdFailedToLoad(int error) {
//                mAdview.setVisibility( View.GONE );
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
//        mAdview.loadAd( adRequests );
        viewPager.addOnPageChangeListener( new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                } else return;

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        } );

    }

    private class MyPagerAdapter extends PagerAdapter {
        private int[] images;
        private String[] alphabets;
        int[] songs;


        private MyPagerAdapter() {
            this.images = new int[]{R.drawable.tko, R.drawable.tko2, R.drawable.tko3, R.drawable.tko4, R.drawable.tko5, R.drawable.tko6, R.drawable.tko7,
                    R.drawable.tko8, R.drawable.tko9, R.drawable.tko10, R.drawable.tko20, R.drawable.tko30, R.drawable.tko40, R.drawable.tko50,};
            this.alphabets = new String[]{"Tokko", "Lama", "Sadii", "Afur", "Shan", "Jaha/Ja'a", "Torba", "Saddeet", "Sagal", "Kudhan",
                    "Digdama", "Soddoma", "Afurtama", "Shantama"};
            this.songs = new int[]{R.raw.t1, R.raw.t2, R.raw.t3, R.raw.t4, R.raw.t5, R.raw.t6, R.raw.t7, R.raw.t8, R.raw.t9,
                    R.raw.t10, R.raw.t20, R.raw.t30, R.raw.t40, R.raw.t50};

        }

        public int getCount() {

            return this.images.length;
        }

        public boolean isViewFromObject(View view, Object object) {
            return view == (object);
        }

        public Object instantiateItem(ViewGroup container, int position) {


            View view = ((LayoutInflater) getApplicationContext().getSystemService( Context.LAYOUT_INFLATER_SERVICE )).inflate( R.layout.content, container, false );

            //setting text in textview
            ((TextView) view.findViewById( R.id.textview )).setText( this.alphabets[position] );

            //setting image in imageview
            ImageView imageView = view.findViewById( R.id.imageview );
            imageView.setScaleType( ImageView.ScaleType.FIT_CENTER );
            imageView.setImageResource( this.images[position] );

            //play and stop song on button click
            Button btn_play = view.findViewById( R.id.btn_play );

            final int song = songs[position];

            btn_play.setOnClickListener( new View.OnClickListener() {

                public void onClick(View v) {
                    try {

                        if (mp != null && mp.isPlaying()) {
                            mp.stop();
                            mp.release();

                        }
                        mp = MediaPlayer.create( getApplicationContext(), song );
                        mp.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }
            } );
            Back.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent( Lakk.this, com.example.qubeeoro.Main2Activity.class );
                    startActivity( i );
                }
            } );

            container.addView( view );

            return view;

        }


        public void destroyItem(ViewGroup container, int position, Object object) {

            container.removeView( (View) object );

        }
    }

//    public void onPause() {
//        if (mAdview != null) {
//            mAdview.pause();
//        }
//        super.onPause();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if (mAdview != null) {
//            mAdview.resume();
//        }
//    }
//
//    @Override
//    public void onDestroy() {
//        if (mAdview != null) {
//            mAdview.destroy();
//        }
//        super.onDestroy();
//    }
//    private void showInterstitial() {
//        if (mInterstitialAd.isLoaded()) {
//            mInterstitialAd.show();
//        }
//    }
//
}

