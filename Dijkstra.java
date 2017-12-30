/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author hernan
 */
public class Dijkstra {
    Grafo grafo;
    ListaNodo listaNodosAdyacentes;
    ArrayList<Arista> aux = new ArrayList<Arista>();
    public Dijkstra(Grafo grafo){
        this.grafo = grafo;
        listaNodosAdyacentes = new ListaNodo();
    }
    private void llenarConAdyacentes(Nodo nodo){
        if(nodo != null){
            ArrayList<Enlace> listaAux = nodo.getListaNodoAdyacente();
            if(listaAux != null){
                    for(Enlace enlace:listaAux){
                    Nodo aux2 = enlace.getNodo();
                    if(!aux2.isMarca()){

                        if(listaNodosAdyacentes.isContenido(aux2)){
                            int longitud = nodo.getLongitudCamino() + enlace.getArista().getPeso();
                            if(aux2.getLongitudCamino() > longitud){
                                aux2.setLongitudCamino(longitud);
                                aux2.setNodoAntecesorDisjktra(nodo);
                            }
                        }else{
                            aux2.setLongitudCamino(nodo.getLongitudCamino() + enlace.getArista().getPeso());
                            aux2.setNodoAntecesorDisjktra(nodo);
                            listaNodosAdyacentes.add(aux2);
                        }

                    }
                }
            }
        }
    }
    public void ejecutar(Nodo nodoInicio){
        nodoInicio.setLongitudCamino(0);
        if(nodoInicio != null){
            listaNodosAdyacentes = new ListaNodo();
            listaNodosAdyacentes.add(nodoInicio);
            while(!listaNodosAdyacentes.isEmpty()){
                Nodo menor = listaNodosAdyacentes.buscarMenor();
                menor.setMarca(true);
                listaNodosAdyacentes.remove(menor);
                llenarConAdyacentes(menor);
            }
        }
    }
    
    private void rutaCorta(Nodo nodoFinal){
    aux.clear();
    Nodo nAux = nodoFinal;
    while(nAux.getNodoAntecesorDisjktra() != null){
        aux.add(grafo.getArista(nAux,
                nAux.getNodoAntecesorDisjktra()));
        nAux = nAux.getNodoAntecesorDisjktra();
    }

}
public void marcarRutaCorta(Nodo nodoFinal,Color color){
    if(nodoFinal != null){
        rutaCorta(nodoFinal);
            for(int i = 0;i < aux.size();i++){
                if(!aux.isEmpty()){
                    aux.get(i).getLineaQuebrada().setColor(color);
                    aux.get(i).getLineaQuebrada().setGrosorLinea(4);
                }
            }
    }
}
}
