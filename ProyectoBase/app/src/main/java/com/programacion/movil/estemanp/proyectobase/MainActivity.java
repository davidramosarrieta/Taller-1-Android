package com.programacion.movil.estemanp.proyectobase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtCiclos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCiclos=(TextView) findViewById(R.id.txtCiclo);
        txtCiclos.setText("On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        txtCiclos.setText("On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        txtCiclos.setText("On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        txtCiclos.setText("On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        txtCiclos.setText("On Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        txtCiclos.setText("On Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        txtCiclos.setText("On Destroy");
    }
}