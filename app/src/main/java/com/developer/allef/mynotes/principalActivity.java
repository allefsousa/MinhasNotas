package com.developer.allef.mynotes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.developer.allef.mynotes.Model.Notas;

import java.security.Principal;

import butterknife.BindView;
import butterknife.ButterKnife;

public class principalActivity extends AppCompatActivity {


    private final String TAG = "Allef";
    @BindView(R.id.textInputLayout)
    TextInputLayout erroTitulo;
    @BindView(R.id.textInputLayout2)
    TextInputLayout erroConteudo;
    @BindView(R.id.textnota)
    TextInputEditText nota;
    @BindView(R.id.texttitulo)
    TextInputEditText titulo;
    @BindView(R.id.btnsalvar)
    Button salvar;
    @BindView(R.id.btnvisualizar)
    Button visualizar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ButterKnife.bind(this);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Notas n = new Notas();

                if (titulo.getText().toString().isEmpty()) {
                    erroTitulo.setErrorEnabled(true);
                    erroTitulo.setError("titulo não pode ser vazio.");
                } else if (nota.getText().toString().isEmpty()) {
                    erroConteudo.setError("Conteudo não pode ser vazio.");
                } else {
                    n.setTitulo(titulo.getText().toString());
                    n.setConteudo(nota.getText().toString());
                    n.save();
                    Snackbar.make(findViewById(android.R.id.content), "Nota Adicionada com Sucesso !!",
                            Snackbar.LENGTH_LONG).show();
                    limpar();
                }

            }


        });
        visualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(principalActivity.this,exibirNotasActivity.class));
            }
        });

    }

    private void limpar() {
        titulo.getText().clear();
        nota.getText().clear();
    }


}
