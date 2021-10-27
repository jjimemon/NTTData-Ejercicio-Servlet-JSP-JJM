package com.nttdata.tomcat;

/**
 * Clase de formacion | NTT-DATA
 * 
 * @author jjimemon
 *
 */
public class NttDataJSP {

	/**
	 * Método que recibe un nombre y devuelve un String con la bienvenida.
	 * 
	 * @param name
	 * @return
	 */
	public static String helloNttData(final String name) {

		return "Bienvenid@ a NTT-DATA  " + name;
	}

}
