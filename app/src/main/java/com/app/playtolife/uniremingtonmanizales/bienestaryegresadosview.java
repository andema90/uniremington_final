package com.app.playtolife.uniremingtonmanizales;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class bienestaryegresadosview extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienestaryegresadosview);

        final Intent intent = new Intent(this, vista.class);

        radioGroup = (RadioGroup)findViewById(R.id.bienestaryegresadosgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.radioButton28) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/internacionalizacion.html");
                    startActivity(intent);
                }
                if (i == R.id.radioButton29) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/1459-convenios-bienestar.html");
                    startActivity(intent);
                }
            }
        });
    }
}
