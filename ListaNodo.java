/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.util.ArrayList;

/**
 *
 * @author hernan
 */
public class ListaNodo extends ArrayList<Nodo> {
    public ListaNodo(){
        super();
    }
    public Nodo buscarMenor(){
        Nodo aux = new Nodo();
        aux.setLongitudCamino(9999999);

        for(Nodo nodo:this){
            if(nodo.getLongitudCamino() < aux.getLongitudCamino()){
                aux = nodo;                
            }
        }

        return aux;
    }
    public boolean isContenido(Nodo nodo){
        boolean retornado = false;
        for(Nodo n:this){
            if(n == nodo){
                retornado = true;
            }
        }
        return retornado;
    }
}
