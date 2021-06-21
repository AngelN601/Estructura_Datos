/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objeto;
import ico.fes.partes.CPU;
import ico.fes.partes.Monitor;
import ico.fes.partes.Mouse;   
import ico.fes.partes.Teclado;

/**
 *
 * @author Ninja
 */
public class Computadora {
    private String marca;
    private String modelo;

    public Computadora() {
    }

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
  
}
