package com.example.limat.reciboretiro.feature;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    public static final int CONSTANTE_ACTIVITY_2 = 1;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarDados(View view){
        Intent intent = new Intent(this,Dados.class);

        TextView nome = (TextView) findViewById(R.id.nome);
        intent.putExtra("Nome",nome.getText().toString());

        startActivity(intent);

    }

    private void startActivityForResult(Intent intent) { }

}
