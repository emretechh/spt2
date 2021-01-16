package com.emrekilinc.spt2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class ActivitySekiz extends AppCompatActivity {

    EditText zeditText;
    EditText zeditText2;
    EditText editText3;
    EditText editText6;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekiz);

        zeditText = (EditText) findViewById(R.id.zeditText);
        zeditText2 = (EditText) findViewById(R.id.zeditText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText6 = (EditText) findViewById(R.id.editText6);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        getSupportActionBar().setTitle("Kohezyonsuz numune bağıl yoğunluğu (Boşluk oranına göre)  (Dr)");
    }
    public void Hesapla(View view) {

        if (zeditText.getText().toString().matches("") || zeditText2.getText().toString().matches("") || editText3.getText().toString().matches("")) {
            editText6.setText("Parametre Yok!!");
        } else{
            double vw = Double.valueOf(zeditText.getText().toString()).doubleValue();
            double vt = Double.valueOf(zeditText2.getText().toString()).doubleValue();
            double yy = Double.valueOf(editText3.getText().toString()).doubleValue();
            double t = vw - yy;
            double u = vw - vt;
            double sonuc = t / u;
            editText6.setText(String.valueOf(sonuc));
            editText6.setText(new DecimalFormat("##.##").format(sonuc));
            }
            }
            public void Temizle(View view) {

        if (zeditText.getText().toString().matches("") || zeditText2.getText().toString().matches("") || editText3.getText().toString().matches("")) {
            editText6.setText("Parametre Yok!!");
        } else {
            zeditText.setText("");
            zeditText2.setText("");
            editText3.setText("");
            editText6.setText("");
        }
        }
}