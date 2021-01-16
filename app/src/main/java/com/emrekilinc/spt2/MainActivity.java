package com.emrekilinc.spt2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bir;
    Button iki;
    Button uc;
    Button dort;
    Button bes;
    Button alti;
    Button yedi;
    Button sekiz;
    Button dokuz;
    Button on;
    Button onbir;
    Button oniki;
    Button onuc;
    Button ondort;
    Button onbes;
    Button onalti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bir = (Button) findViewById(R.id.button);
        iki = (Button) findViewById(R.id.button2);
        uc = (Button) findViewById(R.id.button3);
        dort = (Button) findViewById(R.id.button6);
        bes = (Button) findViewById(R.id.button7);
        alti = (Button) findViewById(R.id.button8);
        yedi = (Button) findViewById(R.id.button9);
        sekiz = (Button) findViewById(R.id.button10);
        dokuz = (Button) findViewById(R.id.button11);
        on = (Button) findViewById(R.id.button12);
        onbir = (Button) findViewById(R.id.button13);
        oniki = (Button) findViewById(R.id.button14);
        onuc = (Button) findViewById(R.id.button15);
        ondort = (Button) findViewById(R.id.button16);
        onbes = (Button) findViewById(R.id.button19);
        onalti = (Button) findViewById(R.id.button20);
        getSupportActionBar().setTitle("Bir Parametre Seçiniz");
    }

    public void bir(View view) {
        Intent intent = new Intent(this, ActivityBir.class);
        startActivity(intent);
    }

    public void iki(View view) {
        Intent intent = new Intent(this, ActivityIki.class);
        startActivity(intent);
    }

    public void uc(View view) {
        Intent intent = new Intent(this, ActivityUc.class);
        startActivity(intent);
    }

    public void dort(View view) {
        Intent intent = new Intent(this, ActivityDort.class);
        startActivity(intent);
    }

    public void bes(View view) {
        Intent intent = new Intent(this, ActivityBes.class);
        startActivity(intent);
    }

    public void alti(View view) {
        Intent intent = new Intent(this, ActivityAlti.class);
        startActivity(intent);
    }

    public void yedi(View view) {
        Intent intent = new Intent(this, ActivityYedi.class);
        startActivity(intent);
    }

    public void sekiz(View view) {
        Intent intent = new Intent(this, ActivitySekiz.class);
        startActivity(intent);
    }

    public void dokuz(View view) {
        Intent intent = new Intent(this, ActivityDokuz.class);
        startActivity(intent);
    }

    public void on(View view) {
        Intent intent = new Intent(this, ActivityOn.class);
        startActivity(intent);
    }

    public void onbir(View view) {
        Intent intent = new Intent(this, ActivityOnbir.class);
        startActivity(intent);
    }

    public void oniki(View view) {
        Intent intent = new Intent(this, ActivityOniki.class);
        startActivity(intent);
    }

    public void onuc(View view) {
        Intent intent = new Intent(this, ActivityOnuc.class);
        startActivity(intent);
    }

    public void ondort(View view) {
        Intent intent = new Intent(this, ActivityOndort.class);
        startActivity(intent);
    }

    public void onbes(View view) {
        Intent intent = new Intent(this, ActivityOnbes.class);
        startActivity(intent);
    }

    public void onalti(View view) {
        Intent intent = new Intent(this, ActivityOnalti.class);
        startActivity(intent);
    }

}