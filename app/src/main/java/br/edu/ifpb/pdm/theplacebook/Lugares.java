package br.edu.ifpb.pdm.theplacebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jarvis on 17/06/2016.
 */
public class Lugares {
    private List<Lugar> lugares = new ArrayList<Lugar>();

    public Lugares(){
        lugares.add(new Lugar("IFPB", "Minha faculdade"));
        lugares.add(new Lugar("UFPB", "Não é a minha faculdade"));
        lugares.add(new Lugar("Casa", "Eu moro aqui :)"));
    }
    public List<String> get(){
        List<String> l1 = new ArrayList<String>();
        for (Lugar l: lugares) {
            l1.add(l.getNome());
        }
        return l1;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }
    public Lugar adicionarLugar(Lugar l){
        lugares.add(l);
        return l;
    }
}
