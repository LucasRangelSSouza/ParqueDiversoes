package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cadastrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //aqui a mágica
        setContentView(R.layout.activity_cadastrar);
    }

    public void resetView(){
        ImageView imageA = (ImageView) findViewById(R.id.imageA);
        imageA.setImageResource(R.drawable.a);

        ImageView imageB = (ImageView) findViewById(R.id.imageB);
        imageB.setImageResource(R.drawable.b);

        ImageView imageC = (ImageView) findViewById(R.id.imageC);
        imageC.setImageResource(R.drawable.c);

        ImageView imageD = (ImageView) findViewById(R.id.imageD);
        imageD.setImageResource(R.drawable.d);

        ImageView imageE = (ImageView) findViewById(R.id.imageE);
        imageE.setImageResource(R.drawable.e);

        ImageView imageF = (ImageView) findViewById(R.id.imageF);
        imageF.setImageResource(R.drawable.f);


    }

    public void selecionarA(View view){
        this.resetView();
        ImageView imageA = (ImageView) findViewById(R.id.imageA);
        imageA.setImageResource(R.drawable.as);

        ImageView avatarA = (ImageView) findViewById(R.id.avatarGrande);
        avatarA.setImageResource(R.drawable.ac);

    }

    public void selecionarB(View view){
        this.resetView();
        ImageView imageB = (ImageView) findViewById(R.id.imageB);
        imageB.setImageResource(R.drawable.bs);

        ImageView avatarB = (ImageView) findViewById(R.id.avatarGrande);
        avatarB.setImageResource(R.drawable.bc);


    }
    public void selecionarC(View view){
        this.resetView();
        ImageView imageC = (ImageView) findViewById(R.id.imageC);
        imageC.setImageResource(R.drawable.cs);

        ImageView avatarC = (ImageView) findViewById(R.id.avatarGrande);
        avatarC.setImageResource(R.drawable.cc);

    }

    public void selecionarD(View view){
        this.resetView();
        ImageView imageD = (ImageView) findViewById(R.id.imageD);
        imageD.setImageResource(R.drawable.ds);

        ImageView avatarD = (ImageView) findViewById(R.id.avatarGrande);
        avatarD.setImageResource(R.drawable.dc);


    }

    public void selecionarE(View view){
        this.resetView();
        ImageView imageE = (ImageView) findViewById(R.id.imageE);
        imageE.setImageResource(R.drawable.es);

        ImageView avatarE = (ImageView) findViewById(R.id.avatarGrande);
        avatarE.setImageResource(R.drawable.ec);

    }

    public void selecionarF(View view){
        this.resetView();
        ImageView imageF = (ImageView) findViewById(R.id.imageF);
        imageF.setImageResource(R.drawable.fs);

        ImageView avatarF= (ImageView) findViewById(R.id.avatarGrande);
        avatarF.setImageResource(R.drawable.fc);


    }

    public void login(View view) {

        Intent login = new Intent(this, login.class);
        startActivity(login);
    }
}
