
package main;

import controlador.Ctrl_Bienvenida;
import vista.Bienvenida;

public class main {
    
    public static Bienvenida CV;
    public static controlador.Ctrl_Bienvenida CCV;
    
    public static void main(String[] args) {
        
        CV = new Bienvenida();
        CCV = new Ctrl_Bienvenida(CV);
        
    }
    
}
