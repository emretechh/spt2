package com.emrekilinc.spt2;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static com.emrekilinc.spt2.kli.N60;
import static com.emrekilinc.spt2.ksiz1.ksiz_N;
import static com.emrekilinc.spt2.ksiz2.N160;
import static com.emrekilinc.spt2.ksiz2.ksiz_efektif_gerilme;
public class fi extends AppCompatActivity {
    TextView textView56;
    TextView textView59;
    TextView textView61;
    TextView textView64;
    TextView textView66;
    static double fi_a;
    static double fi_b;
    static double fi_c;
    static double fi_d;
    double fi_e;
    double fi_f;
    double fi_g;
    Button button18;
    ConstraintLayout ly12;
    int fii = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fi);
        getSupportActionBar().setTitle("İçsel Sürtünme Açısı (Φ')");
        ly12 = (ConstraintLayout) findViewById(R.id.ly12);
        ly12.setVisibility(View.INVISIBLE);
        textView56 = (TextView) findViewById(R.id.textView56);
        textView59 = (TextView) findViewById(R.id.textView59);
        textView61 = (TextView) findViewById(R.id.textView61);
        textView64 = (TextView) findViewById(R.id.textView64);
        textView66 = (TextView) findViewById(R.id.textView66);
        button18 = (Button) findViewById(R.id.button18);
        textView56.setText(" N : " + ksiz_N + "     N\u2081,\u2086\u2080 :" +   new DecimalFormat("##.##").format(N160));
    }
    public void Hesapla(View view) {
        if (ksiz_N >= 0 && ksiz_N <= 50) {
            if (ksiz_N >= 0 && ksiz_N <= 4) {
                fi_a = 7 * ksiz_N;
            } else if (ksiz_N > 4 && ksiz_N <= 10) {
                fi_a = 28 + ((ksiz_N - 4) / 3);
            } else if (ksiz_N > 10 && ksiz_N <= 30) {
                fi_a = 30 + (((3 * ksiz_N) - 30) / 10);
            } else if (ksiz_N > 30 && ksiz_N <= 50) {
                fi_a = 36 + ((ksiz_N - 30) / 4);
            }
            textView59.setText(new DecimalFormat("##.##").format(fi_a) + "°");
        } else
        {
            textView59.setText("Değer 0 - 50 arasında olmalıdır.");
        }
        if (ksiz_N >= 0 && ksiz_N <= 50) {
            if (ksiz_N >= 0 && ksiz_N <= 4) {
                fi_b = 7.5 * ksiz_N;
            } else if (ksiz_N > 4 && ksiz_N <= 10) {
                fi_b = 30 + (((5 * ksiz_N) - 20) / 6);
            } else if (ksiz_N > 10 && ksiz_N <= 30) {
                fi_b = 35 + ((ksiz_N - 10) / 4);
            } else if (ksiz_N > 30 && ksiz_N <= 50) {
                fi_b = 40 + ((ksiz_N - 30) / 4);
            }
            textView61.setText(new DecimalFormat("##.##").format(fi_b) + "°");
        } else
        {
            textView61.setText("Değer 0 - 50 arasında olmalıdır.");
        }
        fi_c = 25 + (3.2 * (Math.sqrt(((100 * ksiz_N) / (70 + ksiz_efektif_gerilme)))));
        textView64.setText(new DecimalFormat("##.##").format(fi_c) + "°");
        fi_f = (ksiz_N / (12.2 + (20.3 * (ksiz_efektif_gerilme / 100))));
        fi_e = Math.pow(fi_f,0.34);
        fi_d = Math.toDegrees(Math.atan(fi_e));
        textView66.setText(new DecimalFormat("##.##").format(fi_d) + "°");
    }
    public void ileri(View view) {
        Intent intent = new Intent(this, ksizes.class);
        startActivity(intent);
        }
    public void info11 (View view) {
        if (fii == 0) {
            ly12.setVisibility(View.VISIBLE);
            fii = 1;
        }
        else {
            ly12.setVisibility(View.INVISIBLE);
            fii = 0;
        }
        }
}