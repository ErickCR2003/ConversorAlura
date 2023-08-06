package controlador;

import static formato.formatoConversor.LimpiarEntradas;
import static modelo.SolesAMonedas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.conversor;

public class Ctrl_Conversor implements ActionListener {

    conversor vista;
    Ctrl_Bienvenida cB;
    double cant = 0;

    public Ctrl_Conversor(conversor CN, Ctrl_Bienvenida CB) {

        vista = CN;
        cB = CB;
        vista.jbtnConfirmar.addActionListener(this);
        vista.jbtnReiniciar.addActionListener(this);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.jbtnConfirmar) {
            int val = vista.jcbxMonedaAConvertir.getSelectedIndex();
            int monto = (int) vista.jspnCantidadMonedas.getValue();

            if (monto < 0) {
                JOptionPane.showMessageDialog(null, "<html><font face='Monospace'>"+ "Inserte una cantidad positiva.");
            } else {
                switch (val) {
                    case 0 -> {
                        cant = ConvertirSolesADolares(monto);
                        vista.jlblCantidadConvertida.setText("$ "+String.valueOf(cant));
                    }
                    case 1 -> {
                        cant = ConvertirSolesAEuros(monto);
                        vista.jlblCantidadConvertida.setText("€ "+String.valueOf(cant));
                    }
                    case 2 -> {
                        cant = ConvertirSolesAYen(monto);
                        vista.jlblCantidadConvertida.setText("¥ "+String.valueOf(cant));
                    }
                    case 3 -> {
                        cant = ConvertirSolesALibras(monto);
                        vista.jlblCantidadConvertida.setText("£ "+String.valueOf(cant));
                    }
                    case 4 -> {
                        cant = ConvertirSolesAYuan(monto);
                        vista.jlblCantidadConvertida.setText("¥ "+String.valueOf(cant));
                    }
                    case 5 -> {
                        cant = ConvertirSolesAMexicano(monto);
                        vista.jlblCantidadConvertida.setText("$ "+String.valueOf(cant));
                    }
                    default ->
                        throw new AssertionError();
                }
            }
        }

        if (e.getSource() == vista.jbtnReiniciar) {
            LimpiarEntradas(vista);
        }
    }

}
