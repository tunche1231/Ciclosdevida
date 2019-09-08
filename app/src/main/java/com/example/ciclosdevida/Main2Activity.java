package com.example.ciclosdevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txt_edad;
    TextView txt_nombre;
    Button Btn_regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt_edad = findViewById(R.id.edad);
        txt_nombre = findViewById(R.id.nombre);
        Btn_regresar = findViewById(R.id.btn_regresar);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("Nombre");
        int edad = intent.getIntExtra("Edad", 18);

        txt_edad.setText(String.valueOf(edad));
        txt_nombre.setText(nombre);


        Btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("respuesta", "regresar de vuelta");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
