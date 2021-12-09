/*
 Se hace la lectura de datos o valores ingresados por el usuario y a la vez se consideran las excepciones necesarias para los diferentes casos es decir 
para los valores diferentes (tipos) introducidos por el usuario 
 */
package Unidad4;
  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Leer {
    
    //Se crea metodo para leer datos (valores)
     public static String dato()
    {
        //Se crea objeto para guardar datos o valores
        String sdato = "";
        try
        {
 
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
             // Se lee el total de elementos
            sdato = flujoE.readLine();
        }
        catch(IOException e)
        {
            System.err.println("Error: "+ e.getMessage());
        }
        return sdato; //devolver dato tecleando (copia del valor)
    }
   // Se crea metodo 
    public static short datoShort()
    {
        try
        {
            //Convertir datos o valores
            return Short.parseShort(dato());
        }
        catch(NumberFormatException e)
        {
            return Short.MIN_VALUE;//valor más pequeño
        }
    }
    
    public static int datoInt()
    {
        try
        {
            return Integer.parseInt(dato());
        }
        catch(NumberFormatException e)
        {
            return Integer.MIN_VALUE;//valor mas pequeño
        }
    }
    // Se crea metodo para validar el tipo y clasificacion de valor
    public static long datoLong()
    {
        try
        {
            return Long.parseLong(dato());    
        }
            catch(NumberFormatException e)
        {
            return Long.MIN_VALUE; //valor mas pequeño
        }
    }
    
    public static float datoFloat()
    {
        try
        {
            Float f = new Float(dato());
            return f.floatValue();
        }
        catch(NumberFormatException e)
        {
            return Float.NaN;//No es un numero Valor float.
        }
    }

    public static double datoDouble()
    {
        try  
        {
            Double d = new Double(dato());
            return d.doubleValue();
        }
        catch(NumberFormatException e)
        {
            return Double.NaN;//no es un numero; valor double.
        }              
    }
}
