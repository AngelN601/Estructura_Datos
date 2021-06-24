/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author Ninja
 */
public class UsarAlumno {
    public static void main (String[] args){
        Alumno a=new Alumno("96367120", "ICO", 2, "Angel", 20, 1, 1.72f);
        
        System.out.println("Nombre"+a.getNombre());
        
    }
    
}
