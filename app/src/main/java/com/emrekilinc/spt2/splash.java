package com.emrekilinc.spt2;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                Intent i = new Intent(splash.this, kkz.class); startActivity(i);
                finish(); } }, 1500);
    }
}
