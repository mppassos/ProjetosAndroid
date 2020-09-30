package br.com.toggleeswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView txtResultado;
    private CheckBox checkSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        txtResultado = findViewById(R.id.txtResultado);
        checkSenha = findViewById(R.id.checkSenha);

        adicionarListener();

    }

    public void adicionarListener(){

        checkSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    txtResultado.setText("Ligado");
                }else {
                    txtResultado.setText("Desligado");
                }

            }

        });

    }

    public void enviar(View view){

        //if( toogleSenha.isChecked() ) {
        //if( switchSenha.isChecked() ) {
        if (checkSenha.isChecked()){
            txtResultado.setText("check Ligado");
        }else {
            txtResultado.setText("check Desligado");
        }

    }

}