/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.volador;

import java.util.ArrayList;

/**
 *
 * @author DAM1
 */
public class Helipuerto {
    
     public ArrayList <Helipuerto> listado;
     {
         listado = new ArrayList<>();
        
     }

    private Helipuerto(int nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void añadir (int nombre) {
         Helipuerto t = new Helipuerto(nombre);
         listado.add(t);
    }
}
   
    
            
            
            
            
            
        
    
       

