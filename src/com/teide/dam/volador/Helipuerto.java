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
    
     public ArrayList <Helipuerto> listado = new ArrayList<>();
     
     public void añadir (Volador v) {
         listado.add((Helipuerto) v);
     }
     
     public boolean eliminar (int pos) {
     
       if (pos < listado.size()) {
           listado.remove(pos);
           return true;
       }
       return false;
     }
     
}
   
    
            
            
            
            
            
        
    
       

