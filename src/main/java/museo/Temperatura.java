/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author eduardo
 */
final public class Temperatura {
    
    final int MAX_TEM = 80;
    final int MIN_TEM = -5;

    public int getMAX_TEM() {
        return MAX_TEM;
    }

    public int getMIN_TEM() {
        return MIN_TEM;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temperatura{");
        sb.append("MAX_TEM=").append(MAX_TEM);
        sb.append(", MIN_TEM=").append(MIN_TEM);
        sb.append('}');
        return sb.toString();
    }
}
