package com.app.playtolife.uniremingtonmanizales;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class programasview extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programasview);

        final Intent intent = new Intent(this, vista.class);

        radioGroup = (RadioGroup)findViewById(R.id.programasgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.radioButton11) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/buscador.html?isc=1&category_id=&xf_1=4&xf_2=33&programa=si");
                    startActivity(intent);
                }
                if (i == R.id.radioButton12) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/buscador.html?isc=1&category_id=&xf_1=3&xf_2=33&programa=si");
                    startActivity(intent);
                }
                if (i == R.id.radioButton13) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/buscador.html?isc=1&category_id=&xf_1=2&xf_2=33&programa=si");
                    startActivity(intent);
                }
                if (i == R.id.radioButton14) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/753-extension.html");
                    startActivity(intent);
                }
                if (i == R.id.radioButton15) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/general/programas/semilleros.html");
                    startActivity(intent);
                }
            }
        });
    }
}
