/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package museo;

/**
 *
 * @author eduardo
 */
public  final class Fija {
    
    private String ESTADO;

    public String getEstado() {
        return ESTADO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fija{");
        sb.append("estado=").append(ESTADO);
        sb.append('}');
        return sb.toString();
    }

}
