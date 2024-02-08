
package basesdemipais;

import javax.swing.JOptionPane;

public class BasesDeMiPais {

    public static void main(String[] args) {
        String menu[] = {"Registrar propietario", "Registrar propiedad", "Buscar propiedad", 
        "Filtrar propiedad", "Vender propiedad", "Eliminar inmueble", "Ver propietarios", "ver en la zona",
        "Porcentaje de ventas y vendidos", "Ganancia constructora", "salir"};
        String opcion;
        
        
        do {            
            opcion = (String)JOptionPane.showInputDialog(null, "Seleccione", "Menu", 1,null,menu,menu[0]);
            switch(opcion){
                case "Registrar propietario":
                    
                    break;
                case "Registrar propiedad":
                    
                    break;
                case "Buscar propiedad":
                    
                    break;
                case "Filtrar propiedad":
                    
                    break;
                case "Vender propiedad":
                    
                    break;
                case "Eliminar inmueble":
                    
                    break;
                case "Ver propietarios":
                    
                    break;
                case "ver en la zona":
                    
                    break;
                case "Porcentaje de ventas y vendidos":
                    
                    break;
                case "Ganancia constructora":
                    
                    break;
                case "salir":
                
                    break;
            }
        }while (!opcion.equals("salir"));
    }
}
