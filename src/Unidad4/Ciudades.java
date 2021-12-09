/*
Invoca a las java class creadas : 
Node/ Edge / Graph
 */
package Unidad4;

/**
 *
 * @author andre
 */
public class Ciudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Graph graph = getCities();
        System.out.println(graph);
    }

    //Se crea un metodo estatico para evitar instanciar objetos desde main class 
    public static Graph getCities() {

        Node df = new Node("DF");
        Node toluca = new Node("Toluca");
        Node cuernavaca = new Node("Cuernavaca");
        Node puebla = new Node("Puebla");
        
        

        df.addEdge(new Edge(df, toluca, 150));
        df.addEdge(new Edge(df, cuernavaca, 100));

        toluca.addEdge(new Edge(toluca, cuernavaca, 111));
        toluca.addEdge(new Edge(toluca,puebla,211));
        
        cuernavaca.addEdge(new Edge(cuernavaca,puebla,101));
        cuernavaca.addEdge(new Edge(cuernavaca,df,61));
        
        Graph graph = new Graph();
        graph.addNode(df);
        graph.addNode(toluca);
        graph.addNode(cuernavaca);
        graph.addNode(puebla);
        return graph;
       

    }

}
