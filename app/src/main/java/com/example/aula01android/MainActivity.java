package com.example.aula01android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] alunos = {
                "Daniel"
                ,   "Ronaldo"
                ,   "Ricardo"
                ,   "Jeferson"
                ,   "Felipe"
        };

        // Fazendo castring para converter View em ListView
        ListView listaAlunos = (ListView) findViewById(R.id.lista_alunos);

        // Criando o Array Adapter para guardar e converter a lista de alunos em uma lista do Android
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(stringArrayAdapter);

    }
}
