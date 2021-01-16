package com.emrekilinc.spt2;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

import static com.emrekilinc.spt2.kli.N60;
import static com.emrekilinc.spt2.kli.editText2;
import static com.emrekilinc.spt2.kli.kli_N;

public class cu extends AppCompatActivity {
    TextView textView6;
    TextView textView8;
    TextView textView23;
    Button button10;
    static double cu1;
    static double cu2;
    static double cu3;
    TextView textView27;
    static double cu4;
    static double cu5;
    static double cu6;
    TextView textView29;
    TextView textView30;
    TextView textView31;
    static double cu7;
    TextView textView33;
    static double cu8;
    TextView textView35;
    static double cu9;
    static double cu10;
    static double cu11;
    TextView textView37;
    TextView textView38;
    TextView textView39;
    ConstraintLayout ly8;
    int cuu = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cu);
        getSupportActionBar().setTitle("Drenajsız Kohezyon (c\u1d64)");
        ly8 = (ConstraintLayout) findViewById(R.id.ly8);
        ly8.setVisibility(View.INVISIBLE);
        textView6 = (TextView) findViewById(R.id.textView6);
        //textView21 = (TextView) findViewById(R.id.textView21);
        button10 = (Button) findViewById(R.id.button10);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView23 = (TextView) findViewById(R.id.textView23);
        textView27 = (TextView) findViewById(R.id.textView27);
        textView29 = (TextView) findViewById(R.id.textView29);
        textView30 = (TextView) findViewById(R.id.textView30);
        textView31 = (TextView) findViewById(R.id.textView31);
        textView33 = (TextView) findViewById(R.id.textView33);
        textView35 = (TextView) findViewById(R.id.textView35);
        textView37 = (TextView) findViewById(R.id.textView37);
        textView38 = (TextView) findViewById(R.id.textView38);
        textView39 = (TextView) findViewById(R.id.textView39);
        textView6.setText("     N: " + kli_N + "     " + "N\u2086\u2080: " + new DecimalFormat("##.##").format(N60) );
    }
    public void Hesapla (View view) {
        cu1 = 12.5 * kli_N;
        cu2 = 10 * kli_N;
        textView8.setText("     Killer :" + Math.round(cu1) + " kPa");
        textView23.setText("    Siltli Killer :" + Math.round(cu2) + " kPa");
        cu3 = 6.25 * kli_N;
        textView27.setText("    İnce Daneli Zeminler :" + Math.round(cu3) + " kPa");
        cu4 = 12.5 * kli_N;
        cu5 = 7.5 * kli_N;
        cu6 = 3.75 * kli_N;
        textView29.setText("     Yüksek Plastisiteli Killer :" + Math.round(cu4) + " kPa");
        textView30.setText("     Orta Plastisiteli Killer :" + Math.round(cu5) + " kPa");
        textView31.setText("     Düşük Plastisiteli Killer :" + Math.round(cu6) + " kPa");
        cu7 = 12 * kli_N;
        textView33.setText("     Killer: " + Math.round(cu7) + " kPa");
        cu8 = 29 * (Math.pow(kli_N,0.72));
        textView35.setText("     Ince daneli zeminler: " + Math.round(cu8) + " kPa");
        cu9 = 6.82 * N60;
        cu10 = 4.93 * N60;
        cu11 = 6.18 *  N60;
        textView39.setText("     Ince daneli zeminler: " +Math.round(cu11) + " kPa");
        textView37.setText("     Yüksek Plastisiteli Killer :" + Math.round(cu9) + " kPa");
        textView38.setText("     Düşük Plastisiteli Killer :" + Math.round(cu10) + " kPa");
        }
        public void ileri (View view) {
        Intent intent = new Intent(this, qu.class);
        startActivity(intent);
        }
        public void info7 (View view) {
        if (cuu == 0) {
            ly8.setVisibility(View.VISIBLE);
            cuu = 1;
        }
        else {
            ly8.setVisibility(View.INVISIBLE);
            cuu = 0;
        }
        }
}