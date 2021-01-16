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
import static com.emrekilinc.spt2.ksiz2.N160;
public class kli_es extends AppCompatActivity {
    TextView textView77;
    TextView textView80;
    TextView textView81;
    Button button23;
    static double klies_1;
    static double klies_2;
    ConstraintLayout ly10;
    int kliess = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kli_es);

        getSupportActionBar().setTitle("Elastisite Modülü (E\u209b)");

        ly10 = (ConstraintLayout) findViewById(R.id.ly10);
        ly10.setVisibility(View.INVISIBLE);

        textView77 = (TextView) findViewById(R.id.textView77);
        textView80 = (TextView) findViewById(R.id.textView80);
        textView81 = (TextView) findViewById(R.id.textView81);
        button23 = (Button) findViewById(R.id.button23);
        textView77.setText("    N : " + kli_N + "     N\u2086\u2080: " + new DecimalFormat("##.##").format(N60));

    }
    public void Hesapla (View view) {

        klies_1 = 320 * (kli_N + 15);
        textView80.setText("     Killi Kum için: " + new DecimalFormat("##.##").format(klies_1) + " kPa" );

        klies_2 = 300 * (kli_N + 6);
        textView81.setText("     Silt, Kumlu Silt ya da Killi Silt için: " + new DecimalFormat("##.##").format(klies_2) + " kPa");

    }
    public void info9 (View view) {
        if (kliess == 0) {
            ly10.setVisibility(View.VISIBLE);
            kliess = 1;
        }
        else {
            ly10.setVisibility(View.INVISIBLE);
            kliess = 0;
        }
    }
    public void ileri(View view) {
        Intent intent = new Intent(this, pdf.class);
        startActivity(intent);
    }
}