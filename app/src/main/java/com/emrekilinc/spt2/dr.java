package com.emrekilinc.spt2;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


import static com.emrekilinc.spt2.kli.N60;
import static com.emrekilinc.spt2.ksiz1.ksiz_N;
import static com.emrekilinc.spt2.ksiz2.N160;
import static com.emrekilinc.spt2.ksiz2.ksiz_efektif_gerilme;

public class dr extends AppCompatActivity {
    TextView textView16;
    Button button5;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    static double d;
    double b;
    double c;
    static double dd;
    double bb;
    double cc;double dr_a;
    double dr_b;
    static double dr_c;
    ConstraintLayout ly11;
    int drr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dr);
        ly11 = (ConstraintLayout) findViewById(R.id.ly11);
        ly11.setVisibility(View.INVISIBLE);
        textView16 = (TextView) findViewById(R.id.textView16);
        button5 = (Button) findViewById(R.id.button5);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        getSupportActionBar().setTitle("Bağıl (Rölatif) Yoğunluk (D\u1d63)");
        textView16.setText(" N\u2081,\u2086\u2080 : " +  new DecimalFormat("##.##").format(N160) + "       N: " + ksiz_N);
    }
    public void Hesapla(View view) {
        if (ksiz_N>=0 && ksiz_N<=50) {
            if (ksiz_N >= 0 && ksiz_N <= 4) {
                b = ksiz_N;
                c = 3.75 * ksiz_N;
                d = 0 + c;
            } else if (ksiz_N > 4 && ksiz_N <= 10) {
                b = ksiz_N - 4;
                c = b * 20 / 6;
                d = 15 + c;
            } else if (ksiz_N > 10 && ksiz_N <= 30) {
                b = ksiz_N - 10;
                c = b * 1.5;
                d = 35 + c;
            } else if (ksiz_N > 30 && ksiz_N <= 50) {
                b = ksiz_N - 30;
                c = b;
                d = 65 + c;
            }
            editText5.setText("  % " + new DecimalFormat("##.##").format(d));
        }
        else
            {
            editText5.setText("Değer 0 - 50 arasında olmalıdır.");
        }
        if (N160<0 && N160>4){
            editText5.setText("4'den büyük değer girilmez.");
        }
        if (N160 >= 0 &&N160 <= 50) {
            if (N160 >= 0 && N160 <= 5) {
                dd = N160;
            } else if (N160 > 5 && N160 <= 10) {
                bb = N160 - 5;
                cc = bb * 5;
                dd = 5 + cc;
            } else if (N160 > 10 && N160 <= 30) {
                bb = N160 - 10;
                cc = (N160 - 10) * 1.5;
                dd = 30 + cc;
            } else if (N160 > 30 && N160 <= 50) {
                bb = N160 - 30;
                cc = (N160 - 30) * 1.75;
                dd = 60 + cc;
            }
            editText4.setText("  % " + new DecimalFormat("##.##").format(dd));
        } else {
            editText4.setText("Değer 0 - 50 arasında olmalıdır.");
        }
        dr_a = N160 / ((0.28 * ksiz_efektif_gerilme) + 27);
        dr_b = Math.pow(dr_a,0.5);
        dr_c = 100 * dr_b;
        editText3.setText("  % " + new DecimalFormat("##.##").format(dr_c));
        }
        public void ileri (View view) {
        Intent intent = new Intent(this, fi.class);
        startActivity(intent);
        }
        public void info10 (View view) {
        if (drr == 0) {

            ly11.setVisibility(View.VISIBLE);
            drr = 1;
        }
        else {
            ly11.setVisibility(View.INVISIBLE);
            drr = 0;
        }
        }
}