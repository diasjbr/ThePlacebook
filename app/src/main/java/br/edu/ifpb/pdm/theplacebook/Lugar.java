package br.edu.ifpb.pdm.theplacebook;

import android.widget.ImageView;

/**
 * Created by Jarvis on 17/06/2016.
 */
public class Lugar {
    private ImageView imagem;
    private String nome;
    private String desc;


    public Lugar(String nome, String desc){
        this.nome = nome;
        this.desc = desc;

    }
    public Lugar(ImageView imagem,String nome,String desc){
        this.imagem = imagem;
        this.nome = nome;
        this.desc = desc;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return desc;
    }
    public void setImagem(ImageView i){
        imagem = i;
    }
    public ImageView getImagem(){
        return imagem;
    }

}
