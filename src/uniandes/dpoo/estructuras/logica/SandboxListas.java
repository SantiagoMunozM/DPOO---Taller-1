package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos listaEnteros y listaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulación de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas
{
    /**
     * Una lista de enteros para realizar varias de las siguientes operaciones.
     */
    private List<Integer> listaEnteros;

    /**
     * Una lista de cadenas para realizar varias de las siguientes operaciones
     */
    private List<String> listaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxListas( )
    {
        listaEnteros = new ArrayList<Integer>( );
        listaCadenas = new LinkedList<String>( );
    }

    /**
     * Retorna una copia de la lista de enteros, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de enteros
     */
    public List<Integer> getCopiaEnteros( )
    {
        int tamano = getListaEnteros().size();
        List<Integer> original = getListaEnteros();
     
    	List<Integer> rta = new ArrayList<Integer>();
    	
    	for (Integer i: original) {
    		rta.add(i);
    	}
    	
        
        
        
    	return rta;
    }

    

	/**
     * Retorna una copia de la lista de cadenas, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de cadenas
     */
    public List<String> getCopiaCadenas( )
    {
        int tamano = getListaCadenas().size();
        List<String> original = getListaCadenas();
     
    	List<String> rta = new LinkedList<String>();
    	
    	for (String i: original) {
    		rta.add(i);
    	}
    	
        
        
        
    	return rta;
    }
   

    /**
     * Retorna un arreglo con los valores de la lista de enteros, es decir un arreglo del mismo tamaño que contiene copias de los valores de la lista
     * @return Una arreglo de enteros
     */
    public int[] getEnterosComoArreglo( )
    {
    	List<Integer> original = getListaEnteros();
    	int tamano = original.size();
    	int[] arreglo = new int [tamano];
    	
    	for(int i=0; i<tamano; i++) {
    		arreglo[i] = original.get(i);
    	}
    	
    	return arreglo;
    }

    /**
     * Retorna la cantidad de valores en la lista de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        int rta = getListaEnteros().size();
    	return rta;
    }

    /**
     * Retorna la cantidad de valores en la lista de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        int rta = getListaCadenas().size();
    	return rta;
    }

    /**
     * Agrega un nuevo valor al final de la lista de enteros. Es decir que este método siempre debería aumentar en 1 el tamaño de la lista.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	List<Integer> lista = getListaEnteros();
    	lista.add(entero);
    }

    /**
     * Agrega un nuevo valor al final de la lista de cadenas. Es decir que este método siempre debería aumentar en 1 la capacidad de la lista.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	List<String> lista = getListaCadenas();
    	lista.add(cadena);
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	List<Integer> lista = getListaEnteros();
    	
    	for(int i = 0; i< lista.size(); i++) {
    		if (lista.get(i)==valor) {
    		lista.remove(i);
    		}
    	}
    		
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	List<String> lista = getListaCadenas();
    	
    	for(int i = 0; i< lista.size(); i++) {
    		if (lista.get(i).equals(cadena)) {
    		lista.remove(i);
    		}
    	}
    	
    }

    /**
     * Inserta un nuevo entero en la lista de enteros
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en la lista aumentada. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño de la lista, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	List<Integer> lista = getListaEnteros();
    	int tamano = getCantidadEnteros();
    	
    	
    	if (posicion <= 0) {
    		lista.addFirst(entero);
    	}
    	else if(tamano <= posicion) {
    		lista.add(entero);
    	}
    	else {
    		lista.add(posicion, entero);
    	}
    }

    /**
     * Elimina un valor de la lista de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición de la lista de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	List<Integer> lista = getListaEnteros();
    	int tamano = lista.size();
    	if (posicion>=0 && posicion< tamano) {
    		lista.remove(posicion);
    		
    	}
    }

    /**
     * Reinicia la lista de enteros con los valores contenidos en el parámetro 'valores', pero truncados.
     * 
     * Es decir que si el valor fuera 3.67, en la nueva lista debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	List<Integer> nuevaLista = new ArrayList<Integer>();
    	
    	int tamano = valores.length;
    	
    	for (double i: valores) {
    		int num = (int)(i);
    		nuevaLista.add(num);
    		
    	}
    	setListaEnteros(nuevaLista);
    	
    }

    /**
     * Reinicia la lista de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarArregloCadenas( List<Object> objetos )
    {
    	List<String> nuevaLista = new LinkedList<String>();
    	
    	int tamano = objetos.size();
    	
    	for (Object obj: objetos) {
    		String str = obj.toString();
    		nuevaLista.add(str);
    		
    	}
    	setListaCadenas(nuevaLista);
    }

    /**
     * Modifica la lista de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	List<Integer> lista = getListaEnteros();
    	List<Integer> nuevaLista = new ArrayList<Integer>();
    	
    	for(Integer num: lista) {
    		int newNum = Math.abs(num);
    		nuevaLista.add(newNum);
    	}
    	setListaEnteros(nuevaLista);
    }

    /**
     * Modifica la lista de enteros para que todos los valores queden organizados de MAYOR a MENOR.
     */
    public void organizarEnteros( )
    {
    	List<Integer> lista = getListaEnteros();
    	
    	Collections.sort(lista, Collections.reverseOrder());
    }

    /**
     * Modifica la lista de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	List<String> lista = getListaCadenas();
    	
    	Collections.sort(lista);;
    	
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en la lista de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	List<Integer> lista = getListaEnteros();
    	int contador = 0;
    	
    	
    	for(Integer num: lista) {
    		if (num == valor) {
    			contador++;
    		}
    	}
    	return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en la lista de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	List<String> lista = getListaCadenas();
    	int contador = 0;
    	
    	
    	for(String str: lista) {
    		if (str.equalsIgnoreCase(cadena)) {
    			contador++;
    		}
    	}
    	return contador;
    }

    /**
     * Cuenta cuántos valores dentro de la lista de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	List<Integer> lista = getListaEnteros();
    	List<Integer> repetidos = new ArrayList<Integer>();
    	int contador = 0;
    	
    	for(Integer num: lista) {
    		int freq = contarApariciones(num);
    		if (freq>1) {
    			if (repetidos.contains(num)==false) {
    				repetidos.add(num);
    				contador++;
    			}
    		}
    	}
    	
    	return contador;
    }

    /**
     * Compara la lista de enteros con un arreglo de enteros y verifica si contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos son los mismos y en el mismo orden y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
	boolean rta = true;
	    	
	    	List<Integer> lista = getListaEnteros();
	    	int tamano1 = lista.size();
	    	int tamano2 = otroArreglo.length;
	    	
	    	if (tamano1!=tamano2) {
	    		rta = false;
	    	}
	    	else {
	    		int i = 0;
	    		while (rta == true && i<tamano1) {
	    			int num1 = lista.get(i);
	    			int num2 = otroArreglo[i];
	    			
	    			if (num1!=num2) {
	    				rta = false;
	    			
	    			}
	    			i++;
	    		}
	    	}
	    	
	        return rta;
    }

    /**
     * Cambia los elementos de la lista de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en la lista deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en la lista
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	List<Integer> nuevaLista = new ArrayList<Integer>();
    	
    	for (int i = 0; i<cantidad; i++) {
    		double rand = Math.random();
    		int num = (int)(rand*(maximo - minimo)+minimo);
    		nuevaLista.add(num);
  
    				
    	}
    	setListaEnteros(nuevaLista);
    		
    }

    public List<Integer> getListaEnteros() {
		return listaEnteros;
	}

	public void setListaEnteros(List<Integer> listaEnteros) {
		this.listaEnteros = listaEnteros;
	}

	public List<String> getListaCadenas() {
		return listaCadenas;
	}

	public void setListaCadenas(List<String> listaCadenas) {
		this.listaCadenas = listaCadenas;
	}
}
