/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalDate;

/**
 *
 * @author eduardo
 */
public  final class Temporal {
    
    private LocalDate FECINI;
    private LocalDate FECFIN;

    public LocalDate getFecIni() {
        return FECINI;
    }

    public LocalDate getFecFin() {
        return FECFIN;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temporal{");
        sb.append("fecIni=").append(FECINI);
        sb.append(", fecFin=").append(FECFIN);
        sb.append('}');
        return sb.toString();
    }
}
