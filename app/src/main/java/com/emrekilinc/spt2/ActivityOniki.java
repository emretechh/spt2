package com.emrekilinc.spt2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class ActivityOniki extends AppCompatActivity {

    EditText zeditText;
    EditText zeditText2;
    EditText editText3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oniki);

        zeditText = (EditText) findViewById(R.id.zeditText);
        zeditText2 = (EditText) findViewById(R.id.zeditText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        getSupportActionBar().setTitle("Büzülme Endeksi");
    }

    public void Hesapla(View view) {

        if (zeditText.getText().toString().matches("") || zeditText2.getText().toString().matches("")) {
            editText3.setText("Parametre Yok!!");
        } else{
            double vw = Double.valueOf(zeditText.getText().toString()).doubleValue();
            double vt = Double.valueOf(zeditText2.getText().toString()).doubleValue();
            double sonuc = vw - vt;


            editText3.setText(String.valueOf(sonuc));
            editText3.setText(new DecimalFormat("##.##").format(sonuc));
        }
        }

    public void Temizle(View view) {

        if (zeditText.getText().toString().matches("") || zeditText2.getText().toString().matches("")) {
            editText3.setText("Parametre Yok!!");
        } else {
            zeditText.setText("");
            zeditText2.setText("");
            editText3.setText("");
        }

    }

}