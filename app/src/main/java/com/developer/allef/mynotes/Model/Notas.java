package com.developer.allef.mynotes.Model;

import com.orm.SugarRecord;
import com.orm.dsl.Table;
import com.orm.dsl.Unique;

/**
 * Created by allef on 04/12/2017.
 */
public class Notas extends SugarRecord {
    @Unique
    String titulo;
    String conteudo;

    public Notas(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
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

}
