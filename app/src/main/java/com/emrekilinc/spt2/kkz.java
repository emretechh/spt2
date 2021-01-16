package com.emrekilinc.spt2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class kkz extends AppCompatActivity {
    Button kohezyonlu;
    Button kohezyonsuz;
    Button button22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kkz);

        getSupportActionBar().setTitle("SPT");
        kohezyonlu = (Button) findViewById(R.id.button2);
        kohezyonsuz = (Button) findViewById(R.id.button3);
        button22 = (Button) findViewById(R.id.button22);
        }

    public void kohezyonlu (View view) {
        Intent intent = new Intent(this, kli.class);
        startActivity(intent);
    }

    public void kohezyonsuz(View view) {
        Intent intent = new Intent(this, ksiz1.class);
        startActivity(intent);
    }

    public void zemin(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
