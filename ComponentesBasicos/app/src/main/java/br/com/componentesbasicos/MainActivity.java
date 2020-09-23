package br.com.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView campoResultado;

    private CheckBox checkVerde, checkBranco , checkVermelho ;
    //RadioButton

    private RadioButton sexoFeminino, sexoMasculino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.editNome);
        campoEmail      = findViewById(R.id.editEmail);
        campoResultado  = findViewById(R.id.txtResultado);

        //Checkbox
        checkVerde      = findViewById(R.id.checkVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVermelho   = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoFeminino    = findViewById(R.id.radioButtonFeminino);
        sexoMasculino   = findViewById(R.id.radioButtonMasculino);
        opcaoSexo       = findViewById(R.id.radioGroupSexo);

        radiobutton();

    }

    public void radiobutton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if( checkedId == R.id.radioButtonMasculino){
                    campoResultado.setText("Masculino");
                }else if( checkedId == R.id.radioButtonFeminino){
                    campoResultado.setText("Feminino");
                }
            }
        });
       /* String texto = "";
        if(sexoMasculino.isChecked()){
            texto = texto + sexoMasculino.getText().toString() + " selecionado - ";
        }else{
            texto = texto + sexoFeminino.getText().toString() + " selecionado - ";
        }
        campoResultado.setText( texto );
        */
    }


    public void enviar(View view){

        //radiobutton();
        //checkbox();

        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        campoResultado.setText("Nome: " + nome + " email: " + email);
         */

    }

    public void checkbox(){

        String texto = "";
        if(checkVerde.isChecked()){
            //String corSelecionada = checkVerde.getText().toString();
            //texto = corSelecionada;
            texto = texto + "Verde selecionado - ";
        }

        if(checkBranco.isChecked()){
            texto = texto + "Branco selecionado - ";
        }

        if(checkVermelho.isChecked()){
            texto = texto + "Vermelho selecionado - ";
        }

        campoResultado.setText( texto );

    }

    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");
        campoResultado.setText("");
    }
}
