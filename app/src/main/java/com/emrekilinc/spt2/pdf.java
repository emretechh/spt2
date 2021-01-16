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
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static com.emrekilinc.spt2.cu.cu1;
import static com.emrekilinc.spt2.cu.cu10;
import static com.emrekilinc.spt2.cu.cu11;
import static com.emrekilinc.spt2.cu.cu2;
import static com.emrekilinc.spt2.cu.cu3;
import static com.emrekilinc.spt2.cu.cu4;
import static com.emrekilinc.spt2.cu.cu5;
import static com.emrekilinc.spt2.cu.cu6;
import static com.emrekilinc.spt2.cu.cu7;
import static com.emrekilinc.spt2.cu.cu8;
import static com.emrekilinc.spt2.cu.cu9;
import static com.emrekilinc.spt2.finer.v;
import static com.emrekilinc.spt2.kli.N60;
import static com.emrekilinc.spt2.kli.kli_N;
import static com.emrekilinc.spt2.kli_es.klies_1;
import static com.emrekilinc.spt2.kli_es.klies_2;
import static com.emrekilinc.spt2.qu.qu1;
import static com.emrekilinc.spt2.qu.qu10;
import static com.emrekilinc.spt2.qu.qu11;
import static com.emrekilinc.spt2.qu.qu2;
import static com.emrekilinc.spt2.qu.qu3;
import static com.emrekilinc.spt2.qu.qu4;
import static com.emrekilinc.spt2.qu.qu5;
import static com.emrekilinc.spt2.qu.qu6;
import static com.emrekilinc.spt2.qu.qu7;
import static com.emrekilinc.spt2.qu.qu8;
import static com.emrekilinc.spt2.qu.qu9;


public class pdf extends AppCompatActivity {

    TextView mTextEt;
    Button mSaveBtn;

    TextView textView85;
    TextView textView86;
    TextView textView87;
    TextView textView88;
    TextView textView89;
    TextView textView14;
    TextView textView96;
    TextView textView97;
    TextView textView98;
    TextView textView99;
    TextView textView100;
    TextView textView101;
    TextView textView102;
    TextView textView103;
    TextView textView104;
    TextView textView105;
    TextView textView106;
    TextView textView107;
    TextView textView108;
    TextView textView109;
    TextView textView110;
    TextView textView111;
    TextView textView112;
    TextView textView113;
    TextView textView114;
    TextView textView115;
    TextView textView116;
    TextView textView117;
    TextView textView118;
    TextView textView119;
    TextView textView120;
    TextView textView121;
    TextView textView122;
    TextView textView123;
    TextView textView124;
    TextView textView125;
    TextView textView126;
    TextView textView127;
    TextView textView128;
    TextView textView129;
    TextView textView130;
    TextView textView131;
    TextView textView132;
    TextView textView133;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf);

        getSupportActionBar().setTitle("Sonuçlar");
        mSaveBtn = (Button) findViewById(R.id.button85);
        textView85  = (TextView) findViewById(R.id.textView85);
        textView86  = (TextView) findViewById(R.id.textView86);
        textView87  = (TextView) findViewById(R.id.textView87);
        textView88  = (TextView) findViewById(R.id.textView88);
        textView89  = (TextView) findViewById(R.id.textView89);
        textView14  = (TextView) findViewById(R.id.textView14);
        textView96  = (TextView) findViewById(R.id.textView96);
        textView97  = (TextView) findViewById(R.id.textView97);
        textView98  = (TextView) findViewById(R.id.textView98);
        textView99  = (TextView) findViewById(R.id.textView99);
        textView100  = (TextView) findViewById(R.id.textView100);
        textView101  = (TextView) findViewById(R.id.textView101);
        textView102  = (TextView) findViewById(R.id.textView102);
        textView103  = (TextView) findViewById(R.id.textView103);
        textView104  = (TextView) findViewById(R.id.textView104);
        textView105  = (TextView) findViewById(R.id.textView105);
        textView106  = (TextView) findViewById(R.id.textView106);
        textView107  = (TextView) findViewById(R.id.textView107);
        textView108  = (TextView) findViewById(R.id.textView108);
        textView109  = (TextView) findViewById(R.id.textView109);
        textView110  = (TextView) findViewById(R.id.textView110);
        textView111  = (TextView) findViewById(R.id.textView111);
        textView112  = (TextView) findViewById(R.id.textView112);
        textView113  = (TextView) findViewById(R.id.textView113);
        textView114  = (TextView) findViewById(R.id.textView114);
        textView115  = (TextView) findViewById(R.id.textView115);
        textView116  = (TextView) findViewById(R.id.textView116);
        textView117  = (TextView) findViewById(R.id.textView117);
        textView118  = (TextView) findViewById(R.id.textView118);
        textView119  = (TextView) findViewById(R.id.textView119);
        textView120  = (TextView) findViewById(R.id.textView120);
        textView121  = (TextView) findViewById(R.id.textView121);
        textView122  = (TextView) findViewById(R.id.textView122);
        textView123  = (TextView) findViewById(R.id.textView123);
        textView124  = (TextView) findViewById(R.id.textView124);
        textView125  = (TextView) findViewById(R.id.textView125);
        textView126  = (TextView) findViewById(R.id.textView126);
        textView127  = (TextView) findViewById(R.id.textView127);
        textView128  = (TextView) findViewById(R.id.textView128);
        textView129  = (TextView) findViewById(R.id.textView129);
        textView130  = (TextView) findViewById(R.id.textView130);
        textView131  = (TextView) findViewById(R.id.textView131);
        textView132  = (TextView) findViewById(R.id.textView132);
        textView133  = (TextView) findViewById(R.id.textView133);

        textView86.setText("     N:" + Double.toString(kli_N));
        textView87.setText("     N\u2086\u2080:" + Double.toString(N60));
        textView88.setText("     N\u2081,\u2086\u2080f:" + new DecimalFormat("##.##").format(v));
        textView96.setText("     Killer :" + Math.round(cu1) + " kPa");
        textView97.setText("    Siltli Killer :" + Math.round(cu2) + " kPa");
        textView99.setText("    İnce Daneli Zeminler :" + Math.round(cu3) + " kPa");
        textView101.setText("     Yüksek Plastisiteli Killer :" + Math.round(cu4) + " kPa");
        textView102.setText("     Orta Plastisiteli Killer :" + Math.round(cu5) + " kPa");
        textView103.setText("     Düşük Plastisiteli Killer :" + Math.round(cu6) + " kPa");
        textView105.setText("     Killer: " + Math.round(cu7) + " kPa");
        textView107.setText("     Ince daneli zeminler: " + Math.round(cu8) + " kPa");
        textView109.setText("     Yüksek Plastisiteli Killer :" + Math.round(cu9) + " kPa");
        textView110.setText("     Düşük Plastisiteli Killer :" + Math.round(cu10) + " kPa");
        textView111.setText("     Ince daneli zeminler: " + Math.round(cu11) + " kPa");
        textView114.setText("     Killer :" + Math.round(qu1) + " kPa");
        textView115.setText("     Siltli Killer :" + Math.round(qu2) + " kPa");
        textView117.setText("     İnce Daneli Zeminler :" + Math.round(qu3) + " kPa");
        textView119.setText("     Yüksek Plastisiteli Killer :" + Math.round(qu4) +" kPa");
        textView120.setText("     Orta Plastisiteli Killer :" + Math.round(qu5) +" kPa");
        textView121.setText("     Düşük Plastisiteli Killer :" + Math.round(qu6) + " kPa");
        textView123.setText("     Killer :" + Math.round(qu7) + " kPa");
        textView125.setText("     İnce Daneli Zeminler :" + Math.round(qu8) + " kPa");
        textView127.setText("     Yüksek Plastisiteli Killer :" + Math.round(qu9) + " kPa");
        textView128.setText("     Düşük Plastisiteli Killer :" + Math.round(qu10) + " kPa");
        textView129.setText("     İnce Daneli Zeminler :" + Math.round(qu11) + " kPa");
        textView132.setText("     Killi Kum için: " + new DecimalFormat("##.##").format(klies_1) + " kPa");
        textView133.setText("     Silt, Kumlu Silt ya da Killi Silt için: " + new DecimalFormat("##.##").format(klies_2) + " kPa");
    }
    public void xx (View view) {
        Intent intent = new Intent(this, ggg.class);
        startActivity(intent);
    }
    public void aa(View view) {
        Intent intent = new Intent(this, kkz.class);
        startActivity(intent);
    }
}