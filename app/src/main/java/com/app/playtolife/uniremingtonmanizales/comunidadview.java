package com.app.playtolife.uniremingtonmanizales;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class comunidadview extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunidadview);

        final Intent intent = new Intent(this, vista.class);

        radioGroup = (RadioGroup)findViewById(R.id.comunidadgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.radioButton30) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/general/comunidad/calendario-eventos.html");
                    startActivity(intent);
                }
                if (i == R.id.radioButton31) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/1460-encuesta-bienestar-universitario-y-egresados.html");
                    startActivity(intent);
                }
            }
        });
    }
}
