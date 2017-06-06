package com.app.playtolife.uniremingtonmanizales;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class ubicacionview extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacionview);

        final Intent intent = new Intent(this, vista.class);

        radioGroup = (RadioGroup)findViewById(R.id.ubicaciongroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.radioButton32) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/792-sede-cable.html");
                    startActivity(intent);
                }
                if (i == R.id.radioButton33) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/776-sedes-centro.html");
                    startActivity(intent);
                }
            }
        });
    }
}
