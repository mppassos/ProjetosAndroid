package com.example.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

        TextView textoSelecionado = findViewById(R.id.NumeroSelecionado);
        Random r = new Random();
        int numeroAleatorio = r.nextInt(11);
            textoSelecionado.setText("O número selecionado:" + numeroAleatorio);
    }
}