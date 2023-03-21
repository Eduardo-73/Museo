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
public class Pintor extends Conservador{
    
    private List<Pintura> listaPintura;
    public Pintor(List<Pintura> listaPintura, String nif, String nombre) {
        super(nif, nombre);
        this.listaPintura = new ArrayList<>();
    }
  
}
