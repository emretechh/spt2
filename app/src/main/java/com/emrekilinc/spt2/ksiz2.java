package com.emrekilinc.spt2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

import static com.emrekilinc.spt2.ksiz1.ksiz_derinlik;
import static com.emrekilinc.spt2.ksiz1.ksiz_N;
import static com.emrekilinc.spt2.ksiz1.ksiz_cap;
import static com.emrekilinc.spt2.ksiz1.ksiz_numune;
import static com.emrekilinc.spt2.ksiz1.ksiz_tokmak;

public class ksiz2 extends AppCompatActivity {
    Spinner spinner6;
    String[] yass = {"Evet", "Hayır"};
    ArrayAdapter<String> adapter5;

    Button button11;
    Button button12;
    Button button13;
    Button button4;
    static double N160;
    static double ksiz_gama;
    static double ksiz_kesinDerinlik;
    static double ksiz_efektif_gerilme;
    double cn;
    double cn_teyit;

    EditText editText6;
    TextView textView20;
    EditText editText7;
    EditText editText9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ksiz2);
        getSupportActionBar().setTitle("Kohezyonsuz Numune");

        textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setText("N\u2081,\u2086\u2080");
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);
        editText9 = (EditText) findViewById(R.id.editText9);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button4 = (Button) findViewById(R.id.button4);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        adapter5 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, yass);
        spinner6.setAdapter(adapter5);
        }
        public void Hesapla(View view) {

        if (editText7.getText().toString().matches("") || editText6.getText().toString().matches("")) {

            editText9.setText("Lütfen Bütün Değerleri Giriniz");
        } else {

            ksiz_kesinDerinlik = Double.valueOf(editText6.getText().toString()).doubleValue();

            String a = spinner6.getSelectedItem().toString();
            ksiz_gama = Double.valueOf(editText7.getText().toString());

            if (a.equals("Evet")) {
                ksiz_efektif_gerilme = ((ksiz_gama - 9.81) * ksiz_kesinDerinlik);
            } else {
                ksiz_efektif_gerilme = ksiz_gama * ksiz_kesinDerinlik;
            }

            cn_teyit = 9.78 * Math.sqrt(1 / ksiz_efektif_gerilme);
            if (cn_teyit >= 1.7) {
                cn = 1.7;
            } else {
                cn = cn_teyit;
            }

            if (editText6.getText().toString().matches("") || editText7.getText().toString().matches("")) {
                editText9.setText("Lütfen Değerleri Giriniz");
            } else {
                N160 = ksiz_derinlik * ksiz_numune * ksiz_cap * ksiz_tokmak * ksiz_N * cn;

                editText9.setText(String.valueOf(N160));
                editText9.setText(new DecimalFormat("##.##").format(N160));
                } } }
                public void ileri (View view) {
        Intent intent = new Intent(this, finer2.class);
        startActivity(intent);
    }
    public void ts (View view) {

        Intent intent = new Intent(this, ts.class);
        startActivity(intent);
    }
}