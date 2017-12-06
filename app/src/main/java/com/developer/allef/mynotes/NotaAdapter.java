package com.developer.allef.mynotes;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.developer.allef.mynotes.Model.Notas;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by allef on 04/12/2017.
 */

public class NotaAdapter extends RecyclerView.Adapter<NotaAdapter.ViewHolderNota>{
    List<Notas> n ; // objeto que vai receber as notas



    public NotaAdapter (List<Notas> notas){
        this.n = notas; // recebendo as notas da view pelo contrutor

    }

    @Override
    public NotaAdapter.ViewHolderNota onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_notas,parent,false);
        ViewHolderNota holderNota = new ViewHolderNota(view);
        return holderNota;
    }

    @Override
    public void onBindViewHolder(NotaAdapter.ViewHolderNota holder, int position) {
        if((n!= null) && (n.size()>0)){
            holder.titulo.setText(n.get(position).getTitulo());
            holder.nota.setText(n.get(position).getConteudo());


        }


    }

    @Override
    public int getItemCount() {
        return n.size();
    }
    public class ViewHolderNota extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView nota;
        ImageButton apagar;

        ViewHolderNota(View v) {
            super(v);
            titulo = v.findViewById(R.id.titulo);
            nota = v.findViewById(R.id.nota);
            apagar = v.findViewById(R.id.excluir);



            apagar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                  int ii =  getAdapterPosition();
                    Notas  notas =  Notas.findById(Notas.class,ii);
                    Log.d(TAG, "onClick: "+ ii);
                    notas.delete(); // TODO: 04/12/2017  erro em alguns momentos  ao deletar o primeiro usuario do listView

                }
            });
        }






    }


}
