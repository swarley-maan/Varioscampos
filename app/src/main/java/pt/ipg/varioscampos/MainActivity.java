package pt.ipg.varioscampos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //public static final String NOME = "com.example.perfil.NOME";
    //public static final String TELEFONE = "com.example.perfil.TELEFONE";

    public void enviaMensagem(View view) {
        Intent intent = new Intent(this, MostraMensagemActivity.class);


        EditText editTextNome= (EditText)findViewById(R.id.editTextNome);
        String nome=editTextNome.getText().toString();
        intent.putExtra("NOME",nome);

        EditText editTextTelefone= (EditText)findViewById(R.id.editTextTelefone);
        String telefone=editTextTelefone.getText().toString();
        intent.putExtra("TELEFONE",telefone);

        startActivity(intent);
    }
}
