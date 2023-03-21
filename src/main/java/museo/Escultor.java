/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class Escultor extends Conservador{
    
    private List<Escultura> listaEscultura;
    
    public Escultor(List<Escultura> listaEscultura, String nif, String nombre) {
        super(nif, nombre);
        this.listaEscultura = new ArrayList<>();
    }
    
}
