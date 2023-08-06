
package formato;

import vista.conversor;

public class formatoConversor {
    
    public static void LimpiarEntradas(conversor BV) {
        BV.jspnCantidadMonedas.setValue(0);
        BV.jcbxMonedaActual.setSelectedIndex(0);
        BV.jcbxMonedaAConvertir.setSelectedIndex(0);
        BV.jlblCantidadConvertida.setText("S/. 0.00");
    }
    
}
