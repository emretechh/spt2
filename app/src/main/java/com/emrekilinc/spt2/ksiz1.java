package com.emrekilinc.spt2;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ksiz1 extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    EditText editText3;
    Spinner spinner1;
    TextView textView12;

    String[] derinlik = {"3m ile 4m aralığında", "4m ile 6m aralığında", "6m ile 10m aralığında", "10m’den derin"};
    String[] alici = {"Standart numune alıcı (iç tüpü olan)", "İç tüpü olmayan numune alıcı"};
    String[] cap = {"Çap 65mm-115mm arasında", "Çap 150mm", "Çap 200mm"};
    String[] tokmak = {"Güvenli tokmak", "Halkalı tokmak", "Otomatik darbeli tokmak"};
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Button button;
    Button button6;
    static double ksiz_N;
    static double ksiz_derinlik;
    static double ksiz_numune;
    static double ksiz_cap;
    static double ksiz_tokmak;

    ArrayAdapter<String> adapter1;
    ArrayAdapter<String> adapter2;
    ArrayAdapter<String> adapter3;
    ArrayAdapter<String> adapter4;
    DecimalFormat format;

    ConstraintLayout ly14;
    int ksiz11 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ksiz1);

        ly14 = (ConstraintLayout) findViewById(R.id.ly14);
        ly14.setVisibility(View.INVISIBLE);
        textView12 = (TextView) findViewById(R.id.textView12);
        editText = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.zeditText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        button6 = (Button) findViewById(R.id.button6);
        getSupportActionBar().setTitle("Kohezyonsuz Numune");
        spinner1 = (Spinner) findViewById(R.id.spinner);
        adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, derinlik);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                    ksiz_derinlik = 0.75;
                if (position == 1)
                    ksiz_derinlik = 0.85;
                if (position == 2)
                    ksiz_derinlik = 0.95;
                if (position == 3)
                    ksiz_derinlik = 1;
                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        adapter2 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, alici);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                    ksiz_numune = 1;
                if (position == 1)
                    ksiz_numune = 1.2;
                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        adapter3 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, cap);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                    ksiz_cap = 1;
                if (position == 1)
                    ksiz_cap = 1.05;
                if (position == 2)
                    ksiz_cap = 1.15;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        adapter4 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, tokmak);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                    ksiz_tokmak = 0.885;
                if (position == 1)
                    ksiz_tokmak = 0.725;
                if (position == 2)
                    ksiz_tokmak = 1.25;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                }
        });
        }
        public void gec (View view) {

        if(editText.getText().toString().matches("")){

            textView12.setText("Lütfen N Değerini Giriniz");
        }

        else {

        Intent intent = new Intent(this, ksiz2.class);
        ksiz_N = Double.valueOf(editText.getText().toString()).doubleValue();
        startActivity(intent);
        }}
        public void info13 (View view) {

        if (ksiz11 == 0) {

            ly14.setVisibility(View.VISIBLE);
            ksiz11 = 1;
        }
        else {
            ly14.setVisibility(View.INVISIBLE);
            ksiz11 = 0;
        }

        }
}