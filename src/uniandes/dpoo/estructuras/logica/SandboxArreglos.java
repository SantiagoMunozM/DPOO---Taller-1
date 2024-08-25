package uniandes.dpoo.estructuras.logica;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {	
    	int tamano = arregloEnteros.length;
    	int[] copiaEnteros = new int[tamano];
    	
    	for (int i=0; i<tamano;i++) {
    		int elemento = arregloEnteros[i];
    		copiaEnteros[i]=elemento;
    		
    	}
    	
        return copiaEnteros;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	int tamano = arregloCadenas.length;
    	String[] copiaCadenas = new String[tamano];
    	
    	for (int i=0; i<tamano;i++) {
    		String elemento = arregloCadenas[i];
    		copiaCadenas[i]=elemento;
    	}
    	return copiaCadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	int rta = this.arregloEnteros.length;
        return rta;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int rta = this.arregloCadenas.length;
        return rta;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int tamano = this.arregloEnteros.length;
    	if (tamano == 0) {
    		int[] nuevoArreglo = new int[1];
    		nuevoArreglo[0]=entero;
    		setArregloEnteros(nuevoArreglo);
    	}
    	else {
    		int nuevoTamano = tamano +1;
        	int[] nuevoArreglo = new int[nuevoTamano];
        	for (int i=0; i<tamano; i++ ) {;
        		nuevoArreglo[i]= this.arregloEnteros[i];
        	}
        	nuevoArreglo[tamano]=entero;
        	setArregloEnteros(nuevoArreglo);
    	}
    	
    
    	
    }
    
    public int[] agregarEnteroArreglo( int entero, int[] arreglo )
    {
    	int tamano = arreglo.length;
    	if (tamano == 0) {
    		int[] nuevoArreglo = new int[1];
    		nuevoArreglo[0]=entero;
    		return nuevoArreglo;
    	}
    	else {
    		int nuevoTamano = tamano +1;
        	int[] nuevoArreglo = new int[nuevoTamano];
        	for (int i=0; i<tamano; i++ ) {;
        		nuevoArreglo[i]= arreglo[i];
        	}
        	nuevoArreglo[tamano]=entero;
        	return nuevoArreglo;
    	}
    }
    	

	/**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int tamano = this.arregloCadenas.length;
    	if (tamano == 0) {
    		String[] nuevoArreglo = new String[1];
    		nuevoArreglo[0]=cadena;
    		setArregloCadenas(nuevoArreglo);
    	}
    	else {
    		int nuevoTamano = tamano +1;
        	String[] nuevoArreglo = new String[nuevoTamano];
        	for (int i=0; i<tamano; i++ ) {;
        		nuevoArreglo[i]= this.arregloCadenas[i];
        	}
        	nuevoArreglo[tamano]=cadena;
        	setArregloCadenas(nuevoArreglo);
    	}
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int tamano = getArregloEnteros().length;
    	int[] arreglo = getArregloEnteros();
    	int contador = 0;
    	
    	int[] nuevoArreglo = new int[tamano];
    	
    	for (int i=0; i<tamano;i++) {
    		if (arreglo[i]!=valor) {
    			nuevoArreglo[i]=arreglo[i];
    		}
    		else {
    			contador++;
    		}
    	}
    	
    	int [] rta = new int[tamano-contador];
    	
    	for (int i = 0; i<(tamano-contador); i++) {
    		rta[i] = nuevoArreglo[i];
    	}
    	setArregloEnteros(rta);
    			
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int tamano = getArregloCadenas().length;
    	String[] arreglo = getArregloCadenas();
    	int contador = 0;
    	
    	String[] nuevoArreglo = new String[tamano];
    	
    	for (int i=0; i<tamano;i++) {
    		if (arreglo[i].equals(cadena) == false) {
    			nuevoArreglo[i]=arreglo[i];
    		}
    		else {
    			contador++;
    		}
    	}
    	
    	String [] rta = new String[tamano-contador];
    	
    	for (int i = 0; i<(tamano-contador); i++) {
    		rta[i] = nuevoArreglo[i];
    	}
    	setArregloCadenas(rta);
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int[] arregloOriginal = getArregloEnteros();
    	int tamano = arregloOriginal.length;
    	
    	if (posicion>= tamano) {
    		agregarEntero(entero);
    		
    	}
    	else if (posicion <=0) {
    		int[] nuevoArreglo = new int [tamano +1];
    		nuevoArreglo[0]=entero;
    		for (int i =0; i<tamano; i++) {
    			nuevoArreglo[i+1]=arregloOriginal[i];
    		}
    		this.arregloEnteros = nuevoArreglo;
    	}
    	else {
    		int[] nuevoArreglo = new int [tamano +1];
    		nuevoArreglo[posicion]=entero;
    		
    		for (int i =0; i<posicion;i++) {
    			nuevoArreglo[i]=arregloOriginal[i];
    		}
    		
    		for (int i = posicion; i<tamano; i++) {
    			nuevoArreglo[i+1]=arregloOriginal[i];
    		}
    		setArregloEnteros(nuevoArreglo);
    	}
    	
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int tamano = getArregloEnteros().length;
    	if (0<=posicion && posicion <tamano) {
    		int [] nuevoArreglo = new int[tamano-1];
    		for (int i =0; i<posicion;i++) {
    			nuevoArreglo[i]= getArregloEnteros()[i];
    			
    		}
    		for (int i =posicion+1;i<tamano;i++) {
    			nuevoArreglo[i-1]=getArregloEnteros()[i];
    			
    		}
    		setArregloEnteros(nuevoArreglo);
    	}
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int tamano = valores.length;
    	int [] arreglo = new int[tamano];
    	
    	
    	
    	for (int i = 0; i<tamano;i++) {
    		double dec = valores [i];
    		int num = (int)(dec);
    		arreglo[i]=num;
    	}
    	setArregloEnteros(arreglo);
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	int tamano = objetos.length;
    	String [] arreglo = new String[tamano];
    	
    	
    	
    	for (int i = 0; i<tamano;i++) {
    		Object obj = objetos [i];
    		String cadena = obj.toString();
    		arreglo[i]=cadena;
    	}
    	setArregloCadenas(arreglo);
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int [] arreglo = getArregloEnteros();
    	int tamano = arreglo.length;
    	
    	
    	for (int i = 0; i<tamano;i++) {
    		int num = arreglo [i];
    		int abs = Math.abs(num);
    		arreglo[i]=abs;
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	int [] arreglo = getArregloEnteros();
    	Arrays.sort(arreglo);

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	String [] arreglo = getArregloCadenas();
    	Arrays.sort(arreglo);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
        int[] arreglo = getArregloEnteros();
        int tamano = arreglo.length;
        int contador = 0;
        
        for(int i=0; i<tamano; i++) {
        	int num = arreglo[i];
        	if (num == valor) {
        		contador++;
        	}
        }
    	
        return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
        String[] arreglo = getArregloCadenas();
        int tamano = arreglo.length;
    	int contador = 0;
    	
    	for (int i=0; i<tamano; i++) {
    		String str = arreglo[i];
    		
    		if (str.equalsIgnoreCase(cadena)) {
    			contador++;
    		}
    	
    	}
    	return contador;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
        int[] arreglo = getArregloEnteros();
        int tamano = arreglo.length;
        
        int[] retorno = new int[0];
        
        for (int i=0; i<tamano;i++) {
        	int num = arreglo[i];
        	if ( num==valor ) {
        		retorno = agregarEnteroArreglo(i, retorno);
        	}
        }
        
    	return retorno;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int[] arreglo = getArregloEnteros();
    	int tamano = arreglo.length;
    	
    	if (tamano>0) {
    	
	    	int[] retorno = new int[2];
	    	
	    	
	    	int min = arreglo[0];
	    	for (int i = 1; i<tamano; i++) {
	    		int num = arreglo[i];
	    		if (num<min) {
	    			min = num;
	    		}
	    	}
			int max = arreglo[0];
	    	for (int i = 1; i<tamano; i++) {
	    		int num = arreglo[i];
	    		if (max<num) {
	    			max = num;
	    		}
	    	}
	    	retorno[0] = min;
	    	retorno[1] = max;
	    	return retorno;
    	}
    	else {
    		int[] retorno = new int[0];
    		return retorno;
    	}
        
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        HashMap<Integer, Integer> hist = new HashMap<Integer, Integer>();
        
        int[] arreglo = getArregloEnteros();
        int tamano = arreglo.length;
        
        for (int i = 0; i< tamano; i++) {
        	int num = arreglo[i];
        	
        	if (hist.containsKey(num)) {
        		int presentValue = hist.get(num);
        		hist.put(num, presentValue+1);
        	}
        	
        	else {
        		hist.put(num, 1);
        	}
        }
        
    	return hist;
    }
    public HashMap<Integer, Integer> calcularHistogramaArreglo(int[] arreglo )
    {
        HashMap<Integer, Integer> hist = new HashMap<Integer, Integer>();
        
        int tamano = arreglo.length;
        
        for (int i = 0; i< tamano; i++) {
        	int num = arreglo[i];
        	
        	if (hist.containsKey(num)) {
        		int presentValue = hist.get(num);
        		hist.put(num, presentValue+1);
        	}
        	
        	else {
        		hist.put(num, 1);
        	}
        }
        
    	return hist;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
        int contador = 0;
        
        HashMap<Integer, Integer> hist = calcularHistograma();
        
        for (Entry<Integer, Integer> pareja: hist.entrySet()) {
        	int freq = pareja.getValue();
        	if (freq>1) {
        		contador++;
        	}
        }
        
    	return contador;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	boolean rta = true;
    	
    	int[] arreglo = getArregloEnteros();
    	int tamano1 = arreglo.length;
    	int tamano2 = otroArreglo.length;
    	
    	if (tamano1!=tamano2) {
    		rta = false;
    	}
    	else {
    		int i = 0;
    		while (rta == true && i<tamano1) {
    			int num1 = arreglo[i];
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
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
        boolean rta = true;
        
        int[] arreglo = getArregloEnteros();
        
        int tamano1 = arreglo.length;
        int tamano2 = otroArreglo.length;
        
        if (tamano1!=tamano2) {
        	rta = false;
        }
        
        else {
	        HashMap<Integer, Integer> hist1 = calcularHistograma();
	        HashMap<Integer, Integer> hist2 = calcularHistogramaArreglo(otroArreglo);
	        
	        for (Entry<Integer, Integer> pareja1 : hist1.entrySet()) {
	        	int llave = pareja1.getKey();
	        	if (hist2.containsKey(llave)==false) {
	        		rta = false;
	        	}
	        	else {
	        		int value1 = pareja1.getValue();
	        		int value2 = hist2.get(llave);
	        		if (value1!=value2) {
	        			rta = false;
	        		}
	        	}
	        	
	        	
	        }
	        
        
        
        }
    	
    	return rta;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] nuevoArreglo = new int[cantidad];
    	
    	for(int i = 0; i<cantidad; i++) {
    		Random num = new Random();
    		int ent = num.nextInt(maximo -minimo )+minimo;
    		nuevoArreglo[i] = ent;
		
    	}
    	setArregloEnteros(nuevoArreglo);
    }
    public int[] getArregloEnteros() {
		return arregloEnteros;
	}

	public void setArregloEnteros(int[] arregloEnteros) {
		this.arregloEnteros = arregloEnteros;
	}

	public String[] getArregloCadenas() {
		return arregloCadenas;
	}

	public void setArregloCadenas(String[] arregloCadenas) {
		this.arregloCadenas = arregloCadenas;
	}

}
