package br.com.poesyana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
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

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Enfrente os problemas e leve a melhor! ... ",
                "Dê mais atenção ao que você tem de bom na sua vida. ... ",
                "Para chegar ao topo, o que importa é começar! ...",
                "De nada adianta ter sonhos, se você não se empenhar em correr atrás. ... ",
                "Preste atenção nas oportunidades que estão à sua frente!",
                "Toda manhã você tem duas escolhas: continuar dormindo com seus sonhos ou acordar e persegui-los!",
                "A cada novo dia, a cada momento, temos a nossa disposição a maravilhosa possibilidade do encontro, que traz em si infinitas oportunidades. Precisamos apenas estar atentos."
        };

        int numero = new Random().nextInt(7); // 0 1 2 3 4 5 6
        TextView texto = findViewById(R.id.txtFrase);
        texto.setText( frases[numero] );
    }

}