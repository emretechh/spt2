package com.emrekilinc.spt2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static com.emrekilinc.spt2.dr.d;
import static com.emrekilinc.spt2.dr.dd;
import static com.emrekilinc.spt2.dr.dr_c;
import static com.emrekilinc.spt2.fi.fi_a;
import static com.emrekilinc.spt2.fi.fi_b;
import static com.emrekilinc.spt2.fi.fi_c;
import static com.emrekilinc.spt2.fi.fi_d;
import static com.emrekilinc.spt2.finer.v;
import static com.emrekilinc.spt2.finer2.vv;
import static com.emrekilinc.spt2.kli.N60;
import static com.emrekilinc.spt2.kli.kli_N;
import static com.emrekilinc.spt2.kli.textView78;
import static com.emrekilinc.spt2.ksiz1.ksiz_N;
import static com.emrekilinc.spt2.ksiz2.N160;
import static com.emrekilinc.spt2.ksiz2.ksiz_efektif_gerilme;
import static com.emrekilinc.spt2.ksizes.es_1;
import static com.emrekilinc.spt2.ksizes.es_2;
import static com.emrekilinc.spt2.ksizes.es_3;
import static com.emrekilinc.spt2.ksizes.es_4;
import static com.emrekilinc.spt2.ksizes.es_5;

public class pdf_ksiz extends AppCompatActivity {

    TextView mTextEt;
    Button mSaveBtn;

    TextView textView138;
    TextView textView139;
    TextView textView140;
    TextView textView141;
    TextView textView144;
    TextView textView146;
    TextView textView148;
    TextView textView151;
    TextView textView153;
    TextView textView155;
    TextView textView157;
    TextView textView135;
    TextView textView136;
    TextView textView159;
    TextView textView161;
    TextView textView163;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_ksiz);
        getSupportActionBar().setTitle("Sonuçlar");

        mSaveBtn = (Button) findViewById(R.id.button38);
        mTextEt  = (TextView) findViewById(R.id.textView136);
        textView138 = (TextView) findViewById(R.id.textView138);
        textView139 = (TextView) findViewById(R.id.textView139);
        textView140 = (TextView) findViewById(R.id.textView140);
        textView141 = (TextView) findViewById(R.id.textView141);
        textView144 = (TextView) findViewById(R.id.textView144);
        textView146 = (TextView) findViewById(R.id.textView146);
        textView148 = (TextView) findViewById(R.id.textView148);
        textView151 = (TextView) findViewById(R.id.textView151);
        textView153 = (TextView) findViewById(R.id.textView153);
        textView155 = (TextView) findViewById(R.id.textView155);
        textView157 = (TextView) findViewById(R.id.textView157);
        textView135 = (TextView) findViewById(R.id.textView135);
        textView159 = (TextView) findViewById(R.id.textView159);
        textView161 = (TextView) findViewById(R.id.textView161);
        textView163 = (TextView) findViewById(R.id.textView163);

        textView138.setText("     N:" + Double.toString(ksiz_N));
        textView139.setText("     Efektif Gerilme: " + new DecimalFormat("##.##").format(ksiz_efektif_gerilme) + " kN/m\u00b2");
        textView140.setText("     N\u2081,\u2086\u2080: " +  new DecimalFormat("##.##").format(N160));
        textView141.setText("     N\u2081,\u2086\u2080f:" + new DecimalFormat("##.##").format(vv));
        textView144.setText("     % " + new DecimalFormat("##.##").format(d));
        textView146.setText("     % " + new DecimalFormat("##.##").format(dd));
        textView148.setText("     % " + new DecimalFormat("##.##").format(dr_c));
        textView151.setText("     " + new DecimalFormat("##.##").format(fi_a) + "°");
        textView153.setText("     " + new DecimalFormat("##.##").format(fi_b) + "°");
        textView155.setText("     " + new DecimalFormat("##.##").format(fi_c) + "°");
        textView157.setText("     " + new DecimalFormat("##.##").format(fi_d) + "°");
        textView135.setText("     Normal Konsolide Kum: " + new DecimalFormat("##.##").format(es_1) + " kpa");
        mTextEt.setText("     Doygun Kum: " + new DecimalFormat("##.##").format(es_2) + " kPa");
        textView159.setText("     Aşırı Konsolide Kum: " + new DecimalFormat("##.##").format(es_3) + " kPa");
        textView161.setText("     Granüler Zeminler: " + new DecimalFormat("##.##").format(es_4) + " MPa");
        textView163.setText("     Granüler Zeminler: " + new DecimalFormat("##.##").format(es_5) + " MPa");

    }
    public void xx (View view) {
        Intent intent = new Intent(this, ggg.class);
        startActivity(intent);
    }
    public void aa (View view) {
        Intent intent = new Intent(this, kkz.class);
        startActivity(intent);
    }
}