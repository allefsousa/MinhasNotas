package com.developer.allef.mynotes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.allef.mynotes.Model.Notas;

import java.util.ArrayList;
import java.util.List;

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
        ViewHolderNota(View v) {
            super(v);
            titulo = v.findViewById(R.id.titulo);
            nota = v.findViewById(R.id.nota);




        }
    }


}
