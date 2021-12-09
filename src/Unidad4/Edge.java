/*
Es con la Node.java
 */
package Unidad4;

/**
 *
 * @author andre
 */
public class Edge {
    //Declaracion de variables 
    private Node origin;
    private Node destination;
    private double distance;
    
    
    //Se crea constructor para inicializar variables

    public Edge(Node origin, Node destination, double distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }
    public Node getOrigin(){
    
        return origin;
    
    }
    
    public void setOrigin(Node origin){
    
        this.origin = origin;
    
    }
    public Node getDestination(){
    
        return destination;
    
    }
    
    public void setDestination(Node destination){
    
        this.destination = destination;
    
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    @Override
    public String toString(){
    return "\n Edge [origin = "+origin.getCity()+",destination = " +destination.getCity()+ ",distance ="+distance+"]";
    }
    
}
