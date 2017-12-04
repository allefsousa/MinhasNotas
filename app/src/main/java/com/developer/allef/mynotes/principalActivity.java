package com.developer.allef.mynotes;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class principalActivity extends AppCompatActivity {

    @BindView(R.id.textnota)
    TextInputEditText nota;
    @BindView(R.id.texttitulo)
    TextInputEditText titulo;
    @BindView(R.id.textdata)
    TextInputEditText data;
    @BindView(R.id.btnsalvar)
    Button salvar;
    @BindView(R.id.btnvisualizar)
    Button visualizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ButterKnife.bind(this);
    }
}
