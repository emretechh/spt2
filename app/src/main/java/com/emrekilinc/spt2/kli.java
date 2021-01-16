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
public class kli extends AppCompatActivity {
    EditText editText1;
    static EditText editText2;
    Spinner spinner1;
    String[] derinlik = {"3m ile 4m aralığında", "4m ile 6m aralığında", "6m ile 10m aralığında", "10m’den derin"};
    String[] alici = {"Standart numune alıcı (iç tüpü olan)", "İç tüpü olmayan numune alıcı"};
    String[] cap = {"Çap 65mm-115mm arasında", "Çap 150mm", "Çap 200mm",};
    String[] tokmak = {"Güvenli tokmak", "Halkalı tokmak", "Otomatik darbeli tokmak",};
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Button button;
    Button button8;
    int tokmak1 = 0;
    int cap1 = 0;
    int al1 = 0;
    int der1 = 0;
    int nn1 = 0;
    double y;
    double z;
    double t;
    double k;
    static double kli_N;
    static double N60;
    ArrayAdapter<String> adapter1;
    ArrayAdapter<String> adapter2;
    ArrayAdapter<String> adapter3;
    ArrayAdapter<String> adapter4;
    DecimalFormat format;
    ConstraintLayout ly1;
    ConstraintLayout ly6;
    TextView ktextView12;
    static TextView textView78;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kli);
        getSupportActionBar().setTitle("Kohezyonlu Numune");
        ktextView12 = (TextView) findViewById(R.id.ktextView12);
        ktextView12.setText("N\u2086\u2080");
        editText1 = (EditText) findViewById(R.id.editText1);
        button = (Button) findViewById(R.id.button);
        button8 = (Button) findViewById(R.id.button8);
        textView78 = (TextView) findViewById(R.id.textView78);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        adapter1 = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,derinlik);
        spinner1.setAdapter(adapter1);
        ly6 = (ConstraintLayout) findViewById(R.id.ly6);
        ly6.setVisibility(View.INVISIBLE);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                    y=0.75;
                if(position==1)
                    y=0.85;
                if (position==2)
                    y=0.95;
                if(position==3)
                    y=1;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        adapter2 = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,alici);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                    z=1;
                if(position==1)
                    z=1.2;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        adapter3 = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,cap);
        spinner3.setAdapter(adapter3);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                    t=1;
                if(position==1)
                    t=1.05;
                if (position==2)
                    t=1.15;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        adapter4 = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,tokmak);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                    k=0.885;
                if(position==1)
                    k=0.725;
                if (position==2)
                    k=1.25;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    public void Hesapla(View view) {
        if (editText1.getText().toString().matches("")) {
            textView78.setText("Lütfen N Değerini Giriniz!");
        }
        else{
            kli_N = Double.valueOf(editText1.getText().toString()).doubleValue();
            N60 = kli_N * y * z * t * k;
            textView78.setText(String.valueOf(N60));
            textView78.setText(new DecimalFormat("##.##").format(N60));
        }
    }
    public void ileri (View view) {
        Intent intent = new Intent(this, finer.class);
        startActivity(intent);
    }
    public void info (View view) {

        if (tokmak1 == 0) {

            ly1.setVisibility(View.VISIBLE);
            tokmak1 = 1;
        }
        else {
            ly1.setVisibility(View.INVISIBLE);
            tokmak1 = 0;
        }
        }
    public void info5 (View view) {
        if (nn1 == 0) {

            ly6.setVisibility(View.VISIBLE);
            nn1 = 1;
        }
        else {
            ly6.setVisibility(View.INVISIBLE);
            nn1 = 0;
        }
    }
}