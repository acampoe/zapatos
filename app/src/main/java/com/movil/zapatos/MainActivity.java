package com.movil.zapatos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText cantidad;
    private Spinner genero;
    private Spinner marca;
    private Spinner estilo;
    private Resources recursos;
    private String[] generos;
    private String[] estilos;
    private String[] marcas;
    private TextView totalPrize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recursos = this.getResources();
        genero = findViewById(R.id.cmbSexo);
        marca = findViewById(R.id.cmbMarca);
        estilo = findViewById(R.id.cmbEstilo);
        totalPrize = findViewById(R.id.txtPrice);

        generos = recursos.getStringArray(R.array.generos);
        estilos = recursos.getStringArray(R.array.estilos);
        marcas = recursos.getStringArray(R.array.marcas);

        ArrayAdapter<String> adapterGeneros = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generos);
        ArrayAdapter<String> adapterEstilos = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, estilos);
        ArrayAdapter<String> adapterMarcas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, marcas);

        genero.setAdapter(adapterGeneros);
        estilo.setAdapter(adapterEstilos);
        marca.setAdapter(adapterMarcas);

        cantidad = findViewById(R.id.txtCantidad);}

    public boolean validar() {
        if (cantidad.getText().toString().isEmpty()) {
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.error));
            return false;
        }else if(Integer.parseInt(cantidad.getText().toString()) == 0){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.error1));
            return false;
        }
        return true;
    }

    public void cotizar(View v){
        if (validar()){
            double cantidades = Double.parseDouble(cantidad.getText().toString());
            int idGenero, idEstilo, idMarca = 0;
            idGenero = genero.getSelectedItemPosition();
            idEstilo = estilo.getSelectedItemPosition();
            idMarca = marca.getSelectedItemPosition();
            double precioTotal = Metodos.Calcular(idGenero,idMarca,idEstilo,cantidades);
            totalPrize.setText("$"+precioTotal);
            }
    }

}

