/*
Se hace uso de clases predefinidas tales como List y ArrayList
 */
package Unidad4;

// import Grafoss.Edge;
//import com.sun.javafx.geom.Edge;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Node {

  private String city;
  private List<Edge> edges;
  
  // Se crean metodos para nodos y los elementos de este
  //Se crea constructor para control de nodos
  public Node(String city){
  this.city = city;
  
  }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   public List<Edge> getEdges(){
   
       return edges;
   
   }

   public void addEdge(Edge edge){
   
       if (edges == null) {
           edges = new ArrayList<>();
       }
   edges.add(edge);
   }
  @Override
  //Se crea metodo para obtener el total de valores del objeto creado
   public String toString(){
   
       return "\n \tNode[city ="+city+",edges="+edges+"]";
       
   } 
   
}
