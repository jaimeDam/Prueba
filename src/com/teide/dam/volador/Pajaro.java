/** @author: Moisés Vargas Villanueva */
package com.teide.dam.volador;

public class Pajaro implements Volador {

    @Override
    public String despegar() {
        return "El pajaro ha despegado";
    }

    @Override
    public String aterrizar(int metros) {
        return "El pajaro ha aterrizado";
    }
    
}