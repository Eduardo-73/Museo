/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author eduar
 */
public class Conservador extends Empleado implements Restaurador{

    public Conservador(String nif, String nombre) {
        super(nif, nombre);
    }
    
    @Override
    public void Restaurador() {
        System.out.println("Restaurando ");
    }  
}
