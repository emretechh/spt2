package com.emrekilinc.spt2;

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

public class ActivityOnbes extends AppCompatActivity {
    TextView textView6;
    EditText zeditText;
    EditText zeditText2;
    EditText editText3;
    EditText editText5;
    Button button4;
    Button button5;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onbes);

        zeditText = (EditText) findViewById(R.id.zeditText);
        zeditText2 = (EditText) findViewById(R.id.zeditText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText5 = (EditText) findViewById(R.id.editText5);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        spinner = (Spinner)findViewById(R.id.spinner);
        textView6 = (TextView)findViewById(R.id.textView6);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.sular, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getSelectedItem().toString().equals("Su birim ağırlığı (γw) (kg / m³)"))
                    textView6.setText("Numunenin kuru birim ağırlığı (γdry) (Kg / m³)");

                else if (parent.getSelectedItem().toString().equals("Su birim ağırlığı (γw) (N / m³)"))
                    textView6.setText("Numunenin kuru birim ağırlığı (γdry) (N / m³)");

                else if (parent.getSelectedItem().toString().equals("Su birim ağırlığı (γw) (Ib / ft³)"))
                    textView6.setText("Numunenin kuru birim ağırlığı (γdry) (Ib / ft³)");

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        getSupportActionBar().setTitle("Numunenin Birim Ağırlığı");
    }

    public void Hesapla(View view) {

        if (zeditText.getText().toString().matches("") || zeditText2.getText().toString().matches("") || editText3.getText().toString().matches("") ) {
            editText5.setText("Parametre Yok!!");
        } else{
            double a = Double.valueOf(zeditText.getText().toString()).doubleValue();
            double b = Double.valueOf(zeditText2.getText().toString()).doubleValue();
            double c = Double.valueOf(editText3.getText().toString()).doubleValue();

            double d = a * b;
            double e = 1 + c;

            double sonuc = d / e;


            editText5.setText(String.valueOf(sonuc));
            editText5.setText(new DecimalFormat("##.##").format(sonuc));
            }
        }

    public void Temizle(View view) {
        if (zeditText.getText().toString().matches("") || zeditText2.getText().toString().matches("") || editText3.getText().toString().matches("") ) {
            editText5.setText("Parametre Yok!!");
        } else {
            zeditText.setText("");
            zeditText2.setText("");
            editText3.setText("");
            editText5.setText("");
            }
            }
}