package com.app.playtolife.uniremingtonmanizales;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class plataformasview extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plataformasview);

        final Intent intent = new Intent(this, vista.class);

        radioGroup = (RadioGroup)findViewById(R.id.plataformasgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.radioButton21) {
                    intent.putExtra("uri", "http://virtual.uniremingtonmanizales.edu.co/moodle/login/index.php");
                    startActivity(intent);
                }
                if (i == R.id.radioButton22) {
                    intent.putExtra("uri", "https://www.q10academico.com/login?ReturnUrl=/&aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");
                    startActivity(intent);
                }
                if (i == R.id.radioButton23) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/843-recibo-de-matricula.html");
                    startActivity(intent);
                }
                if (i == R.id.radioButton24) {
                    intent.putExtra("uri", "http://www.uniremington.edu.co/manizales/844-documentos-nuevos.html");
                    startActivity(intent);
                }
                if (i == R.id.radioButton25) {
                    intent.putExtra("uri", "http://reservas.uniremingtonmanizales.edu.co/login.php");
                    startActivity(intent);
                }
                if (i == R.id.radioButton26) {
                    intent.putExtra("uri", "http://biblioteca.uniremington.edu.co/index.php/login");
                    startActivity(intent);
                }
                if (i == R.id.radioButton27) {
                    intent.putExtra("uri", "http://sim.uniremington.edu.co/formrem/pqrs/");
                    startActivity(intent);
                }
            }
        });
    }
}
