package basesdemipais;

import java.util.Objects;

public abstract class inmueble {
    private int codigo;
    private propietario propietario;
    private Double tamaño;
    private String ubicacion;
    private String zona;
    private double precio;
    
    
    // --------------------- Constructor ------------------

    public inmueble(int codigo, propietario propietario, Double tamaño, String ubicacion, String zona, double precio) {
        this.codigo = codigo;
        this.propietario = propietario;
        this.tamaño = tamaño;
        this.ubicacion = ubicacion;
        this.zona = zona;
        this.precio = precio;
        
    }
    
    // --------------------- SETTER AND GETTER --------------------

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getZona(){
        return zona;
    }
    
    public void setZona(String zona){
        this.zona = zona;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(propietario propietario) {
        this.propietario = propietario;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    // ----------------- EQUALS --------------------

    @Override
    public int hashCode() {
        int hash = 7;
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
        final inmueble other = (inmueble) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.propietario, other.propietario)) {
            return false;
        }
        if (!Objects.equals(this.ubicacion, other.ubicacion)) {
            return false;
        }
        return Objects.equals(this.tamaño, other.tamaño);
    }
     // ------------------- toString ------------------------

    @Override
    public String toString() {
        return "\nCódigo: " + codigo + "\nPropietario: " + propietario + "\nTamaño: " + tamaño +" m^2" + "\nUbicación: " + ubicacion + "," + " "+ zona + "\nPrecio: " +"$ "+ precio;
    }
    
    // ------------------------------------------------------
    
}
