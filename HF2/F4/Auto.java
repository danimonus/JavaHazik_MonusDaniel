package F4;

/**
 * Egy autok modellezésére létrehozott osztály.
 */

import java.util.Date;
import java.util.Objects;

public class Auto {

private String rendszam;
private int motorTeljesitmeny;
private Date gyartasDatuma;

    public Auto(String rendszam, int motorTeljesitmeny) {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
        this.gyartasDatuma = new Date();
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyartasDatuma() {
        return gyartasDatuma;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "rendszam=" + rendszam + ", motorTeljesitmeny=" + motorTeljesitmeny + ", gyartasDatuma=" + gyartasDatuma;
    }

    
    /**
     * Equals metódus amely az autókat rendszam és gyártási dátum alapján hasonlitja össze.
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Auto)) {
            return false;
        }
        
        Auto a = (Auto) obj;
        
        return this.rendszam.equals(a.getRendszam()) && this.gyartasDatuma.equals(a.getGyartasDatuma());
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.rendszam);
        return hash;
    }

    



    
}
