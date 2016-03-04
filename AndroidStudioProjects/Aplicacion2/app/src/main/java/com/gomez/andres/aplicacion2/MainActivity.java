package com.gomez.andres.aplicacion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TextView texto;
    //Button btn;
    Integer i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn= (Button) findViewById(R.id.btn_1);
        final TextView texto= (TextView) findViewById(R.id.texto_1);

        texto.setText("Contador: "+i.toString());
        btn.setText("Contar");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                texto.setText("Contador: "+i.toString());
            }
        });







    }
}
