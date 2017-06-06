package com.app.playtolife.uniremingtonmanizales;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class uniremingtonview extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniremingtonview);

        final Intent intent = new Intent(this, vista.class);

        radioGroup = (RadioGroup)findViewById(R.id.uniremingtongroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(i == R.id.radioButton){
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/general/uniremington/mision-vision.html");
                    startActivity(intent);
                }
                if(i == R.id.radioButton2){
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/general/uniremington/valores-institucionales.html");
                    startActivity(intent);
                }
                if(i == R.id.radioButton3){
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-36.html");
                    startActivity(intent);
                }
                if(i == R.id.radioButton4){
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-37.html");
                    startActivity(intent);
                }if(i == R.id.radioButton5){
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/general/uniremington/reglamento-estudiantil.html");
                    startActivity(intent);
                }if(i == R.id.radioButton6){
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/1445-directorio-administrativo.html");
                    startActivity(intent);
                }
                if(i == R.id.radioButton7){
                    intent.putExtra("uri", "http://www.uniremington.edu.co/uniremington/donde-estamos.html");
                    startActivity(intent);
                }


            }
        });
    }
}
