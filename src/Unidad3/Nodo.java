/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3;

/**
 *
 * @author andre
 */
public class Nodo {

    private Integer valor;
    private Nodo nextElement;
    private Nodo previousElement;

    //Constructor 
    public Nodo(Integer valor) {

        this.valor = valor;

    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Nodo getNextElement() {
        return nextElement;
    }

    public void setNextElement(Nodo nextElement) {
        this.nextElement = nextElement;
    }

    public Nodo getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(Nodo previousElement) {
        this.previousElement = previousElement;
    }
//Uso de override 
@Override
public String toString(){
return "Nodo[valor="+valor+",nextElement="+((nextElement !=null)? nextElement.getValor():null)+",previousElement="+((previousElement !=null)? previousElement.getValor():null)+"]";

}

}
