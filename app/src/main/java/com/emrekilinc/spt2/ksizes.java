package com.emrekilinc.spt2;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

import static com.emrekilinc.spt2.ksiz1.ksiz_N;
import static com.emrekilinc.spt2.ksiz2.N160;

public class ksizes extends AppCompatActivity {

    TextView textView67;
    TextView textView70;
    TextView textView71;
    TextView textView72;
    TextView textView76;
    TextView textView74;

    static double es_1;
    static double es_2;
    static double es_3;
    static double es_4;
    static double es_5;
    double es_6;
    double es_7;

    ConstraintLayout ly13;
    int ksizess = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ksizes);

        getSupportActionBar().setTitle("Elastisite Modülü (E\u209b)");


        ly13 = (ConstraintLayout) findViewById(R.id.ly13);
        ly13.setVisibility(View.INVISIBLE);

        textView67 = (TextView) findViewById(R.id.textView67);
        textView70 = (TextView) findViewById(R.id.textView70);
        textView71 = (TextView) findViewById(R.id.textView71);
        textView72 = (TextView) findViewById(R.id.textView72);
        textView76 = (TextView) findViewById(R.id.textView76);
        textView74 = (TextView) findViewById(R.id.textView74);

        textView67.setText("   N : " + ksiz_N + "     N\u2081,\u2086\u2080: " +  new DecimalFormat("##.##").format(N160));



    }

    public void Hesapla(View view) {

        es_1 = 6000 * ksiz_N;
        textView70.setText("     Normal Konsolide Kum: " + new DecimalFormat("##.##").format(es_1) + " kpa");

        es_2 = 250 * (ksiz_N + 15);
        textView71.setText("     Doygun Kum: " + new DecimalFormat("##.##").format(es_2) + " kPa");

        es_3 = 40000 + (1050 * ksiz_N);
        textView72.setText("     Aşırı Konsolide Kum: " + new DecimalFormat("##.##").format(es_3) + " kPa");

        es_4 = 7.5 + (0.8 * ksiz_N);
        textView74.setText("     Granüler Zeminler: " + new DecimalFormat("##.##").format(es_4) + " MPa");

        es_5 = 7.5 + (0.5 * ksiz_N);
        textView76.setText(new DecimalFormat("##.##").format(es_5));
        textView76.setText("     Granüler Zeminler: " + new DecimalFormat("##.##").format(es_5) + " MPa");



    }

    public void info12 (View view) {

        if (ksizess == 0) {

            ly13.setVisibility(View.VISIBLE);
            ksizess = 1;
        }
        else {
            ly13.setVisibility(View.INVISIBLE);
            ksizess = 0;
        }



    }

    public void ileri (View view) {

        Intent intent = new Intent(this, pdf_ksiz.class);
        startActivity(intent);

    }
}
