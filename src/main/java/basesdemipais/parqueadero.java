package basesdemipais;

import java.util.Objects;


public class parqueadero extends inmueble{
    private String tipoParqueadero;
    
    // --------------- Constructor ---------------------
    public parqueadero(int codigo, propietario propietario, double tamaño, String ubicacion, double precio, String zona, String tipoParqueadero) {
        super(codigo, propietario, tamaño, ubicacion, zona, precio);
        this.tipoParqueadero = tipoParqueadero;
    }
    
    // -------------------- Getter and Setter ----------------------

    public String getTipoParqueadero() {
        return tipoParqueadero;
    }

    public void setTipoParqueadero(String tipoParqueadero) {
        this.tipoParqueadero = tipoParqueadero;
    }
    
    // ---------------------- toString -----------------------

    @Override
    public String toString() {
        return "Parqueadero" + super.toString() + "\nTipo de parqueadero: " + tipoParqueadero;
    }
    
    // ---------------------- equals -------------------------

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
        final parqueadero other = (parqueadero) obj;
        return Objects.equals(this.tipoParqueadero, other.tipoParqueadero);
    }
    
}
