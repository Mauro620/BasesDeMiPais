package basesdemipais;

import java.util.Objects;

public class apartamento extends inmueble {
    private int noHabitaciones;
    private int noClosets;
    private int noBanos;
    private String tipoPiso;
    private String tipoCocina;

    // ---------------------- Constructor -------------------------
    public apartamento(int codigo, propietario propietario, double tamaño, String ubicacion, String zona, double precio, int noHabitaciones, int noClosets, int noBanos, String tipoPiso, String tipoCocina) {
        super(codigo, propietario, tamaño, ubicacion, zona, precio);
        this.noHabitaciones = noHabitaciones;
        this.noClosets = noClosets;
        this.noBanos = noBanos;
        this.tipoPiso = tipoPiso;
        this.tipoCocina = tipoCocina;
    }
    // ---------------------- Getter and setter -----------------------------

    public int getNoHabitaciones() {
        return noHabitaciones;
    }

    public void setNoHabitaciones(int noHabitaciones) {
        this.noHabitaciones = noHabitaciones;
    }

    public int getNoClosets() {
        return noClosets;
    }

    public void setNoClosets(int noClosets) {
        this.noClosets = noClosets;
    }

    public int getNoBanos() {
        return noBanos;
    }

    public void setNoBanos(int noBanos) {
        this.noBanos = noBanos;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    // ----------------------- toString -----------------------

    @Override
    public String toString() {
        return "Apartamento: " + super.toString() + "\nNum. de habitaciones: " + noHabitaciones + " \nNum. de Closets: " + noClosets
                + "\nNum. de Baños: " + noBanos + "\nTipo de piso: " + tipoPiso + "\nTipo de cocina: " + tipoCocina;
    }

    // ------------------------ equals --------------------------

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
        final apartamento other = (apartamento) obj;
        if (this.noHabitaciones != other.noHabitaciones) {
            return false;
        }
        if (this.noClosets != other.noClosets) {
            return false;
        }
        if (this.noBanos != other.noBanos) {
            return false;
        }
        if (!Objects.equals(this.tipoPiso, other.tipoPiso)) {
            return false;
        }
        return Objects.equals(this.tipoCocina, other.tipoCocina);
    }

}
