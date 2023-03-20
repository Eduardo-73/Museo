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
public abstract class Obra {
   
    private int id;
    private String autor;
    private List<Conservador> listaConservador;

    public Obra(int id, String autor, List<Conservador> listaConservador) {
        this.id = id;
        this.autor = autor;
        this.listaConservador = new ArrayList<>();
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Conservador> getListaConservador() {
        return listaConservador;
    }

    public void setListaConservador(List<Conservador> listaConservador) {
        this.listaConservador = listaConservador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Obra other = (Obra) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Obra{");
        sb.append("id=").append(id);
        sb.append(", autor=").append(autor);
        sb.append(", listaConservador=").append(listaConservador);
        sb.append('}');
        return sb.toString();
    }
}
