package com.app.playtolife.uniremingtonmanizales;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class admisionesview extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admisionesview);

        final Intent intent = new Intent(this, vista.class);

        radioGroup = (RadioGroup)findViewById(R.id.admisionesgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.radioButton16) {
                    intent.putExtra("uri", "https://www.q10academico.com/preinscripcion?aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");
                    startActivity(intent);
                }
                if (i == R.id.radioButton17) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/778-requisitos-de-inscripcion.html");
                    startActivity(intent);
                }
                if (i == R.id.radioButton18) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/782-homologaciones.html");
                    startActivity(intent);
                }
                if (i == R.id.radioButton19) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/779-formas-de-pago.html");
                    startActivity(intent);
                }
                if (i == R.id.radioButton20) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/781-convenios-y-descuentos.html");
                    startActivity(intent);
                }
            }
        });
    }
}
