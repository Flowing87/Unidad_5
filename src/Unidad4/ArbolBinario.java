/*

 */
package Unidad4;

/**
 *
 * @author andre
 */
public class ArbolBinario {
    void borrarnodo() {
        throw new UnsupportedOperationException("No jala."); //To change body of generated methods, choose Tools | Templates.
    }
    class Nodo
    {
        int info;
        Nodo izq, der;
    }
    Nodo raiz;
//Metodo constructor 
    public ArbolBinario(){
        raiz = null;
    }
   //Se especifican las instrucciones necesarias en cada uno de los metodos de acuerdo a su funcion 
    public void insertar(int info)
    {
       //Se crea un objeto "nuevo" el cual guarda los valores 
        Nodo nuevo = new Nodo ();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der =null;
        if (raiz == null)
            raiz = nuevo;
        else
        {
            Nodo anterior = null, reco;
            reco = raiz;
            while (reco != null)
            {
                anterior = reco;
                if (info < reco.info)
                    reco = reco.izq;
                else
                    reco = reco.der;
            }  
            if (info < anterior.info)
                anterior.izq = nuevo;
            else
                anterior.der = nuevo;
        }      
    }  
   
    private void preorden (Nodo n)
    {
        if (n != null)
        {
            System.out.print(n.info + " ");
            preorden (n.izq);
            preorden (n.der);
           
        }
    }      
   
    public void preorden ()
    {
        preorden (raiz);
        System.out.println();
    }
   
    private void inorden (Nodo n)
    {
        if (n != null)
        {
            inorden (n.izq);
            System.out.print(n.info + " ");
            inorden (n.der);
        }
    }
   
    public void inorden ()
    {
        inorden (raiz);
        System.out.println();
    }
   //Metodo para recorrer arbol en postorden (izq,derecho y raiz)
    private void postorden (Nodo n)
    {
        if (n != null)
        {
            postorden (n.izq);
            postorden (n.der);
            System.out.print(n.info + " ");          
        }
    }
   
    public void postorden ()
    {
        postorden (raiz);
        System.out.println();
    }
    //metodo para insertar nodos
    public void insertarteclado ()
    {
        int can;
        int num;
        System.out.print("Ingresar la Cantidad de Nodos para crear el árbol: ");
        can = Leer.datoInt();
        for (int i=0; i<can; i++)
        {
            System.out.print("Ingrese Nodo "+(i+1)+" :");
            num = Leer.datoInt();
            insertar(num);
        }
    }
    // metodo para buscar nodo en el arbol
   
    public String buscar(int num)
    {
        if (buscar(this.raiz,num)==true) return "Se ecnontro el número "+ num + " en el arbol";
        else return "No se encontro el número "+num +"en el arbol";//aqui retorna falso
    }
    private boolean buscar(Nodo n,int num)
    {
        if (n != null)
        {
            if (n.info == num) return true;
            boolean bus1 = buscar(n.izq,num);
            boolean bus2 = buscar(n.der,num);
            if((bus1 == true)||(bus2 == true)) return true;
        }
        return false;
    }
    //metodo para sumer el total de nodos en el arbol
    public String sumar()
    {
        int suma = sumar(this.raiz);
        return "Suma de nodos: "+suma;
    }
   
    private int sumar(Nodo n)
    {
        if (n == null)return 0;
        int c1 = sumar(n.izq);// Sumando las posiciones izqquierda
        int c2 = sumar(n.der);// Sumando las posiciones Derecha
        int c3 = c1 + c2 + n.info;
       
        return c3;//retorna las sumas 
    }
    //metodo para contar los nodos
    public int contar()
    {
        int cant = contar(this.raiz);
        return cant;
    }
   
    private int contar(Nodo n)
    {
        if (n==null) return 0;
        int c1 = contar (n.izq);
        int c2 = contar (n.der);
        int c3 = c1 + c2 + 1;
       
        return c3;
    }
    //metodo para sacar el promedio de los numeros
    public String promedio()
    {
        Double prom = promedio(this.raiz);
        return "Promedio de los números: "+ prom/contar();
    }
   
    private Double promedio(Nodo n)
    {
        if (n == null) return 0.0;
        Double c1 = promedio(n.izq);
        Double c2 = promedio(n.der);
        Double c3 = c1 + c2 + n.info;
        return c3;
    }
    //metodo para retornar cantidad de números pares
    public String pares()
    {
        int cant = pares(this.raiz);
        return "Cantidad de números pares: "+cant;
    }
    int con=0;  //.......................?
    private int pares (Nodo n)
    {
        if (n != null)
        {
            if (n.info % 2 == 0)con++; //.................?
            pares (n.izq);
            pares (n.der);
        }
        return con;
    }
    // metodo para eliminar
    public void borrar (int elemento)//..........................?
    {
        raiz = borrar(this.raiz, elemento);
    }
   
    private Nodo borrar(Nodo r, int elemento)
    {
        if (r.info == elemento)//.........................?
        {
            if(r.der == null && r.izq == null)
            {
                r = null;
                return r;
            }
            if(r.der == null)// ........................?
            {
                r = r.izq;
                return r;    //....................?
            }
            if(r.izq ==null)
            {
                r = r.der;
                return r;
            }
            //.......................?
            r.info = encontrarMaximo(r.izq); //sera igual que el nodo de mayor valor
            r = ajuste(r, r.izq, r);
            return r;//el nodo igualado de mayor valor se debe eliminar
        }
   
        if(elemento > r.info)//.....................?
        {
            r.der = borrar(r.der, elemento);
            return r;
        }
   
        r.izq = borrar(r.izq, elemento);
        return r;
    }
    //este metodo sirve para econtrar al nodo maximo
    //nos ayudara para la eliminacion del nodo dado en el metodo borrar
    private int encontrarMaximo(Nodo r)
    {
        if(r.der == null)//.....................?
            return r.info;
        return encontrarMaximo(r.der);
    }
    //metodo que elimina el nodo repetido y ajusta el arbol
    private Nodo ajuste(Nodo padre, Nodo hijo, Nodo ances)
    {
        if(hijo.der == null)
        {
            if(padre.equals(ances))
            {
                padre.izq = hijo.izq;
                return padre;
            }
            padre.der = hijo.izq;
            return padre;
        }
        return padre;
    }
   
}
