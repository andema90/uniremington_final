package com.app.playtolife.uniremingtonmanizales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button signin;
    EditText email;
    EditText password;

    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);

        signin = (Button)findViewById(R.id.button);
        signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        user = email.getText().toString();
        pass = password.getText().toString();

        switch (view.getId()){
            case R.id.button:
                if("admin@admin.com.co".equals(user) && "montoya".equals(pass)){
                    Intent intent = new Intent(this, home.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, String.valueOf("Error de acceso"),Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
