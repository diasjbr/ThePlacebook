package br.edu.ifpb.pdm.theplacebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

public class NovoActivity extends AppCompatActivity {
    private EditText etNome, etDesc;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo);
        this.instanciaComponentesInterface();
    }

    private void instanciaComponentesInterface(){
        this.etNome = (EditText) findViewById(R.id.etNome);
        this.etDesc = (EditText) findViewById(R.id.etDesc);
        this.btOk = (Button) findViewById(R.id.btOk);

        this.btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = NovoActivity.this.etNome.getText().toString();
                String desc = NovoActivity.this.etDesc.getText().toString();

                Intent it = new Intent();
                it.putExtra("NOME", nome);
                it.putExtra("DESC", desc);

                setResult(RESULT_OK, it);
                finish();
            }
        });


    }
}
