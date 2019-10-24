package com.dwi.ainterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.PackageInfoCompat;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText editnpm;
    EditText editnama;
    Button btnkirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editnama = (EditText) findViewById(R.id.editnama);
        editnpm = (EditText) findViewById(R.id.editnpm);
        btnkirim = (Button) findViewById(R.id.btnkirim);

        btnkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editnpm.getText().toString();
                String datas = editnama.getText().toString();

                Intent next = new Intent(MainActivity.this, hal2.class);
                next.putExtra("data", data);
                next.putExtra("datas", datas);
                startActivity(next);

                finish();

            }

        });
    }}

