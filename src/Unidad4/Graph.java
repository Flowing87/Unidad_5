/*

 */
package Unidad4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Graph {
    private List<Node> nodes;
    
    //Se crea metodo para agregar nodos "add"
    public void addNode(Node node){
    
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        nodes.add(node);
        
    }
     //Se crea metodo para obtener la copia de los elementos
    public List<Node> getNodes(){
    
        return nodes;
    
    }
    @Override
    public String toString(){
    
        return "Grafo [nodos = " + nodes + "]";
    
    }
}
