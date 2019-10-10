package com.trianacodes.script.utapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private ImageView iv_inicio;
    private TextView tv_inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Muestra en el ActionBar el icono y el nombre de la aplicación
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        //Animación del degradado del layout
        layout = findViewById(R.id.layout);
        AnimationDrawable animacion = (AnimationDrawable) layout.getBackground();
        animacion.setEnterFadeDuration(2000);
        animacion.setExitFadeDuration(4000);
        animacion.start();

        //Animación del degradado del ImageView
        iv_inicio = findViewById(R.id.iv_Inicial);
        AnimationDrawable animacionImageView = (AnimationDrawable) iv_inicio.getBackground();
        animacionImageView.setEnterFadeDuration(2000);
        animacionImageView.setExitFadeDuration(4000);
        animacionImageView.start();

        //Parpadeo textView
        blinkTextView();

    }

    private void blinkTextView() {
        final Handler handler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int timeToBlink = 750;
                try{Thread.sleep(timeToBlink);}catch (Exception e) {}
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        tv_inicio = findViewById(R.id.tv_Inicio);
                        if(tv_inicio.getVisibility() == View.VISIBLE){
                            tv_inicio.setVisibility(View.INVISIBLE);
                        } else {
                            tv_inicio.setVisibility(View.VISIBLE);
                        }
                        blinkTextView();
                    }
                });
            }
        }).start();
    }

    public void llamadaMenu(View view){

      //  Intent socios = new Intent(this,Socios.class);
      //  startActivity(socios);

    }

}
