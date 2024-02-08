package basesdemipais;

import javax.swing.JOptionPane;

public class vector {
    private int tam; // numero maximo de elementos
    private int cont; // numero de elementos almacenados
    private int cont2;
    private Object vector[];
    private static double pzona[] = { 1000, 2000, 1000, 4000, 4500, 500, 1500, 200 };
    private static String zonas[] = { "Sabaneta", "Envigado", "Itagui", "Poblado", "Caldas", "Manrique", "Belen",
            "Cristorey" };

    // ------------------------- Costructor -----------------------
    public vector(int tam) {
        this.tam = tam;
        cont = 0; // no hay elementos almacenados
        cont2 = 1;
        vector = new Object[this.tam]; // asigno el espacio de memoria al vector
    }

    public boolean Adicionar(Object data) {
        if (cont < tam) {
            vector[cont] = data;
            cont++;
            return true;
        }
        return false;
    }

    public int getCont() {
        return cont;
    }

    public Object getU(int i) {
        return vector[i];
    }

    public String Mostrar() {
        String text = "";
        for (int i = 0; i < cont; i++) {
            text = text + vector[i].toString() + "\n";
        }
        return text;
    }

    public propietario Buscar(int id) {
        for (int i = 0; i < cont; i++) {
            if (((propietario) vector[i]).getId() == id)
                return (propietario) vector[i];
        }
        return null;
    }

    public inmueble BuscarI(int codigo) {
        for (int i = 0; i < cont; i++) {
            if (((inmueble) vector[i]).getCodigo() == codigo)
                return (inmueble) vector[i];
        }
        return null;
    }

    public inmueble BuscarInmueble(int codigo) {
        for (int i = 0; i < cont; i++) {
            if (((inmueble) vector[i]).getCodigo() == codigo)
                return (inmueble) vector[i];
        }
        return null;
    }

    public boolean Eliminar(int codigo) {
        boolean var = false;
        for (int i = 0; i < cont; i++) {
            if (((inmueble) vector[i]).getCodigo() == codigo) {
                for (int j = i; j < cont - 1; j++) {
                    vector[j] = vector[j + 1];
                }
                vector[cont - 1] = null;
                cont--;
                var = true;
            }
        }
        return var;
    }

    public int codigo() {
        int codigo = 1;
        if (cont2 <= tam) {
            codigo = cont2;
            cont2++;
        } else {
            JOptionPane.showMessageDialog(null, "Error 500 consulte al administrador");
        }
        return codigo;
    }

    public static double defPrecio(String zona, double tamaño, String tipo) {
        double precio = 0;
        for (int i = 0; i < zonas.length; i++) {
            if (zona.equals(zonas[i])) {
                if ("Apartamento".equals(tipo)) {
                    precio = pzona[i] * tamaño;
                } else if ("Local".equals(tipo)) {
                    precio = ((pzona[i] * 0.15) + pzona[i]) * tamaño;
                } else if ("Parqueadero".equals(tipo)) {
                    precio = (pzona[i] / 2) * tamaño;
                }
            }
        }
        return precio;
    }

    public static String obtenerTipo(inmueble inmueble) {
        return String.valueOf(inmueble.getClass().getSimpleName());
    }

    public static String ganancia() {
        double gananciasT = 0;
        vector v = basesdemipais.Interfaces.interfazInicio.getVendidos();
        String cadena = "";

        for (int i = 0; i < v.getCont(); i++) {
            inmueble inmu = (inmueble) v.getU(i);
            double precio = inmu.getPrecio();
            double ganancia = precio * 0.03;
            gananciasT += ganancia;

        }
        cadena += "La ganancia de la constructora es: " + gananciasT;
        return cadena;

    }

    public static String porcentajes(vector inmueble, vector vendido) {
        int contA = 0;
        int contP = 0;
        int contVA = 0;
        int contL = 0;
        int contVL = 0;
        int contVP = 0;
        int totalVendido = vendido.getCont();
        int totalEnVenta = inmueble.getCont();
        int totalEsteSi = totalEnVenta + totalVendido;

        for (int i = 0; i < inmueble.getCont(); i++) {
            String tipo = obtenerTipo((inmueble) inmueble.getU(i));

            if ("apartamento".equals(tipo)) {
                contA += 1;
            } else if ("local".equals(tipo)) {
                contL += 1;
            } else if ("parqueadero".equals(tipo)) {
                contP += 1;

            }
        }
        for (int i = 0; i < vendido.getCont(); i++) {
            String tipo = obtenerTipo((inmueble) vendido.getU(i));
            if ("apartamento".equals(tipo)) {
                contVA += 1;
            } else if ("local".equals(tipo)) {
                contVL += 1;
            } else if ("parqueadero".equals(tipo)) {
                contVP += 1;
            }
        }

        double total1 = (100 / totalEsteSi);
        double pApartamentos = total1 * (contA + contVA);
        double pApartamentosEnVenta = total1 * (contA);
        double pApartamentosVendidos = total1 * (contVA);
        double pLocales = total1 * (contL + contVL);
        double pLocalesEnVenta = total1 * (contL);
        double pLocalesVendidos = total1 * (contVL);
        double pParqueaderos = total1 * (contP + contVP);
        double pParqueaderosEnVenta = total1 * (contP);
        double pParqueaderosVendidos = total1 * (contVP);

        String cadena = "\n El total de los inmuebles vendidos es: " + totalVendido
                + "\n El total de Inmuebles en venta es: " + totalEnVenta + "\n El porcentaje de Apartamentos es: "
                + pApartamentos
                + "\n El porcentaje de apartamentos en venta es: " + pApartamentosEnVenta
                + "\n El porcentaje de Apartamentos vendidos es:"
                + pApartamentosVendidos +
                "\n El porcentaje de Locales es: " + pLocales + "\n El porcentaje de Locales en venta es: "
                + pLocalesEnVenta + "\n El porcentaje de Locales Vendidos es:" + pLocalesVendidos +
                "\n El porcentaje de Parqueaderos es: " + pParqueaderos
                + "\n El porcentaje de Parqueaderos en venta es: "
                + pParqueaderosEnVenta + "\n El porcentaje de Parqueaderos Vendidos es:" + pParqueaderosVendidos
                + "\n \n $$$$$$" + ganancia();
        return cadena;
    }
}
