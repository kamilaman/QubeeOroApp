package com.example.qubeeoro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
    }

    public void A(View view) {
        Intent i = new Intent( Main3Activity.this, Aa.class );
        startActivity( i );

    }

    public void B(View view) {
        Intent i = new Intent( Main3Activity.this, Ba.class );
        startActivity( i );

    }

    public void C(View view) {
        Intent i = new Intent( Main3Activity.this, com.example.qubeeoro.Cc.class );
        startActivity( i );
    }

    public void D(View view) {
        Intent i = new Intent( Main3Activity.this, com.example.qubeeoro.Dd.class );
        startActivity( i );

    }

    public void E(View view) {
        Intent i = new Intent( Main3Activity.this, Ee.class );
        startActivity( i );
    }

    public void F(View view) {
        Intent i = new Intent( Main3Activity.this, com.example.qubeeoro.Ff.class );
        startActivity( i );
    }

    public void G(View view) {
        Intent i = new Intent( Main3Activity.this, Gg.class );
        startActivity( i );
    }

    public void H(View view) {
        Intent i = new Intent( Main3Activity.this, Hh.class );
        startActivity( i );
    }

    public void I(View view) {
        Intent i = new Intent( Main3Activity.this, Ii.class );
        startActivity( i );

    }

    public void J(View view) {
        Intent i = new Intent( Main3Activity.this, Jj.class );
        startActivity( i );

    }

    public void K(View view) {
        Intent i = new Intent( Main3Activity.this, Kk.class );
        startActivity( i );

    }

    public void L(View view) {
        Intent i = new Intent( Main3Activity.this, Ll.class );
        startActivity( i );

    }

    public void M(View view) {
        Intent i = new Intent( Main3Activity.this, com.example.qubeeoro.Mm.class );
        startActivity( i );
    }

    public void N(View view) {
        Intent i = new Intent( Main3Activity.this, Nn.class );
        startActivity( i );

    }
    public void O1(View view) {
        Intent i = new Intent( Main3Activity.this, com.example.qubeeoro.Oo.class );
        startActivity( i );
    }

    public void P(View view) {
        Intent i = new Intent( Main3Activity.this, com.example.qubeeoro.Pp.class );
        startActivity( i );

    }

    public void Q(View view) {
        Intent i = new Intent( Main3Activity.this, Qq.class );
        startActivity( i );

    }

    public void R(View view) {
        Intent i = new Intent( Main3Activity.this, Rr.class );
        startActivity( i );

    }

    public void S(View view) {
        Intent i = new Intent( Main3Activity.this, Ss.class );
        startActivity( i );

    }
    public void T1(View view) {
        Intent i = new Intent( Main3Activity.this, com.example.qubeeoro.Tt.class );
        startActivity( i );
    }

    public void U(View view) {
        Intent i = new Intent( Main3Activity.this, Uu.class );
        startActivity( i );

    }
    public void V1(View view) {
        Intent i = new Intent( Main3Activity.this, Vv.class );
        startActivity( i );
    }
    public void W1(View view) {
        Intent i = new Intent( Main3Activity.this, Ww.class );
        startActivity( i );
    }

    public void X1(View view) {
        Intent i = new Intent( Main3Activity.this, com.example.qubeeoro.Xx.class );
        startActivity( i );
    }
    public void Y1(View view) {
        Intent i = new Intent( Main3Activity.this, Yy.class );
        startActivity( i );
    }
    public void Z(View view) {
        Intent i = new Intent( Main3Activity.this, Zz.class );
        startActivity( i );

    }

    @Override
    public void onBackPressed() {
        Intent i2= new Intent( Main3Activity.this, com.example.qubeeoro.Main2Activity.class );
        startActivity( i2 );
        finish();
    }

}
