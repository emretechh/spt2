package com.emrekilinc.spt2;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static com.emrekilinc.spt2.kli.N60;
import static com.emrekilinc.spt2.kli.editText2;
import static com.emrekilinc.spt2.kli.textView78;
import static com.emrekilinc.spt2.ksiz2.N160;
public class finer extends AppCompatActivity {
    EditText editText4;
    EditText editText5;
    TextView textView8;
    TextView textView10;
    TextView textView11;
    static double v;
    double c;
    double b;
    double x;
    ConstraintLayout ly7;
    int fn = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finer);
        ly7 = (ConstraintLayout) findViewById(R.id.ly7);
        ly7.setVisibility(View.INVISIBLE);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView10 = (TextView) findViewById(R.id.textView10);
        getSupportActionBar().setTitle("SPT Verilerinin İnce Dane İçeriğine Göre Düzeltilmesi");
        textView10.setText("N\u2081,\u2086\u2080f");
            textView11.setText("N\u2086\u2080: " +  new DecimalFormat("##.##").format(N60));
    }
    public void Hesapla (View view ) {
        if(editText4.getText().toString().matches("")) {
            editText5.setText("Lütfen Değeri Giriniz");
        }
        else {
        double x = Double.valueOf(editText4.getText().toString()).doubleValue();
        if (editText4.getText().toString().matches("")) {
            editText5.setText("Lütfen İnce Dane Oranını Giriniz!");
        }
        else{ if (x <= 5){
            v = N60;
        }
        else if (x>5 && x<35){
            c = Math.exp(1.76 - (190 / (Math.pow(x,2))));
            b = (0.99 + ((Math.pow(x,1.5) / 1000)));
            v = c + (b * N60);
        }
        else if (x >= 35){
            c = 5;
            b = 1.2;
            v = c + (b * N60);
        }
            editText5.setText(String.valueOf(v));
            editText5.setText(new DecimalFormat("##.##").format(v));
        }
    }}
    public void ileri (View view) {
            Intent intent = new Intent(this, cu.class);
            startActivity(intent);
    }
    public void info6 (View view) {
        if (fn == 0) {
            ly7.setVisibility(View.VISIBLE);
            fn = 1;
        }
        else {
            ly7.setVisibility(View.INVISIBLE);
            fn = 0;
        }
    }
}