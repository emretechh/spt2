package com.emrekilinc.spt2;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

import static com.emrekilinc.spt2.kli.N60;
import static com.emrekilinc.spt2.kli.kli_N;

public class qu extends AppCompatActivity {

    TextView textView63;
   // TextView textView46;
    TextView textView48;
    TextView textView49;
    Button button15;
    Button button20;
    static double qu1;
    static double qu2;
    static double qu3;
    TextView textView51;
    static double qu4;
    static double qu5;
    static double qu6;
    TextView textView53;
    TextView textView54;
    TextView textView55;
    static double qu7;
    TextView textView25;
    static double qu8;
    TextView textView41;
    static double qu9;
    static double qu10;
    static double qu11;
    TextView textView43;
    TextView textView44;
    TextView textView45;

    ConstraintLayout ly9;
    int quu = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qu);
        getSupportActionBar().setTitle("Serbeset Basınç Dayanımı (q\u1d64)");

        ly9 = (ConstraintLayout) findViewById(R.id.ly9);
        ly9.setVisibility(View.INVISIBLE);

        textView63 = (TextView) findViewById(R.id.textView63);
       //textView46 = (TextView) findViewById(R.id.textView46);
        button15 = (Button) findViewById(R.id.button15);
        button20 = (Button) findViewById(R.id.button20);
        textView48 = (TextView) findViewById(R.id.textView48);
        textView49 = (TextView) findViewById(R.id.textView49);
        textView51 = (TextView) findViewById(R.id.textView51);
        textView53 = (TextView) findViewById(R.id.textView53);
        textView54 = (TextView) findViewById(R.id.textView54);
        textView55 = (TextView) findViewById(R.id.textView55);
        textView25 = (TextView) findViewById(R.id.textView25);
        textView41 = (TextView) findViewById(R.id.textView41);
        textView43 = (TextView) findViewById(R.id.textView43);
        textView44 = (TextView) findViewById(R.id.textView44);
        textView45 = (TextView) findViewById(R.id.textView45);


        textView63.setText("     N: " + kli_N + "  N\u2086\u2080: " + new DecimalFormat("##.##").format(N60) );
    }

    public void Hesapla (View view) {

        qu1 = 25 * kli_N;
        qu2 = 20 * kli_N;
        textView48.setText("     Killer :" + Math.round(qu1) + " kPa");
        textView49.setText("     Siltli Killer :" + Math.round(qu2) + " kPa" );

        qu3 = 12.5 * kli_N;
        textView51.setText("     İnce Daneli Zeminler :" + Math.round(qu3) + " kPa");

        qu4 = 25 * kli_N;
        qu5 = 15 * kli_N;
        qu6 = 7.5 * kli_N;
        textView53.setText("     Yüksek Plastisiteli Killer :" + Math.round(qu4) +" kPa");
        textView54.setText("     Orta Plastisiteli Killer :" + Math.round(qu5) +" kPa");
        textView55.setText("     Düşük Plastisiteli Killer :" + Math.round(qu6) + " kPa" );

        qu7 = 24 * kli_N;
        textView25.setText("     Killer :" + Math.round(qu7) + " kPa");

        qu8 = 58 * (Math.pow(kli_N,0.72));
        textView41.setText("     İnce Daneli Zeminler :" + Math.round(qu8) + " kPa");

        qu9 = 13.63 * N60;
        qu10 = 9.85 * N60;
        qu11 = 12.36 *  N60;
        textView43.setText("     Yüksek Plastisiteli Killer :" + Math.round(qu9) + " kPa");
        textView44.setText("     Düşük Plastisiteli Killer :" + Math.round(qu10) + " kPa");
        textView45.setText("     İnce Daneli Zeminler :" + Math.round(qu11) + " kPa");

        }
    public void ileri (View view) {

        Intent intent = new Intent(this, kli_es.class);
        startActivity(intent);
    }
    public void info8 (View view) {

        if (quu == 0) {

            ly9.setVisibility(View.VISIBLE);
            quu = 1;
        }
        else {
            ly9.setVisibility(View.INVISIBLE);
            quu = 0;
        }
    }
}