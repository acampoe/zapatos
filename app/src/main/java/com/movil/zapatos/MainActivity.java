package com.movil.zapatos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
private Spinner genero;
private Spinner marca;
private Spinner estilo;
private Resources recursos;
private String[] generos;
private String[] estilos;
private String[] marcas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        recursos = this.getResources();
        genero = findViewById(R.id.cmbSexo);
        marca = findViewById(R.id.cmbMarca);
        estilo = findViewById(R.id.cmbEstilo);

        generos = recursos.getStringArray(R.array.generos);
        estilos = recursos.getStringArray(R.array.estilos);
        marcas = recursos.getStringArray(R.array.marcas);

        ArrayAdapter<String> adapterGeneros = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,generos);
        ArrayAdapter<String> adapterEstilos = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,estilos);
        ArrayAdapter<String> adapterMarcas = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,marcas);

        genero.setAdapter(adapterGeneros);
        estilo.setAdapter(adapterEstilos);
        marca.setAdapter(adapterMarcas);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
