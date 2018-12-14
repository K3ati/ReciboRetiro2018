package com.example.limat.reciboretiro.feature;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    public static final int CONSTANTE_ACTIVITY_2 = 1;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarDados(View view){
        EditText nome = (EditText) findViewById(R.id.nome);
        EditText valor = (EditText) findViewById(R.id.valor);
        EditText dataPagamento = (EditText) findViewById(R.id.dataPagamento);

        Bundle params = new Bundle();
        params.putString("nome",nome.getText().toString());
        params.putString("valor",valor.getText().toString());
        params.putString("dataPagamento",dataPagamento.getText().toString());

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtras(params);
        
        startActivityForResult(intent, CONSTANTE_ACTIVITY_2);

    }

    private void startActivityForResult(Intent intent) {
    }

}
