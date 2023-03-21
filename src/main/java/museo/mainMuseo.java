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
public class mainMuseo {

    public static void main(String[] args) {

        List<Empleado> listaEmpleado = new ArrayList<>();
        List<Sala> listaSala = new ArrayList<>();
        List<Pintura> listaPintura = new ArrayList<>();
        List<Escultura> listaEsculura = new ArrayList<>();

        Museo m1 = new Museo("El Prado", "C/ Madrid Alaska", listaEmpleado, listaSala);
        
        System.out.println("------------------------");
        
        Obra o1 = new Pintura(0, "", listaConservador);
    }

}
