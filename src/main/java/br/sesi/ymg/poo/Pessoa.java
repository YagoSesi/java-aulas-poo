package br.sesi.ymg.poo;

import br.sesi.ymg.poo.Cabeca.Cabeca;
import br.sesi.ymg.poo.inferior.MembrosInferiores;
import br.sesi.ymg.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();

    }
}
