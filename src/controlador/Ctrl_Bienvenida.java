package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Bienvenida;
import vista.conversor;
import vista.conversorTemp;

public class Ctrl_Bienvenida implements ActionListener {

    Bienvenida vista;
    
    public static vista.conversor V_conv;
    public static Ctrl_Conversor C_conv;
    
    public static vista.conversorTemp V_temp;
    public static Ctrl_Temperatura C_temp;

    public Ctrl_Bienvenida(Bienvenida BV) {
        
        vista = BV;
        vista.jbtnMonedas.addActionListener(this);
        vista.jbtnTemperatura.addActionListener(this);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.jbtnMonedas) {
            V_conv = new conversor();
            C_conv = new Ctrl_Conversor(V_conv, this);
        }

        if (e.getSource() == vista.jbtnTemperatura) {
            V_temp = new conversorTemp();
            C_temp = new Ctrl_Temperatura(V_temp, this);
        }
    }

}
