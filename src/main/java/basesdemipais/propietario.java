
package basesdemipais;

import java.util.Objects;


public class propietario {
    private int id;
    private String nombre;
    private String email;
    private int telefono;

    // ---------------------------- Constructor ---------------------------
    public propietario(int id, String nombre, String email, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
    
    // -------------------------- Getter and Setter ------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    // --------------------------- toString ---------------------------

    @Override
    public String toString() {
        return "\nPropietario: \n" + "    Cedula: " + id + "\n    Nombre: " + nombre + "\n    Email: " + email +  "\n    Teléfono: " + telefono ;
    }
    
    // --------------------------- equals ---------------------------

    @Override
    public int hashCode() {
        int hash = 3;
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
        final propietario other = (propietario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.telefono != other.telefono) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }
    
}
