package com.developer.allef.mynotes.Model;

import com.orm.SugarRecord;

/**
 * Created by allef on 04/12/2017.
 */

public class Notas extends SugarRecord {
    String titulo;
    String conteudo;
    String data;

    public Notas(String titulo, String conteudo, String data) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.data = data;
    }

    public Notas() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
