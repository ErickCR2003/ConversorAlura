
package controlador;

import static formato.formatoTemp.LimpiarEntradas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static modelo.Temperatura.*;
import vista.conversorTemp;

public class Ctrl_Temperatura implements ActionListener {

    conversorTemp vista;
    Ctrl_Bienvenida cB;
    double cant = 0;
    
    public Ctrl_Temperatura(conversorTemp CT, Ctrl_Bienvenida CB) {
        
        vista = CT;
        cB = CB;
        vista.jbtnConfirmar.addActionListener(this);
        vista.jbtnReiniciar.addActionListener(this);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.jbtnConfirmar) {
            
            int grados = (int) vista.jspnCantidadGrados.getValue();
            
            if (vista.jcbxGradosActual.getSelectedIndex() == 0 && vista.jcbxGradosAConvertir.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "<html><font face='Monospace'>"+ "La tipo de medida en grados es la misma.");
            }
            if (vista.jcbxGradosActual.getSelectedIndex() == 1 && vista.jcbxGradosAConvertir.getSelectedIndex() == 1) {
                JOptionPane.showMessageDialog(null, "<html><font face='Monospace'>"+ "La tipo de medida en grados es la misma.");
            }
            if (vista.jcbxGradosActual.getSelectedIndex() == 2 && vista.jcbxGradosAConvertir.getSelectedIndex() == 2) {
                JOptionPane.showMessageDialog(null, "<html><font face='Monospace'>"+ "La tipo de medida en grados es la misma.");
            }
            if (vista.jcbxGradosActual.getSelectedIndex() == 0 && vista.jcbxGradosAConvertir.getSelectedIndex() == 1) {
                cant = ConvertirCelciusAFarenheit(grados);
                vista.jlblGradosConvertidos.setText("°F "+String.valueOf(cant));
            }
            if (vista.jcbxGradosActual.getSelectedIndex() == 0 && vista.jcbxGradosAConvertir.getSelectedIndex() == 2) {
                cant = ConvertirCelciusAKelvin(grados);
                vista.jlblGradosConvertidos.setText("K "+String.valueOf(cant));
            }
            if (vista.jcbxGradosActual.getSelectedIndex() == 1 && vista.jcbxGradosAConvertir.getSelectedIndex() == 0) {
                cant = ConvertirFarenheitACelcius(grados);
                vista.jlblGradosConvertidos.setText("°C "+String.valueOf(cant));
            }
            if (vista.jcbxGradosActual.getSelectedIndex() == 1 && vista.jcbxGradosAConvertir.getSelectedIndex() == 2) {
                cant = ConvertirFarenheitAKelvin(grados);
                vista.jlblGradosConvertidos.setText("K "+String.valueOf(cant));
            }
            if (vista.jcbxGradosActual.getSelectedIndex() == 2 && vista.jcbxGradosAConvertir.getSelectedIndex() == 0) {
                cant = ConvertirKelvinACelcius(grados);
                vista.jlblGradosConvertidos.setText("°C "+String.valueOf(cant));
            }
            if (vista.jcbxGradosActual.getSelectedIndex() == 2 && vista.jcbxGradosAConvertir.getSelectedIndex() == 1) {
                cant = ConvertirKelvinAFarenheit(grados);
                vista.jlblGradosConvertidos.setText("℉ "+String.valueOf(cant));
            }
            
        }
        
        if (e.getSource() == vista.jbtnReiniciar) {
            LimpiarEntradas(vista);
        }        
    }
}
    
    

