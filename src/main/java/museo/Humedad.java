/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author eduardo
 */
public final class Humedad {
    
    final int MAX_HUM = 40;
    final int MIN_HUM = 10;

    public int getMAX_HUM() {
        return MAX_HUM;
    }

    public int getMIN_HUM() {
        return MIN_HUM;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Humedad{");
        sb.append("MAX_HUM=").append(MAX_HUM);
        sb.append(", MIN_HUM=").append(MIN_HUM);
        sb.append('}');
        return sb.toString();
    }
}
