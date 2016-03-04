package com.gomez.andres.aplicacion2;

import android.gesture.GestureOverlayView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TextView texto;
    //Button btn;
    Integer val_x=0;
    Integer val_y=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn= (Button) findViewById(R.id.btn);
        final TextView texto1= (TextView) findViewById(R.id.texto1);
        final TextView texto2= (TextView) findViewById(R.id.texto2);
        final EditText x= (EditText) findViewById(R.id.x);
        final EditText y= (EditText) findViewById(R.id.y);
        final SurfaceView superficie=(SurfaceView) findViewById(R.id.surfaceView);

        texto1.setText("Coordenada X:");
        texto2.setText("Coordenada Y:");
        btn.setText("Imprimir");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val_x=Integer.valueOf(x.getText().toString());
                val_y=Integer.valueOf(y.getText().toString());
            }
        });








    }
}
