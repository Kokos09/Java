 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

/**
 *
 * @author hernan
 */
public class Arista {
     private int idArista;
    private String nombreArista;
    private int distancia;
    private LineaQuebrada lineaQuebrada;    
    private boolean habilitado;

    public Arista(){
        this(-1,"");
    }
    public Arista(int idArista){
        this(-1,"");
    }
    public Arista(int idArista,String nombreArista){
        this(-1,"",1);
    }
    public Arista(int idArista,String nombreArista,int peso){
        this.idArista = idArista;
        this.nombreArista = nombreArista;
        this.distancia = peso;
        lineaQuebrada = null;
        habilitado = true;
    }
    public void setIdArista(int idArista){
        this.idArista = idArista;
    }
    public int getIdArista(){
        return idArista;
    }
    public void setNombreArista(String nombreVia){
        this.nombreArista = nombreVia;
    }
    public String getNombreArista(){
        return nombreArista;
    }
    public void setPeso(int peso){
        this.distancia = peso;
    }
    public int getPeso(){
        return distancia;
    }
    public void setLineaQuebrada(LineaQuebrada lineaQuebrada){
        this.lineaQuebrada = lineaQuebrada;
        if(lineaQuebrada != null){
            this.lineaQuebrada.setLongitud(distancia);
        }
    }
    public LineaQuebrada getLineaQuebrada(){
        return lineaQuebrada;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
