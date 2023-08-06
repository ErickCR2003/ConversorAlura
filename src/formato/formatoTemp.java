
package formato;

import vista.conversor;
import vista.conversorTemp;

public class formatoTemp {
    
    public static void LimpiarEntradas(conversorTemp BV) {
        BV.jspnCantidadGrados.setValue(0);
        BV.jcbxGradosActual.setSelectedIndex(0);
        BV.jcbxGradosAConvertir.setSelectedIndex(0);
        BV.jlblGradosConvertidos.setText("0°");
    }
}
