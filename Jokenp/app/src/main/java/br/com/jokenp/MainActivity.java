package br.com.jokenp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }


    public void opcaoSelecionada(String opcaoSelecionada){ //opcao selecionada pelo usuario

        ImageView imageResultado = findViewById(R.id.imageResultado);

        int numero = new Random().nextInt(3);  //0 1 2
        String[] opcoes = {"pedra" , "papel" , "tesoura" };
        String opcaoApp = opcoes[ numero ];

        switch (opcaoApp){
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
            default:
                imageResultado.setImageResource(R.drawable.padrao);
        }

        if(opcaoApp == "pedra" && opcaoSelecionada == "tesoura" || opcaoApp == "tesoura" && opcaoSelecionada == "papel" || opcaoApp == "papel" && opcaoSelecionada == "pedra"){ //App ganhador
            TextView perdeu = findViewById(R.id.txtEscolha);
            perdeu.setText("VOCÊ PERDEU!");
        }else if(opcaoSelecionada == "pedra" && opcaoApp == "tesoura" || opcaoSelecionada == "tesoura" && opcaoApp == "papel" || opcaoSelecionada == "papel" && opcaoApp == "pedra"){//Usuario ganhador
            TextView ganhei = findViewById(R.id.txtEscolha);
            ganhei.setText("VOCÊ É GANHADOR!");
        }else{ //Empate
            TextView empate = findViewById(R.id.txtEscolha);
            empate.setText("EMPATE!!");
        }
    }

}