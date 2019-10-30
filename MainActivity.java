package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Estado;
        Spinner zonas;


        Estado = (TextView) findViewById(R.id.holaestado);
        zonas = (Spinner) findViewById(R.id.spinnerPorZonas);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.zonas,android.R.layout.simple_spinner_item);

        zonas.setAdapter(adapter);

    }
}
