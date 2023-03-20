/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package museo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author eduardo
 */
public class Museo {
    
    private String nombre;
    private String direccion;
    private List<Empleado> listaEmpleado;
    private List<Sala> listaSala;

    public Museo(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaEmpleado = new ArrayList<>();
        this.listaSala = new ArrayList<>();
    }
    
    public void contratar(){
        
    }
    
    public void despedir(){
        
    }
    
    public boolean añadirSala(){
    
    }
    
    public boolean quitarSala(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public List<Sala> getListaSala() {
        return listaSala;
    }

    public void setListaSala(List<Sala> listaSala) {
        this.listaSala = listaSala;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", listaEmpleado=").append(listaEmpleado);
        sb.append(", listaSala=").append(listaSala);
        sb.append('}');
        return sb.toString();
    }
}
