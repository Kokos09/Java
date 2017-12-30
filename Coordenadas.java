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
public class Coordenadas extends ArrayList < int[] > {
    private int xMaxima;
    private int yMaxima;
    public Coordenadas(){
        this(0, 0);
    }
    public Coordenadas(int xMaxima, int yMaxima){
        super();
        this.xMaxima = xMaxima;
        this.yMaxima = yMaxima;
    }
    public Coordenadas(int xMaxima, int yMaxima,int x, int y){
        super();        
        this.xMaxima = xMaxima;
        this.yMaxima = yMaxima;
        addCoordenada(x,y);
    }
    public void setXMaxima(int xMaxima){
        this.xMaxima = xMaxima;
    }
    public void setYMaxima(int yMaxima){
        this.yMaxima = yMaxima;
    }
    public void addCoordenada(int x, int y){
        if(x >= 0 && x <= xMaxima && y >= 0 && y <= yMaxima)
        {
            int[] parXY = {x, y};
            add(parXY);
        }
    }

    public int getxMaxima() {
        return xMaxima;
    }

    public int getyMaxima() {
        return yMaxima;
    }
}
