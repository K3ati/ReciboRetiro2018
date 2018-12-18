package com.example.limat.reciboretiro.feature;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Date;

public class Dados extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);


    }

    public void dadosSalvos(View fragmentView){
        Bundle pacoteDados = getIntent().getExtras();

        String nome = pacoteDados.getString("Nome");
        Integer valor = pacoteDados.getInt("Valor");
        String dataP = pacoteDados.get


        TextView nomeT = (TextView) fragmentView.findViewById(R.id.nome);
        nomeT.setText(nome);
    }
}





//https://www.youtube.com/watch?v=lrkbO-prWic