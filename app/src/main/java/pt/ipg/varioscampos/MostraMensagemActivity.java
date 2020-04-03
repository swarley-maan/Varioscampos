package pt.ipg.varioscampos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostraMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_mensagem);

        Intent intent = getIntent();

        String nome = intent.getStringExtra("NOME");
        TextView textViewNome = (TextView) findViewById(R.id.textViewNome);
        textViewNome.setText(nome);

        String Telefone = intent.getStringExtra("TELEFONE");
        TextView textViewTelefone = (TextView) findViewById(R.id.textViewTelefone);
        textViewTelefone.setText(Telefone);

    }
}
