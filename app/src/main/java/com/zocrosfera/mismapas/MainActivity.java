package com.zocrosfera.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IrAlMapa(View v){

        Intent i = new Intent(this, MapsActivity.class);
        double latitud = 0.0;
        double longitud = 0.0;

        switch (v.getId())
        {
            case R.id.btnArcDelTriunf:
                latitud = 41.391247;
                longitud = 2.181004;
                break;
            case R.id.btnCampNou:
                latitud = 41.380894;
                longitud = 2.122802;
                break;
            case R.id.btnSagradaFamilia:
                latitud = 41.403630;
                longitud = 2.174345;
                break;
            case R.id.btnMuseuNacional:
                latitud = 41.368448;
                longitud = 2.153581;
                break;
        }
        i.putExtra("latitud", latitud);
        i.putExtra("longitud", longitud);
        startActivity(i);
    }
}
