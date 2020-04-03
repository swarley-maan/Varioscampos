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

        String email = intent.getStringExtra("EMAIL");
        TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        textViewEmail.setText(email);

        String idade = intent.getStringExtra("IDADE");
        TextView textViewIdade = (TextView) findViewById(R.id.textViewIdade);
        textViewIdade.setText(idade);

        String peso = intent.getStringExtra("PESO");
        TextView textViewPeso = (TextView) findViewById(R.id.textViewPeso);
        textViewPeso.setText(peso);

        String altura = intent.getStringExtra("ALTURA");
        TextView textViewAltura = (TextView) findViewById(R.id.textViewAltura);
        textViewAltura.setText(altura);

    }
}
