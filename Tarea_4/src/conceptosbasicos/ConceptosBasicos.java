/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author Ninja
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("GTR");
        miMustang.setModelo(2011);
        miMustang.setColor(Color.yellow);
        
        Automovil miAcura = new Automovil();
        miAcura.setMarca("Honda");
        miAcura.setSubMarca("MDX");
        miAcura.setModelo(2015);
        miAcura.setColor(Color.black);
        
        
        //Tarea.- Programar los objetos miAcura y miMustang
    }
    
}
