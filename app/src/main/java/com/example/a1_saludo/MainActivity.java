package com.example.a1_saludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //DECLARACIÓN DE LAS VARIABLES GLOBALES
    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //METODOS
    //MOSTRAR TEXTO
    public void ShowText (View view){
        et = (EditText)findViewById(R.id.PlainText_Saludo);
        tv = (TextView)findViewById(R.id.textView_textomostrado);

        String textoAMostrar = et.getText().toString();
        tv.setText(textoAMostrar);

        Toast notificacion = Toast.makeText(MainActivity.this, textoAMostrar, Toast.LENGTH_LONG);
        notificacion.show();
    }

    //BORRAR TEXTO
    public void Borrar(View view){
        et = (EditText)findViewById(R.id.PlainText_Saludo);
        tv = (TextView)findViewById(R.id.textView_textomostrado);

        et.setText("");
        tv.setText("");
    }

}