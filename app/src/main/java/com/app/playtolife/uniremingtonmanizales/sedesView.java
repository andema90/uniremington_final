package com.app.playtolife.uniremingtonmanizales;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class sedesView extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes_view);

        final Intent intent = new Intent(this, vista.class);

        radioGroup = (RadioGroup)findViewById(R.id.sedesgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.radioButton8) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/armenia/");
                    startActivity(intent);
                }
                if (i == R.id.radioButton9) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/");
                    startActivity(intent);
                }
                if (i == R.id.radioButton10) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/pereira/");
                    startActivity(intent);
                }
            }
        });
    }
}
