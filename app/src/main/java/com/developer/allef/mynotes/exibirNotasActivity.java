package com.developer.allef.mynotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.allef.mynotes.Model.Notas;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class exibirNotasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_notas);
         RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recicler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<Notas> no = Notas.listAll(Notas.class);
        NotaAdapter adapter = new NotaAdapter(no);
        recyclerView.setAdapter(adapter);




    }
}
