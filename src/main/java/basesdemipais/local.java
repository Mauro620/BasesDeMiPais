// Clase hija que hereda la clase inmueble

package basesdemipais;

import java.util.Objects;


public class local extends inmueble {
    private String tipoNegocio;
    private String tipoSeguridad;
    
    
    // -------------- Constructor -------------------------
    public local(int codigo, propietario propietario, double tamaño, String ubicacion, double precio, String zona, String tipoNegocio, String tipoSeguridad) {
        super(codigo, propietario, tamaño, ubicacion, zona, precio);
        this.tipoNegocio = tipoNegocio;
        this.tipoSeguridad = tipoSeguridad;
        
    }
    
    // ----------------- Getter and Setter -----------------

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    public String getTipoSeguridad() {
        return tipoSeguridad;
    }

    public void setTipoSeguridad(String tipoSeguridad) {
        this.tipoSeguridad = tipoSeguridad;
    }
    
    // -------------------- toString -------------------------

    @Override
    public String toString() {
        return "Local: " + super.toString() + "\nTipo de negocio: " + tipoNegocio + "\nTipo de seguridad: " + tipoSeguridad;
    }
    
    // ------------------------ equals -----------------------

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
        final local other = (local) obj;
        if (!Objects.equals(this.tipoNegocio, other.tipoNegocio)) {
            return false;
        }
        return Objects.equals(this.tipoSeguridad, other.tipoSeguridad);
    }
    
}
